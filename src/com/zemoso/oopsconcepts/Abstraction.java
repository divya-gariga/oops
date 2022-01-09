package com.zemoso.oopsconcepts;
abstract class Shape{
    public void draw()
    {
        System.out.println("drawing");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("drawing circle");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape rectangle=new Rectangle();
        rectangle.draw();
    }
}
