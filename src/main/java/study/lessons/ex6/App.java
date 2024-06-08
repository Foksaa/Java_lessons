package study.lessons.ex6;

import study.lessons.lessons6.Pet;

public class App extends Pet{
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.setType("зайчик");
        pet.setBreed("пушистый");
        pet.setName("Вася");
        pet.setWeight(1);
        pet.setAge(2);
        System.out.println(pet.getType());
        System.out.println(pet.getBreed());
        System.out.println(pet.getName());
        System.out.println(pet.getWeight());
        System.out.println(pet.getAge());
        System.out.println(pet.name);


    }
}
