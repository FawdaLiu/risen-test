package com.gupaoedu.vip.design.proxy.dynamicproxy.jdkproxy;


import sun.misc.ProxyGenerator;

import javax.tools.FileObject;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        JdkMeiPo jdkMeipo = new JdkMeiPo();
        IPerson zhangsan = jdkMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});

        try {
            FileOutputStream out = new FileOutputStream("D://$Proxy0.class");
            out.write(bytes);
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
