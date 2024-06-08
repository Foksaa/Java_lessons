package study.lessons.lessons6;

public class Pet {
    private String type; //самый закрытый тип доступа(модификатора)-доступ только для класса
    String breed;//дефолтный доступ для классов в package.lesson6
    protected int weight;//аналогично дефолтному, + дополнительно его могут видеть классы наследники
    public String name;//самый открытый модификатор, можно вызвать в других классах

    private int age;

    public Pet(){

    }
    private Pet(String type){//можно вызвать из текущего класса Animal
        this.type = type;
    }
    public Pet(String type, String breed){
        this(type);
        this.breed = breed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
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

    public Pet createCat(){
         Pet pet = new Pet("cat");
         return pet;
    }


}

