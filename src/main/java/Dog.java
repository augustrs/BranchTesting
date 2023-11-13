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

    @Override
    public void mood(Boolean humør) {
        super.mood(humør);
        if (humør) {
            System.out.println("Hunden logrer med halen");
        } else {
            System.out.println("Hunden knurrer");
        }
    }
    @Override
    public void jump(double distance) {
        System.out.println("The dog jumps: " + distance +" meters");
    }
}
