package com.company;

public class Cat {
private String name;
private String color;
private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
public void jump(){
    System.out.println(name +" to jump");
}
public void sleep(){
    System.out.println(name +" to sleep");
    }
public void eat(){
    System.out.println(name +"  eats");
}

}
