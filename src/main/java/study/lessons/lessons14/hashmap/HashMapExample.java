package study.lessons.lessons14.hashmap;

import study.lessons.lessons14.Cat;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", "Дворовой", 4);

        Map<Integer, Cat> catMap = new HashMap<>();
        catMap.put(100, barsik);

        Map<Integer, Integer> nums = new HashMap<>();
        nums.put(0, 168423158);
        nums.put(1, 168423158);
        nums.put(2, 168423158);
        nums.put(5, 168423158);
        nums.put(99, 168423158);

        System.out.println(nums.equals(catMap)); //здесь может возникнуть коллизия (вероятность низкая)


        System.out.println(catMap);

        System.out.println(nums.keySet());
    }
}
