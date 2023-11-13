public class Cat extends Animal{
    public Cat (String name) {

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow!");
    }

    @Override
    public boolean eat(String foodType) {
        return super.eat(foodType);
    }

    @Override
    public void mood(Boolean humør) {
        super.mood(humør);
        if (humør) {
            System.out.println("Katten spinder");
        } else {
            System.out.println("Katten hvæser");
        }
    }
}
