package br.com.lucas.pattern.prototype;

public abstract class Shape {
    private Integer x;
    private Integer y;
    private String color;

    public Shape(Integer x, Integer y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract Shape clone();

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
