package com.appnetics;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name,int size, int weight,int eyes,int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("This is called from the eat method that is in the Dog class, this has been overriden from the supper class;the Animal class");
        chew();
        super.eat();
    }

    private void chew(){
        System.out.println("This is called from the dog class, the chew method");
    }


    public void walk(){
        System.out.println("This is the walk method from the dog class");
        move(5);

    }

    public void run(){
        System.out.println("This is the run method from the dog class");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("This is the move legs method from the Dogs class");
    }

    @Override
    public void move(int speed) {
        System.out.println("The move method from the Dog class, called");
        moveLegs(speed);
        super.move(speed);
    }
}
