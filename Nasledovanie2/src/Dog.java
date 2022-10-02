public class Dog extends Animal {
    String color, breed;
    public Dog(String color, String breed,String food, String location) {
        super(food, location);
        this.color = color;
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}