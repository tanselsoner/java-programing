package day_57_Abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {
        Animal a1 = new Animal();//not polymorphic, data type and object type are same
        a1.makeNoise();
        //polymorphic way
        //parent type =  new child type
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal cat = new Cat();
        //List list = new arrayList();
        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();

        //polymorphic list of objects. list data type is parent class.
        //objects are any of child classes
        List<Animal> listOfanimals=new ArrayList<>();
        listOfanimals.add(new Dog());
        listOfanimals.add(new Dog());
        listOfanimals.add(new Horse());
        listOfanimals.add(new Cat());
        for(Animal each: listOfanimals){
            each.makeNoise();
        }


    }
}
