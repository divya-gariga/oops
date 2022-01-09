package com.zemoso.oopsconcepts;
class Addition
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public String add(String a,String b)
    {
        return a+" "+b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Addition obj=new Addition();
        System.out.println("Adding two numbers : "+obj.add(1,2));
        System.out.println("Concatenate two strings : "+obj.add("divya","gariga"));
    }
}
