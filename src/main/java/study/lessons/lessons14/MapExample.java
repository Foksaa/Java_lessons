package study.lessons.lessons14;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> statusCodeMap = new HashMap<>();

        statusCodeMap.put(200, "OK"); //положить данные в HashMap
        statusCodeMap.put(202, "OK"); //положить данные в HashMap
        statusCodeMap.put(201, "OK"); //положить данные в HashMap
        statusCodeMap.put(403, "not authorized");// 403 - это ключ, "not authorized" - это значение
        statusCodeMap.put(200, "Okay");

        System.out.println(statusCodeMap);

        Map<String, String> stringsMap = new HashMap<>();

        stringsMap.put("Cat", "Barsic");
        stringsMap.put("Dog", "Mars");
        stringsMap.put("Pet", "Mars");

        System.out.println(stringsMap);

        String catName = stringsMap.get("Cat"); //получить значение по ключу
        System.out.println(catName);

        stringsMap.remove("Cat"); //удаление ключа-значения
        System.out.println(stringsMap);

        System.out.println(stringsMap.size()); //получить размер HashMap

        System.out.println(stringsMap.values()); //получить все значения не указывая ключ

        System.out.println(stringsMap.containsKey("Dog")); //проверить существует ли такой ключ
        System.out.println(stringsMap.containsValue("Barsic")); //проверить существует ли такое значение

        System.out.println(stringsMap.get("Fish")); //при отсутствии ключа выдается null
    }
}
