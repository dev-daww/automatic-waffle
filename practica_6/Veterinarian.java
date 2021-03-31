public class Veterinarian {
    String name;
    double salary;
    boolean vaccinated;

    public Veterinarian(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void vaccinate(Animal animal) {
        animal.setVaccinated(true);
        System.out.println(animal.getName() + " was vaccinated");
    }

    public void shower(Animal animal, int clean) {
        animal.setClean(clean);
        System.out.println("The animal " + animal.getName() + " was cleaned to " +
            animal.getClean() + "% of dirtyness");
    }
}
