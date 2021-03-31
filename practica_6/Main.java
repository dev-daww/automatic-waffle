public class Main {
    public static void main(String[] args) {
        // Animal someAnimal = new Animal("shagy", 21);
        // Dog aDog = new Dog("otro nomre de perro", 21);
        // Animal anotherAnimal = new Dog("scooby", 2);

        Animal[] animalArray = new Animal[5];
        animalArray[0] = new Animal("An animal", 1);
        animalArray[1] = new Dog("A dog", 3);
        animalArray[2] = new Cat("A cat", 7);
        animalArray[3] = new Bird("A bird", 3);
        animalArray[4] = new Lizard("A lizard", 1);

        Veterinarian veterinarian = new Veterinarian("John", 3211.00);


        for (Animal a: animalArray) {
            a.eat();
            if (a instanceof Dog) {
                ((Dog) a).bark();
                ((Dog) a).getClean();
                veterinarian.shower(a, 0);
                ((Dog) a).getClean();
            }
            if (a instanceof Bird) {
                ((Bird) a).fly();
                ((Bird) a).getClean();
            }
            if (a instanceof Lizard) {
                ((Lizard) a).hunt();
                ((Lizard) a).getClean();
                veterinarian.shower(a, 30);
                ((Lizard) a).getClean();
            }

            veterinarian.vaccinate(a);
            System.out.println("");
        }
    }
}