public class Car {
    String brand;//марка машины
    int power;//мощность
    boolean isAwd;//полный привод
    float acceleration;//ускорение - разгон до 100 км в час.

    void start() {
        System.out.println(brand + " заведена");
    }

    void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }
    public Car(String brand, int power, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.power = power;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
    }
    Car(){
        brand = "mazda";
        power = 190;
        isAwd = false;
        acceleration = 10;
    }
    //создадим метод, который будет считать скорость разгона автомобиля

    float cauntSpeed(float time){
        return 100/acceleration*time;
    }

}
