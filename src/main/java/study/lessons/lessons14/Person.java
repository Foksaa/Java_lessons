package study.lessons.lessons14;

import java.util.Objects;

public final class Person {
    private String name;
    private final int age;
    public static String work = "qa";
    public static final String HOBBY = "Drawing";// если статик финал, то переменная только капсом
    private static int count;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        increaseCount();
    }

    public static void increaseCount(){
        count++;
    }
    public void showCount(){
        System.out.println(count);
    }




    public void setName(String name) {
        this.name = name;
    }

    /*public void setAge(int age) {
        this.age = age;
    }*/

    public void setWork(String work) {
        Person.work = work;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
