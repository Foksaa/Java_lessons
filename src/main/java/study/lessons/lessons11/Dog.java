package study.lessons.lessons11;

public class Dog {
    public double weight;
    public int age;

    public String name;
    public String breed;

    public Dog(double weight, int age, String name, String breed){
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
