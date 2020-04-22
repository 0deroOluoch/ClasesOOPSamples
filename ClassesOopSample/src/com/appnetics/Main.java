package com.appnetics;

public class Main{

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Skippy",8,20,2,4,1,22,"Long Silky");
        dog.eat();
        dog.walk();
        dog.run();
        Vehicle isuzu = new Vehicle("pickUp",4,4,"KBK 9323D");

        isuzu.move(34);

    }
}
