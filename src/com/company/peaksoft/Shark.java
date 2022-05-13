package com.company.peaksoft;

public class Shark extends Animal {
    public void attack(){
        System.out.println(" method - can attack");
    }

    @Override
    public void eat() {
        System.out.println("Shark eat");
    }

    @Override
    public String toString() {
        return "Shark";
    }
}
