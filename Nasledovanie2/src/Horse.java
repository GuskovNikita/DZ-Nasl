public class Horse extends Animal {
    String color, breed;
    public Horse(String color, String breed,String food, String location) {
        super(food, location);
        this.color = color;
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("I-go-go");
    }

    @Override
    public void eat() {
        System.out.println("Horse eat");
    }
}