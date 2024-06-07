package study.lessons.lessons5;

public class Animal {
    private String type;
    private String breed;
    private int weight;
    private String name;

    private int age;

    public Animal(){

    }
    public Animal(String type){
        this.type = type;
    }
    public Animal(String type, String breed){
        this(type);
        this.breed = breed;
    }
    public Animal(String type, String breed, int weight){
        System.out.println(type + breed + weight);
    }

    public Animal(String type, String breed, int weight, String name){
        this(type,breed,weight);
        this.name = name;
    }
    public Animal(String type, String breed, int weight, String name, int age){
        this(type,breed,weight,name);
        this.age = age;
    }
    public Animal(String type, int age){
        this.type = type;
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setType(String breed, String type) {
        setType(type);
        this.breed = breed;
    }

    public void setType(String type, int weight, String breed) {
        System.out.println("Появилось новое животное: " + type + "весом: " + weight + "породы: " + breed);
        setType("новый", 6, "чебурашка");
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setBreed(int age, String breed, int weight) {
        setBreed(1, "волк", 8);
    }

    public void setBreed(String type, String breed){
        this.type = type;
        this.breed = breed;
        System.out.println(type + breed);
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWeight(String name, int age, int weight) {
        System.out.println(name + age + weight);
    }

    public void setWeight(int weight, String name, String breed){
        setWeight(weight);
        setName(name);
        this.breed = breed;
        System.out.println(breed);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String name, int age) {
        setName(name);
        this.age = age;
    }

    public void setName(int weight, String breed, String name){
        this.weight = weight;
        setBreed(breed);
        this.name = name;
    }

    public void setAge(String breed, int age) {
        this.breed = breed;
        this.age = age;

    }

    public void setAge(int age, String type, int weight) {
        this.age = age;
        this.type = type;
        setWeight(weight);
    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

