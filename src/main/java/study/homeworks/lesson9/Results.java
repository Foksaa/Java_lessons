package study.homeworks.lesson9;

public class Results {
    public static void main(String[] args) {
        Bird crow = new Crow("Ворона", 5);
        Bird falcon = new Falcon("Сокол", 2);
        Bird sparrow = new Sparrow("Воробей", 3);
        Bird woodpecker = new Woodpecker("Дятел",6);

        Bird[] birds = new Bird[]{crow, falcon, sparrow, woodpecker};
        for (Bird bird : birds){
            if (bird instanceof Huntable) {
                System.out.println(bird.name + " - птица может охотиться");
            } else {
                System.out.println(bird.name + " - птица не охотиться");
            }
        }




    }
}
