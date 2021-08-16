package com.company;

//This is our base classes that animals will inherit
public class Animal {
    private String name;
    private int size;
    private int weight;
    private int averageLifetime;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public int getAverageLifetime() {
        return averageLifetime;
    }

    public Animal(){

    }

    public Animal(String name, int size, int weight, int averageLifetime) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.averageLifetime = averageLifetime;
        System.out.println("Parent ctor");
    }

    public void eat(){
        System.out.println("Eating..");
    }

    public String makeSound(){
        return  "";
    }
}
