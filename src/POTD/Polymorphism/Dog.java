package POTD.Polymorphism;

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void move() {
        System.out.println("The dog jumped");
    }
}

