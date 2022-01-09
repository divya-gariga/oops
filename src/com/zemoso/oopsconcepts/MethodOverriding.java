package com.zemoso.oopsconcepts;
class Animal{
    public void run()
    {
        System.out.println("Animal is running");
    }
}
class Dog extends Animal{
    public void run()
    {
        System.out.println("Dog is running");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.run();
        Animal animal=new Animal();
        animal.run();
        Animal animal1=new Dog();
        animal1.run();
    }
}
