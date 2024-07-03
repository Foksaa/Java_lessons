package study.lessons.lessons14;

import java.util.Objects;

public class Cat {
    String name;
    String breed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, weight);
    }

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
