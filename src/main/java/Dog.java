public class Dog extends Animal {
    public Dog(String name) {

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof!");
    }
}
