package com.company;

public class student {
    private String name;
    private  int age;
   public  void show()
    {
        System.out.println(name+"-----"+age);
    } /*
    public  void setAge(int age)
    {

        this.age=age;
    }
    public  int getAge()
    {

        return age;
    }
    public void setName(String name)
    {
       this.name=name;
    }
    public  String getName()
    {
        return  name;
    }
    */
     public student()
     {

     }
     public  student(int age)
     {
         this.age=age;
     }
     public student(String s)
     {
         this.name=s;
     }
     public student(int a,String s)
     {
         this.age=a;
         this.name=s;
     }
}
