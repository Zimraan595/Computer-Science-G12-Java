package POTD.Polymorphism;

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }

    @Override
    public void move() {
        System.out.println("The cow moves slowly");
    }
}
