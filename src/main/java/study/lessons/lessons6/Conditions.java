package study.lessons.lessons6;

public class Conditions {
    public static void main(String[] args) {
        String type = "cat";
        String breed = "bengal";
        int weight = 9;
        int age = 50;

        /*Pet pet1 = new Pet("собака","овчарка");
        pet1.weight = 20;
        System.out.println(pet1.weight);
        pet1.setWeight(25);
        System.out.println(pet1.weight);
        System.out.println(pet1.getType());

        Pet pet2 = new Pet("птица", "какаду");
        pet2.name = "Говорушка";
        System.out.println(pet2.getBreed());

        System.out.println(pet2.breed);
        System.out.println(pet1.weight);
        System.out.println(pet2.name);*/

        Pet pet = new Pet();
        System.out.println(pet.createCat().getType());








    }





}
