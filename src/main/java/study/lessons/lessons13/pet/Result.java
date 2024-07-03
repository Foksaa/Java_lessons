package study.lessons.lessons13.pet;

public class Result {
    public static void main(String[] args) {
        Soundable catSound = new Cat();
        Animal fish = new Fish();
        Animal cat = new Cat();
        cat.move();
        Cat simba = new Cat();
        //simba
        Animal dog = new Dog();
        dog.move();
        catSound.sound();
        Soundable dogSound = new Dog();
        dogSound.sound();

        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Fish(), fish, cat, dog};
        Soundable[] soundables = new Soundable[]{new Cat(), new Dog(), simba, catSound, dogSound};
        if (cat instanceof Soundable){
            System.out.println("Кошка- это кошка");
        }
        if (dogSound instanceof Soundable){
            System.out.println("Собака- это друг человека");
        }
        if (fish instanceof Soundable){
            System.out.println("Рыбы живут в воде");
        }

    }
}
