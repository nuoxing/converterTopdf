/*
 * 文件名：ConverterByAspose.java
 * 版权：Copyright by www.chinauip.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年10月12日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.test.docTodpf;

import java.io.File;

import com.aspose.words.Document;
import com.aspose.words.FontSettings;

/**
 * 
 * 样式比 doxc4j的好，效率还行
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2017年10月12日
 * @see ConverterByAspose
 * @since
 */
public class ConverterByAspose
{

    public ConverterByAspose()
    {
        // TODO Auto-generated constructor stub
    }
    
    public static void main(String[] args) throws Exception
    {
      //doc路径
        Document document = new Document("E:/验收文档/登记业务全城通办配套软件采购项目 概要设计说明书V1.20.docx");
        //pdf路径
        File outputFile = new File("F:/document.pdf");
      //设置一个字体目录
        FontSettings.setFontsFolder("/home/server/fonts", false);

        //设置多个字体目录
        FontSettings.setFontsFolders(new String[] {"/home/server/fonts1", "/home/server/fonts2"}, true);
        //操作文档保存
        document.save(outputFile.getAbsolutePath(), com.aspose.words.SaveFormat.PDF);
    }

}
