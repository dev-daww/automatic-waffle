class Main {
    public static void main(String[] args) {
        Pajaro pajaro[] = new Pajaro[3];
        pajaro[0] = new Eagle();
        pajaro[1] = new Chuck();
        pajaro[2] = new Terrence();

        for (int i = 0; i < pajaro.length; i++) {
            pajaro[i].attack();
            pajaro[i].getColor();
        }
    }
}
