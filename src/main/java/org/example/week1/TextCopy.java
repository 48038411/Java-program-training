package org.example.week1;

import java.io.*;
import java.util.UUID;

/**
 * @author Grc
 */
public class TextCopy {
    public static void main(String[] args) {
        final String choose = "txt";
        File file = new File("E:\\花香\\0113.png");
        String startFileName = file.getName();
        String start = file.getPath();
        int position = startFileName.indexOf(".");
        System.out.println(start);
        //取得文件扩展名
        String suffixName = startFileName.substring(position+1);
        try {
            //若文件扩展名包含txt，则执行缓冲字符输入流
            if (suffixName.equals(choose)){
                BufferedReader br = new BufferedReader(new FileReader(start));
                BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\花香\\randomTextCopy2"+"."+suffixName));
                String line;
                while ((line = br.readLine())!=null){
                    bw.write(line);
                }
                bw.close();
                br.close();
            } else{
                BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(start));
                BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream("E:\\花香\\6"+"."+suffixName));
                int len;
                while ((len = fileInputStream.read())!=-1){
                    fileOutputStream.write(len);
                }
                fileOutputStream.close();
                fileInputStream.close();
            }
            System.out.println("拷贝成功");
        } catch (IOException e){
            System.out.println("拷贝失败");
        }
    }

}
