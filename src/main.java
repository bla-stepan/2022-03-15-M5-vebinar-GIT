public class main {
    public static void main(String[] args) {
        Car mazda = new Car();
//        mazda.brand = "mazda";
//        mazda.power = 190;
//        mazda.isAwd = false;
//        mazda.start();
//        mazda.setAcceleration(10);
        System.out.println(mazda.brand + ", мощность -" + mazda.power + "л.с., разгон до 100 км/ч - " + mazda.acceleration);
        System.out.println(mazda.acceleration);

        Car lada = new Car("lada", 150, false, 20);
        System.out.println(lada.brand + ", мощность -" + lada.power + "л.с., разгон до 100 км/ч - " + lada.acceleration);
        lada.start();
    }
}
