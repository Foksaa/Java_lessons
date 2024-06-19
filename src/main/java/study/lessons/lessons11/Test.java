package study.lessons.lessons11;

import java.util.Arrays;

public class Test {
    int[] nums = new int[]{4, 2, 3};
    String[] words = new String[]{"Privet", "Kak dela?", "Ok"};


    Cat bengal = new Cat(5.5, 3, "Simba", "bengal");
    Cat siam = new Cat(6.1, 4, "Sara", "siam");
    Cat siberian = new Cat(8.0, 5, "Barsik", "siberian");

    Cat[] cats = new Cat[]{bengal, siam, siberian};
    Dog[] dogs = new Dog[3];

    Dog[] newDogs = new Dog[6];


    public static void main(String[] args) {
        Test test = new Test();
        Dog mops = new Dog(6.0, 2, "Boba", "Mops");
        Dog pitbull = new Dog(12.5, 5, "Pushok", "Pitbull");
        //System.out.println(Arrays.toString(test.cats)); без array и to string работать не будет
        /*test.cats[1] = null;
        for (int i = 0; i < test.cats.length; i++ ){
            if (test.cats[i] != null) {
                System.out.println(test.cats[i]);
            }
        }*/


        test.dogs[0] = mops;
        test.dogs[1] = new Dog(15, 5, "Reks", "ovcharka");
        //test.dogs[0] = null;
        test.dogs[2] = pitbull;
        test.newDogs[3] = new Dog(10, 8, "Lessi", "kolli");
        test.newDogs[4] = new Dog(1.5, 1, "Pesik", "chixua");
        test.newDogs[5] = new Dog(3, 1, "korgi", "Buxanka");
        for (int i = 0; i < test.dogs.length; i++) {
            //System.out.println(test.dogs[i]);
        }

        /*for (int i = 0; i < test.dogs.length; i++) {
            test.newDogs[i] = test.dogs[i];
            System.out.println(test.newDogs[i]);
        }*/
        for (int i = test.newDogs.length - 1; i > 0; i--) {
            if (test.newDogs[i] != null) {
                System.out.println(test.newDogs[i]);
            }

        }


    }
}






