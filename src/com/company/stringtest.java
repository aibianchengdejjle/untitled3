package com.company;

import java.util.Scanner;

public class stringtest {
    public static  void main(String[]a)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String  s1=s.substring(0,2);
        String  s2=s.substring(1,s.length());
        s1=s1.toUpperCase();
        s2=s2.toLowerCase();
        String s3=s1+s2;
        System.out.println(s3);
        //String 类去穿字符串两端的空隔
        //String trim（）
        //按照指定符号切割字符串
        // String []Split(String str)
       /* String s4="jellopdadadawdcwqfwrgjfeaqgr";
        String []x=s4.split("a");
        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);
*/

    }
}
