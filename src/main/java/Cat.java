public class Cat extends Animal{
    public Cat (String name) {

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow!");
    }
}
