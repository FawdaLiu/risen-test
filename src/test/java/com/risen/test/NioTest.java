package com.risen.test;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;

/**
 * <b>时间:</b> <i>2020-01-07 10:44</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.risen.test}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class NioTest {

    @Parameterized.Parameters
    public char[] getCharArrays() {
        char[] charArray = new char[]{'a','b','c','d','e'};
        return charArray;
    }

    @Parameterized.Parameters
    public byte[] getByteArrays() {
        byte[] bytes = new byte[]{1, 2, 3};
        return bytes;
    }

    @Test
    public void charBuffer_capacity_limit_test() {
        CharBuffer cf = CharBuffer.wrap(getCharArrays());
        System.out.printf("A capacity:%s,limit:%s", cf.capacity(), cf.limit());
        cf.limit(3);
        System.out.println();
        //System.out.printf("B capacity:%s,limit:%s", cf.capacity(), cf.limit());
        cf.put(0, 'o');
        cf.put(1, 'p');
        cf.put(2, 'q');
        cf.put(3, 'r');
        cf.put(4, 's');
        cf.put(5, 't');
        cf.put(6, 'u');
    }

    @Test
    public void charBuffer_position_test() {
        char[] paramaters = getCharArrays();
        CharBuffer cf = CharBuffer.wrap(paramaters);
        System.out.printf("A capacity:%s, limit:%s, position:%s", cf.capacity(), cf.limit(), cf.position());
        System.out.println();
        cf.position(2);
        System.out.printf("B capacity:%s, limit:%s, position:%s", cf.capacity(), cf.limit(), cf.position());
        System.out.println();
        cf.put('z');
        for (int i = 0; i < paramaters.length; i++) {
            System.out.println(paramaters[i]+"");
        }
    }

    @Test
    public void charBuffer_remaining_test() {//剩余空间
        char[] paramaters = getCharArrays();
        CharBuffer cf = CharBuffer.wrap(paramaters);
        System.out.printf("A capacity:%s, limit:%s, position:%s, remaining:%s", cf.capacity(), cf.limit(), cf.position(), cf.remaining());
        System.out.println();
        cf.position(5);
        System.out.printf("B capacity:%s, limit:%s, position:%s, remaining:%s", cf.capacity(), cf.limit(), cf.position(), cf.remaining());
        System.out.println();
        //System.out.printf("C remaining:%s", cf.remaining());
    }

    @Test
    public void byteBuffer_mark_test() {//设置标记
        //缓冲区中的mark有些类似于探险或爬山时在关键路口设置"路标"，目的是在原路返回时找到回去的路。
        ByteBuffer bf = ByteBuffer.wrap(getByteArrays());
        System.out.printf("capacity:%s", bf.capacity());
        System.out.println();
        bf.position(1);
        bf.mark();//标记
        System.out.printf("position:%s", bf.position());
        bf.position(2);//改变位置
        bf.reset();//重置
        System.out.println();
        System.out.printf("position:%s", bf.position());
    }

    @Test
    public void position_limit_test() {
        byte[] bys = new byte[]{1, 2, 3};
        ByteBuffer bf = ByteBuffer.wrap(bys);
        bf.position(2);
        bf.mark();
        bf.flip();
        System.out.println("position:"+bf.position());
        System.out.println("limit"+bf.limit());
        try {
            bf.reset();
        } catch (InvalidMarkException e) {
            System.out.println("bf mark丢失！");
        }

    }

    // 向缓冲区中写入数据，下一步读取缓冲区中的数据之前调用
    @Test
    public void filp_handle_test() {//测试手动设置position从缓冲区中读写数据
        CharBuffer cf = CharBuffer.allocate(20);
        System.out.printf("A position:%s, limit:%s", cf.position(), cf.limit());
        System.out.println();
        cf.put("中华人民共和国！");
        System.out.printf("B position:%s, limit:%s", cf.position(), cf.limit());
        System.out.println();
        cf.position(0);
        System.out.printf("C position:%s, limit:%s", cf.position(), cf.limit());
        System.out.println();
        for (int i = 0; i < cf.limit(); i++) {
            System.out.print(cf.get());
        }
        System.out.println();
        //上面代码错误读取
        //下面代码错误读取
        System.out.printf("D position:%s, limit:%s", cf.position(), cf.limit());
        //还原缓存区
        cf.clear();
        System.out.printf("E position:%s, limit:%s", cf.position(), cf.limit());
        System.out.println();
        //继续写入
        cf.put("我是中国人！");
        System.out.printf("F position:%s, limit:%s", cf.position(), cf.limit());
//        cf.limit(cf.position());
//        cf.position(0);
        cf.flip();//设置limit、position
        System.out.println();
        System.out.printf("G position:%s, limit:%s", cf.position(), cf.limit());
        System.out.println();
        for (int i = 0; i < cf.limit(); i++) {
            System.out.print(cf.get());
        }


    }

    @Test
    public void handle_clean_test() throws InterruptedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("A");
        ByteBuffer buffer = ByteBuffer.allocateDirect(Integer.MAX_VALUE);
        System.out.println("B");
        byte[] bs = new byte[]{1};
        System.out.println(Integer.MAX_VALUE);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            buffer.put(bs);
        }
        System.out.println("put end!");
        Thread.sleep(1000);
        Method cleaner = buffer.getClass().getMethod("cleaner");
        cleaner.setAccessible(true);
        Object invoke = cleaner.invoke(buffer);
        Method clean = invoke.getClass().getMethod("clean");
        clean.setAccessible(true);
        clean.invoke(invoke);
    }

    @Test
    public void get_test() {
        ByteBuffer allocate = ByteBuffer.allocate(10);
        System.out.println("A1 capacity="+allocate.capacity()+" limit="+allocate.limit() + " position="+allocate.position());
        allocate.put((byte)125);
        System.out.println("A2 capacity="+allocate.capacity()+" limit="+allocate.limit() + " position="+allocate.position());
        allocate.put((byte)126);
        System.out.println("A3 capacity="+allocate.capacity()+" limit="+allocate.limit() + " position="+allocate.position());
        allocate.put((byte)127);
        System.out.println("B capacity="+allocate.capacity()+" limit="+allocate.limit() + " position="+allocate.position());
        allocate.rewind();
        System.out.println("C capacity="+allocate.capacity()+" limit="+allocate.limit() + " position="+allocate.position());
        System.out.println(allocate.get());
        System.out.println("E capacity="+allocate.capacity()+" limit="+allocate.limit() + " position="+allocate.position());
        System.out.println(allocate.get());
        System.out.println("F capacity="+allocate.capacity()+" limit="+allocate.limit() + " position="+allocate.position());
        System.out.println(allocate.get());
        byte[] array = allocate.array();
        for (int i = 0; i < array.length; i++) {
            System.out.printf(allocate.get(i)+"-");
        }

    }

    @Test
    public void get_area_test() {
        byte[] byteArray1 = {1,2,3,4,5,6,7,8};
        byte[] byteArray2 = {55,56,57,58};
        ByteBuffer allocate = ByteBuffer.allocate(10);
        allocate.put(byteArray1);
        allocate.position(2);
        allocate.put(byteArray2, 1, 3);
        System.out.println("A =");
        byte[] array = allocate.array();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        allocate.position(1);
        byte[] byteArrayOut = new byte[allocate.capacity()];
        allocate.get(byteArrayOut, 3, 4);
        System.out.println("B=");
        for (int i = 0; i < byteArrayOut.length; i++) {
            System.out.print(byteArrayOut[i] + " ");
            
        }
    }

    @Test
    public void test5_6() {//从缓冲区获取数据时，有可能获取多或取少的情况
        byte[] byteArray = {1,2,3,4,5,6,7,8,9,10,11,12};
        ByteBuffer wrap = ByteBuffer.wrap(byteArray);
        byte[] bytes = new byte[5];
        while (wrap.hasRemaining()) {
            int min = Math.min(wrap.remaining(), bytes.length);
            wrap.get(bytes, 0, min);
            for (int i = 0; i < min; i++) {
                System.out.print(bytes[i] + " ");
            }
            System.out.println();
        }
    }

    //如果在使用get(byte[] dst)方法的过程中，出现字节数组的length大于或等于或者小于或等于缓冲区的remaining时，那么也要进行特殊处理
    @Test
    public void test4_5() {
        byte[] byteArray = {1,2,3,4,5,6,7,8,9,10};
        ByteBuffer allocate = ByteBuffer.allocate(4);
        int currentIndex = 0;
        int remainIndex = 0;
        while (currentIndex < byteArray.length) {
            remainIndex = byteArray.length - currentIndex;
            int readLength = Math.min(remainIndex, allocate.remaining());
            //byte[] bytes = Arrays.copyOfRange(byteArray, currentIndex, currentIndex + readLength);
            allocate.put(byteArray, currentIndex, readLength);
            allocate.flip();
            byte[] array = allocate.array();
            for (int i = 0; i < allocate.limit(); i++) {
                System.out.print(array[i] + " ");
            }
            allocate.clear();
            currentIndex = currentIndex + readLength;
        }
    }

    @Test
    public void test8() {
        ByteBuffer allocate = ByteBuffer.allocate(10);
        allocate.putLong(1L);
        System.out.println(allocate.position());
    }

    @Test
    public void test9() throws UnsupportedEncodingException {
        byte[] bytes = "我是中国人".getBytes("GBK");
        System.out.println(Charset.defaultCharset().name());
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        CharBuffer decode = Charset.forName("GBK").decode(wrap);
        System.out.println(wrap.getClass().getName());
        System.out.println(decode.getClass().getName());
        System.out.printf("B capacity=%s position=%s limit=%s", wrap.capacity(), wrap.position(), wrap.limit());
        System.out.println();
        System.out.printf("C capacity=%s position=%s limit=%s", decode.capacity(), decode.position(), decode.limit());
        System.out.println();
        for (int i = 0; i < decode.limit(); i++) {
            System.out.print(decode.get() + " ");
        }
    }

    @Test
    public void test10() throws UnsupportedEncodingException {
        byte[] bytes = "我是中国人".getBytes("utf-16BE");
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        CharBuffer charBuffer = wrap.asCharBuffer();
        wrap.put(2, "为".getBytes("utf-16BE")[0]);
        wrap.put(3, "为".getBytes("utf-16BE")[1]);
        charBuffer.clear();
        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get() + " ");
        }
    }

    @Test
    public void test11() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("");
    }
}
