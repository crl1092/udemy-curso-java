package edu.crislima.udemycursojava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
     static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        final double PI = 3.14159;
        System.out.println("Digite primeiro valor: ");
        double valor1 = input.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double valor2 = input.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double valor3 = input.nextDouble();

        double areaTriangulo = (valor1 + valor3) / 2;
        double areaCirculo = PI * (valor3 * valor3);
        double areaTrapezio = (valor1 + valor2) * valor3 / 2;
        double areaQuadrado = valor2 * valor2;
        double areaRetangulo = valor1 * valor3;


        System.out.println("A area do triangulo: " + areaTriangulo);
        System.out.println("A area do circulo: " + areaCirculo);
        System.out.println("A area do trapézio: " + areaTrapezio);
        System.out.println("A area do quadrado: " + areaQuadrado);
        System.out.println("A area do retângulo: " + areaRetangulo);


        input.close();
    }
}
