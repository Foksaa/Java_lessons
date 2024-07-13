package study.lessons.lesson15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamApiExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1000);
        numbers.add(50);
        numbers.add(12);
        numbers.add(-94);
        numbers.add(-1000);
        numbers.add(0);
        numbers.add(254);
        numbers.add(1256);
        numbers.add(8);
        numbers.add(16);

        List<Integer> newNumbers = numbers.stream().filter(number -> number > 0 && number < 100).toList();
        //сохранить все в новый список по фильтру

        numbers.stream()
                .filter(number -> number < 0)
                .forEach(System.out::println); //вывести в консоль все элементы по фильтру


        Integer num = numbers.stream()
                .filter(number -> number > -100 && number < 1000)
                .sorted()
                .findFirst()
                .orElseThrow(RuntimeException::new); //получаем самое первое значение из отсортированного списка

        List<Integer> sortedList = numbers.stream()
                .filter(number -> number > -100 && number < 1000)
                .sorted().toList(); //сортировка по возрастанию

        List<Integer> reverseSortList = numbers.stream()
                .filter(number -> number > -100 && number < 1000)
                .sorted(Comparator.reverseOrder())
                .toList(); //обратная сортировка


        System.out.println(numbers.stream().anyMatch(number -> number == 50)); //хотя бы одно значение List равно 50
        System.out.println(numbers.stream().allMatch(number -> number == 50)); //все значения List равные 50


        System.out.println(numbers.stream().distinct().toList()); //удаляет все дубликаты из списка

        System.out.println(numbers.stream().skip(3).toList()); //пропускает первые 3 (три) значения из списка и не выводит

        System.out.println(numbers.stream().max(Comparator.naturalOrder()).orElse(null)); //получать самое большое значение
        System.out.println(numbers.stream().min(Comparator.naturalOrder()).orElse(null)); //получать самое меньшее значение
    }
}
