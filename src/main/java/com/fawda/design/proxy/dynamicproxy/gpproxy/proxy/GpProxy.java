package com.fawda.design.proxy.dynamicproxy.gpproxy.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>时间:</b> <i>2020-03-03 00:59</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.proxy.dynamicproxy.gpproxy.proxy}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class GpProxy {
    public static final String ln = "\r\n";

    public static Object newProxyInstance(GpClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h) {
        try {
            //动态生成源代码
            String src = generateSrc(interfaces);
            //文件输出到磁盘
            String path = GpProxy.class.getResource("").getPath();
            File file = new File(path + "$Proxy0.java");
            byte[] bytes = new byte[1024];
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();
            //编译源代码
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null, null, null, null, null, iterable);
            task.call();
            manager.close();
            //加载到jvm
            Class<?> aClass = loader.findClass("$Proxy0");
            Constructor<?> constructor = aClass.getConstructor(GpInvocationHandler.class);
            file.delete();
            //返回字节码重组后新的代理对象
            return constructor.newInstance(h);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append(GpProxy.class.getPackage()).append(";").append(ln);
        sb.append("import ").append(interfaces[0].getName()).append(";").append(ln);
        sb.append("import java.lang.reflect.*;").append(ln);
        sb.append("public final class $Proxy0 implements ").append(interfaces[0].getName()).append(" {").append(ln);
        sb.append("GpInvocationHandler h;").append(ln);
        sb.append("public $Proxy0(GpInvocationHandler h) {").append(ln);
        sb.append("    ").append("this.h = h;").append(ln);
        sb.append("}").append(ln);
        for (Method m : interfaces[0].getMethods()) {
            Class<?>[] params = m.getParameterTypes();
            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();
            for (int i = 0; i < params.length; i++) {
                Class clazz = params[i];
                String type = clazz.getName();
                String paramName = toLowerFirstCase(clazz.getSimpleName());
                paramNames.append(type).append(" ").append(paramName);
                paramValues.append(paramName);
                paramClasses.append(clazz.getName()).append(".class");

                if(i > 0 && i < params.length-1){
                    paramNames.append(",");
                    paramClasses.append(",");
                    paramValues.append(",");
                }
            }

            sb.append("public final ").append(m.getReturnType().getName()).append(" ")
                    .append(m.getName()).append(" (").append(paramNames.toString())
                    .append(") {").append(ln);
            sb.append("    ").append("try {").append(ln)
                    .append("        ").append("Method m = ").append(interfaces[0].getName()).append(".class.getMethod(\"")
                    .append(m.getName()).append("\", ").append("new Class[]{").append(paramClasses.toString()).append("});").append(ln)
                    .append("        ").append(hasReturnValue(m.getReturnType())?"return (" + m.getReturnType().getName() + ")":"")

                    .append(getCaseCode("this.h.invoke(this, m, new Object[] {"+ paramValues +"})", m.getReturnType())).append(";").append(ln)
                    .append("    ").append("} catch(Error _ex) {").append(ln)
                    .append("    ").append("} catch(Throwable throwable) {").append(ln)
                    .append("        ").append("throw new UndeclaredThrowableException(throwable);").append(ln)
                    .append("    ").append("}").append(ln)
                    .append("    ").append(getReturnEmptyCode(m.getReturnType())).append(ln);
            sb.append("}").append(ln);

        }
        sb.append("}").append(ln);
        return sb.toString();
    }

    private static String toLowerFirstCase(String paramType) {
        char[] chars = paramType.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }

    private static boolean hasReturnValue(Class<?> clazz) {
        return clazz != void.class;
    }

    private static Map<Class,Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class,Integer.class);
    }

    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class){
            return "";
        }else {
            return "return null;";
        }
    }

    private static String getCaseCode(String code,Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "((" + mappings.get(returnClass).getName() +  ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }
}
