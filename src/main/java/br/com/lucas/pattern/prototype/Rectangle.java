package br.com.lucas.pattern.prototype;

public class Rectangle extends Shape{

    private Integer width;
    private Integer height;

    public Rectangle(Integer x, Integer y, String color, Integer width, Integer height) {
        super(x, y, color);
        this.height = height;
        this.width = width;
    }

    @Override
    public Shape clone() {
        return this;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
