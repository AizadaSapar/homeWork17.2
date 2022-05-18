package com.company;

public class Main {

    public static void main(String[] args) {

    Shape[] shape = {new Square(),new Rectangle(),new Triangle(),new Circle(),new Polygon()};
        for (Shape shape1 : shape) {
            System.out.println(shape1.getPerimeter());
        }

    }
}
