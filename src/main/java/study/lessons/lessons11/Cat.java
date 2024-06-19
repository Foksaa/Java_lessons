package study.lessons.lessons11;

public class Cat {
    public double weight;
    public int age;

    public String name;
    public String breed;

    public Cat(double weight, int age, String name, String breed){
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
