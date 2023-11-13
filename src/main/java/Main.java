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

        System.out.println("Kattens humør: \n");
        cat.mood(true);
        cat.mood(false);

        System.out.println("\nHundens humør: \n");
        dog.mood(true);
        dog.mood(false);

        System.out.println("Stash implemented");
    }


}
