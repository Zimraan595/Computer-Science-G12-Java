package POTD.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog(),
                new Cat()
        };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}

