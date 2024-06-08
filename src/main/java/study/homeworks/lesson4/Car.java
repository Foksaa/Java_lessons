package study.homeworks.lesson4;

public class Car {
    public String model;
    protected int speed;
    private int price;
    String color;

    public Car(int speed,String model){
        this.speed = speed;
        this.model = model;
    }

    public Car(String model, int speed, int price, String color) {
        this.model = model;
        this.speed = speed;
        this.price = price;
        this.color = color;
    }

    protected Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    private Car(int price) {
        this.price = price;
    }

    public Car carPrice(int price) {
        return new Car(price);
    }

    public int carPrice() {
        return this.price;
    }

    public void infoCar() {
        System.out.println("Модель авто: " + model + " и его скорость: " + speed);
        System.out.println("Модель авто: " + model);
        System.out.println("Скорость авто : " + speed);
        System.out.println("Цена авто : " + price);
        System.out.println("Цвет авто:  " + color);
    }


}
