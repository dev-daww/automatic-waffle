public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Paco", 7);
        Animal perro1 = new Perro("Nico", 4);
        Animal gato1 = new Gato("Teo", 5); //variable polimorfica
        //Gato gato1 = new Gato("Teo",5); //objeto normal

        //Gato gato2 =  Animal("Mar",9); //incorrecto

        Animal animalesMat[] = new Animal[3];
        animalesMat[0] = animal1;
        animalesMat[1] = perro1;
        animalesMat[2] = gato1;

        /*
        animal1.comer();
        perro1.comer1();
        gato1.comer2();
        */

        for (Animal a: animalesMat) {
            a.Comer();
        }
    }
}
