package com.zemoso.oopsconcepts;

class Student {
  private int rollNo;
  private String name;
  public void setRollNo(int rollNo){
      this.rollNo=rollNo;
    }
    public int getRollNo(){
      return rollNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setRollNo(1);
        student1.setName("Divya");
        System.out.println("the student roll no is "+student1.getRollNo());
        System.out.println("the student name is "+student1.getName());
    }
}
