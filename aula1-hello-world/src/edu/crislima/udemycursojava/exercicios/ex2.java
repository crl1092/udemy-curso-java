package edu.crislima.udemycursojava.exercicios;

import java.util.Scanner;
import java.util.Locale;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.println("Digite o raio: ");
        double raio = scan.nextDouble();

        double area = PI * (raio * raio);
        Locale.setDefault(Locale.US);
        System.out.printf("A = %.7f %n " , area);

    }
}
