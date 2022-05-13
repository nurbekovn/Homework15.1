package com.company;

//  Animal деген класс тузунуз жана бир метод кошунуз.
//  Анын 3 наследнигин тузунуз.
//  Shark деген класска attack(), Turtle деген класска swim()
//  жана Eagle деген класска fly() методторун тузосуз.
//  Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
//  кошунуз.
//  instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын
//  оздорунун методдорун чыгарыныз.
//  Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
//  болуп оз озунун массивине салыныз

import com.company.peaksoft.Animal;
import com.company.peaksoft.Eagle;
import com.company.peaksoft.Shark;
import com.company.peaksoft.Turtle;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {new Eagle(), new Turtle(), new Shark(), new Animal()};


//        Animal eagle = new Eagle();
//        Animal turtle = new Turtle();
//        Animal shark = new Shark();


        Animal [] animals1 = new Animal[1];
        Eagle[] eagles = new Eagle[1];
        Turtle[] turtles = new Turtle[1];
        Shark[] sharks = new Shark[1];

        for (Animal animal : animals) {
            if (animal instanceof Eagle) {
                System.out.println(" Eagle inheritance of Animal and "+ animal);
                eagles[0] = (Eagle) animal;
                ((Eagle) animal).fly();
                System.out.println(animal.getClass());
            }
        }

        System.out.println();

        for (Animal animal : animals) {
            if (animal instanceof Turtle) {
                System.out.println("Turtle inheritance of Animal and "+ animal);
                turtles[0] = (Turtle) animal;
                ((Turtle) animal).swim();
                System.out.println(animal.getClass());
            }
        }

        System.out.println();

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                System.out.println("Shark inheritance of Animal and " + animal);
                sharks[0] = (Shark) animal;
                ((Shark) animal).attack();
                System.out.println(animal.getClass());
            }
        }
    }
}



//        for (Animal animal : animals) {
//            if (animal instanceof Eagle) {
//                System.out.println(animal + " is inheritance of Animal and " + animal);
//                ((Eagle) animal).fly();
//                System.out.println(animal.getClass());
//
//
//            } else if (animal instanceof Shark) {
//                System.out.println(animal + " is inheritance of Animal  and " + animal);
//                ((Shark) animal).attack();
//                System.out.println(animal.getClass());
//
//            } else if (animal instanceof Turtle) {
//                System.out.println(animal + " is inheritance of Animal   and " + animal);
//                ((Turtle) animal).swim();
//                System.out.println(animal.getClass());
//            }
//    }
