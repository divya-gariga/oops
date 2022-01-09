package com.zemoso.oopsconcepts;
class Bird{
    public void fly(){
        System.out.println("flying...");
    }
}
class Dove extends Bird{
    public void eat(){
        System.out.println("eating...");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dove bird=new Dove();
        bird.eat();
        bird.fly();
        Bird bird1=new Bird();
        bird1.fly();
        //bird1.eat();
    }
}
