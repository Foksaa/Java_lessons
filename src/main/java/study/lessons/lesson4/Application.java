package study.lessons.lesson4;

public class Application {
    public static void main(String[] args) {
        String color = "white";
        int length = 10;
        int width = 5;

        String name = "login";
        Button button1 = new Button();
        button1.setColor(color);
        button1.setLength(length);
        button1.setWidth(width);
        button1.setName(name);
        //System.out.println(button1.getName());

        Button button2 = new Button();
        button2.setColor("red");
        button2.setLength(20);
        button2.setWidth(30);
        button2.setName("antilogin");
        System.out.println("Цвет: " + button2.getColor() + ' ' + "Длина: " + button2.getLength() +
                ' ' + "Ширина: " + button2.getWidth()
                + ' ' + "Имя: " + button2.getName());



    }

}
