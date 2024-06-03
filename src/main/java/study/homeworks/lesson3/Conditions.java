package study.homeworks.lesson3;

public class Conditions {
    public static void main(String[] args) {
        String pet = "кошка";
        String breed = "бенгальская";
        int weight = 5;
        String name = "Лора";

        Animal cat1 = new Animal();
        cat1.setPet(pet);
        cat1.setBreed(breed);
        cat1.setWeight(weight);
        cat1.setName("Люся");

        Animal cat2 = new Animal();
        cat2.setPet(pet);
        cat2.setBreed(breed);
        cat2.setWeight(6);
        cat2.setName(name);
        if (cat1.getBreed() == cat2.getBreed()) System.out.println("Кошки одной породы");
        if (cat1.getName() == cat2.getName()) System.out.println("У кошек одинаковые клички");

        Animal dog1 = new Animal();
        dog1.setPet("собака");
        dog1.setBreed("доберман");
        dog1.setWeight(25);
        dog1.setName("Глюкоза");

        Animal dog2 = new Animal();
        dog2.setPet("собака");
        dog2.setBreed("овчарка");
        dog2.setWeight(25);
        dog2.setName("Рекси");
        System.out.println(dog1 == dog2);
        System.out.println(dog1.getWeight() == dog2.getWeight());
    }

}
