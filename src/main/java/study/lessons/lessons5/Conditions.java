package study.lessons.lessons5;


public class Conditions {
    public static void main(String[] args) {
        String type = "cat";
        String breed = "bengal";
        int weight = 9;
        int age = 50;


        new Animal();
        System.out.println("Мы создали животное с пустым конструктором");

        System.out.println("Создано животное с одним параметром: " + new Animal("кошка").getType());

        Animal cat3 = new Animal("кошка","сфинкс");
        System.out.println("Создано животное с двумя параметрами: " + cat3.getType() + ", " + cat3.getBreed());

        Animal cat4 = new Animal("кошка","корниш-рекс", 5);
        System.out.println("Создано животное с тремя параметрами: " + cat3.getType() + ", " + cat3.getBreed()
        + ", " + "весом " + cat4.getWeight() + "кг");

        Animal cat5 = new Animal("кот","сибирская", 7, "Пушок");
        System.out.println("Создано животное с четырьмя параметрами: " + cat5.getType() + ", порода: " + cat5.getBreed()
                + ", " + "весом " + cat5.getWeight() + "кг и зовут его " + cat5.getName());

        Animal cat6 = new Animal("кот","курильский бобтейл", 9, "Кузя", 3);
        System.out.println("Создано животное с пятью параметрами: " + cat6.getType() + ", порода: " + cat6.getBreed()
                + ", " + "весом " + cat6.getWeight() + "кг и зовут его " + cat6.getName() + ", возраст: "
        + cat6.getAge() + " года");

        Animal bird1 = new Animal("попугай",1);
        System.out.println("Создан новый вид животного с двумя параметрами: " + bird1.getType()
        + ", возраст: " + bird1.getAge() + "год");

        Animal animal1 = new Animal();
        animal1.setType("обезьяна","лемур");
        System.out.println(animal1.getType() + " породы " + animal1.getBreed());

        Animal animal2 = new Animal("horse", "rus", 100);
        System.out.println(animal2.getType() + animal2.getBreed() + animal2.getWeight());




    }



}
