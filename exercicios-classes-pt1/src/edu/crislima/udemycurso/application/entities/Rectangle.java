package edu.crislima.udemycurso.application.entities;

public class Rectangle {
    public double width;
    public double height;

    public double calcularArea() {
        return width * height;
    }
    public double calcularPerimetro () {
        return (2.0 * width) + (2.0 * height);
    }
    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
