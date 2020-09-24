package com.company;
/*
*  capacity是返回当前的容量的
* */
public class stringbulider {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append("jello");
        s.reverse();
        System.out.println(s);
        String s1=s.toString();
        System.out.println(s1);
    }

}
