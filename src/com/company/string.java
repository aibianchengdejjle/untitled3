package com.company;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.Scanner;
/*
* String 类的转换类型
* char[]toCharArray();  把字符串转换为字符数组
* String toLowerCase(); 把字符串换成小写
* String toUpperCase(); 把字符川换成大写
* */
public class string {
    public static  void main(String []a)
    {
        //方式一 String 把字符串数据封装成字符对象
        String  s=new String("fafafa");
        System.out.println(s);
        System.out.println("-----");
        //方式二 把字符数组的数据封装成字符串对象
        Scanner sc=new Scanner(System.in);
        char []q=new char[5];
        for(int i=0;i<5;i++)
        {
            q[i]=s.charAt(i);
        }
        String s2=new String(q);
        System.out.println(s2);
        System.out.println("-----");
            //方式三 传入部分数据封装成字符串对象
        String s3=new String(q,1,3);
        System.out.println(s3);
        String s4="hellop";
        String s5="HELLPO";
        System.out.println(s4.equals(s5));
        //字符串的转换
        char []e=s5.toCharArray();
        for(int i=0;i<e.length;i++)
        {
            System.out.print(e[i]);
        }
        System.out.println();
        System.out.println("-------");

        System.out.println(s5.toLowerCase());
    }
}
