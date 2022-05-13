package com.company.peaksoft;

public class Eagle extends Animal {

    public void fly(){
        System.out.println(" method - can fly ");
    }
    @Override
    public void eat() {
        System.out.println("Eagle eat");
    }

    @Override
    public String toString() {
        return "Eagle";
    }
}
