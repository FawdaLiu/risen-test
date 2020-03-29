package com.risen.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <b>时间:</b> <i>2020-01-06 23:15</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.risen.test}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class GetChannel {
    public static final int BSIZE = 1024;
    public static void main(String[] args) throws Exception {
        /*FileChannel fc = new FileOutputStream("data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();

        fc = new RandomAccessFile("data.txt", "rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();*/

        FileChannel fc = new FileInputStream("data.txt").getChannel();
//        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        ByteBuffer buffer = ByteBuffer.allocateDirect(BSIZE);
        fc.read(buffer);
        buffer.flip();
        if (buffer.hasRemaining()) {
            System.out.println(new String(buffer.array()));
        }

    }
}
