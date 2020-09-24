package com.company;

import java.util.Scanner;

public class studentdemo {
    public  static  void main(String[]A)
    {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String q=sc.next();
      /*  s.setAge(a);
        s.setName(q);
       System.out.println(s.getName()+"-------"+s.getAge());*/
        student s=new student(a);
        s.show();
        student s2=new student(q);
        s2.show();
        student s3=new student(a,q);
        s3.show();

    }

}
