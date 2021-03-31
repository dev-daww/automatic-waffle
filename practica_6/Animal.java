public class Animal {
    String name;
    int age;
    boolean vaccinated;
    int clean = 50;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void setClean(int clean) {
        this.clean = clean;
    }

    public int getClean() {
        return clean;
    }

    public String getName() {
        return name;
    }
}
