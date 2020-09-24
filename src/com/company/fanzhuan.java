package com.company;

import java.util.Scanner;

public class fanzhuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        String result=fanzhuan(S);
        System.out.println(result.equals(S));
    }
    public static String fanzhuan(String s)
    {
        StringBuilder s1=new  StringBuilder(s);
        s1.reverse();
        String s2=s1.toString();
        return s2;
    }
}
