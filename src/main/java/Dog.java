public class Dog extends Animal {
    public Dog(String name) {

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof!");
    }

    @Override
    public boolean eat(String foodType) {
        return super.eat(foodType);
    }
}
