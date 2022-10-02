public class Main {
    public static void main(String[] main) {
        Veterinarian vet = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("black", "German shepherd", "Meat", "Aviary №1");
        animals[1] = new Cat("Lilac-point", "Scottish fold", "Cat food", "Cage №3");
        animals[2] = new Horse("Chestnut", "Mustang", "Hay", "Stall №5");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
