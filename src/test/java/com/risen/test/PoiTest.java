package com.risen.test;

import org.apache.poi.hpsf.extractor.HPSFPropertiesExtractor;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * <b>时间:</b> <i>2019-12-28 17:21</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.risen.test}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class PoiTest {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream(new File("C:\\Users\\Fawda\\Desktop\\222.docx"));
            HWPFDocument hwpfDocument = new HWPFDocument(is);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
