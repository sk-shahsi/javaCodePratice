package com.java.coreTest;

public interface Test7{
    void sound();
}
class Dog implements  Test7{

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}
class  Cat implements Test7{

    @Override
    public void sound() {
        System.out.println("Mew");
    }
}
interface AnimalFactory{
    Test7 createAnimal();
}
class DogFactory implements AnimalFactory{

    @Override
    public Test7 createAnimal() {
        return new Dog();
    }
}
class catFactory implements AnimalFactory{

    @Override
    public Test7 createAnimal() {
        return new Cat();
    }
}
class TestFactory{
    public static void main(String[] args) {
        AnimalFactory dogfactory = new DogFactory();
        Test7 dog = dogfactory.createAnimal();
        dog.sound();

        AnimalFactory catfactory= new catFactory();
        Test7 cat= catfactory.createAnimal();
        cat.sound();
    }
}
