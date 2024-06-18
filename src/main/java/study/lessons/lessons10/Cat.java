package study.lessons.lessons10;

public class Cat {
    String name;
    String breed;
    int weight;

    public Cat(String name, String breed, int weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public String toString() { //конкатенация строк
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
