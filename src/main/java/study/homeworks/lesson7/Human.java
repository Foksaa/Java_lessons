package study.homeworks.lesson7;

public class Human {
        public int hungry = 10;
        public int energy = 100;

        public void run(){

                        System.out.println("Человек начал бежать спринт");
                 while (energy >= 50) {
                        if (energy == 50) {
                                hungry = 5;
                                System.out.println("Уровень энергии упал до 50, уровень голода: " + hungry);
                        }
                        energy--;
                 }
                System.out.println("Требуется передышка");

                while (energy > 10) {
                        energy--;
                }

                System.out.println("Уровень энергии упал до 10, у человека нет сил бежать");
        }
        public void rest() {
                        System.out.println("Человек лежал и отдыхал до тех пор, пока уровень энергии не упал до 1");

                while (energy > 1) {
                        energy--;
                }
                System.out.println("Уровень энергии упал до 1");
                System.out.println("Приехал врач с допингом :D");

                while (energy <= 15) {

                        System.out.println("Врач сделал укол. Уровень энергии поднялся до значения: " + energy);

                        if (energy == 15) {
                                hungry = 8;
                                System.out.println("Теперь достаточно уровня энергии: " + energy + ". " +
                                        "Человек может покушать, уровень голода теперь: " + hungry);
                        }
                        energy++;
                }
        }
}
