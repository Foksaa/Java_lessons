package study.lessons.lesson4;

public class Button {
    private String color;
    private int length;
    private int width;
    private String name;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Button{" +
                "color='" + color + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

