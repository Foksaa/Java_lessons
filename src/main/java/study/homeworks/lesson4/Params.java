package study.homeworks.lesson4;

public class Params{
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 120, 200000, "Red");
        Car car2 = new Car("Honda", 140, 250000, "Blue");
        Car car3 = new Car("Ford", "Black", 160);
        Car car5 = new Car(60, "Volga");

        Car car6 = new Car(70,"Audi");
        System.out.println(car6.speed + " " + car6.model);

        car1.infoCar();
        car2.infoCar();
        car3.infoCar();
        car5.infoCar();

        Car car4 = car1.carPrice(300000);
        System.out.println("Цена из приватного конструктора : " + car4.carPrice());

    }
}
