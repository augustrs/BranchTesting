public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Walter");
        Cat cat = new Cat("Mis");

        System.out.println("The sounds of the animals:");
        cat.makeSound();
        System.out.println();
        dog.makeSound();
        dog.eat("Cockroach");
        cat.eat("Smelly tuna");
        
    }



}
