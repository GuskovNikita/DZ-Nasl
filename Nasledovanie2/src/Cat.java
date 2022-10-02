public class Cat extends Animal {
    String color, breed;
    public Cat(String color, String breed,String food, String location) {
        super(food, location);
        this.color = color;
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }
}