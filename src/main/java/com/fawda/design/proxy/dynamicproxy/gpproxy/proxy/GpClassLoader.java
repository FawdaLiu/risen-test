package com.fawda.design.proxy.dynamicproxy.gpproxy.proxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <b>时间:</b> <i>2020-03-03 01:01</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.proxy.dynamicproxy.gpproxy.proxy}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class GpClassLoader extends ClassLoader {
    private File filePath;

    public GpClassLoader() {
        String path = GpClassLoader.class.getResource("").getPath();
        filePath = new File(path);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = GpClassLoader.class.getPackage().getName() + "." + name;
        if (filePath != null) {
            File file = new File(filePath, name.replaceAll("\\.", "/") + ".class");
            if (file.exists()) {
                try {
                    FileInputStream in = new FileInputStream(file);
                    ByteArrayOutputStream out = new ByteArrayOutputStream();
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = in.read(bytes)) != -1){
                        out.write(bytes, 0, len);
                    }
                    return defineClass(className, out.toByteArray(), 0, out.size());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
