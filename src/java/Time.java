package java;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Time {
    public static void main(String[] args) throws Exception{
        writeDate();
        readProperties("C:\\Users\\98628\\Desktop\\properties.txt");
    }
    public static void writeDate(){
        try {
            //设置日期格式并输出
            SimpleDateFormat nowDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = nowDate.format(new Date());
            //System.out.println(date);
            File pathname = new File("C:\\Users\\98628\\Desktop\\date.txt");
            if(!pathname.exists()){
                pathname.createNewFile();
            }
            BufferedWriter out = new BufferedWriter(new FileWriter(pathname));
            out.write(date); // 写入date
            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件
            String hostTime = date;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void readProperties(String name){
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(name);
            BufferedReader bf = new BufferedReader(fr);
            String line;
            while((line = bf.readLine()) != null){
                arrayList.add(line);
            }
            bf.close();
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(arrayList);
    }
}

