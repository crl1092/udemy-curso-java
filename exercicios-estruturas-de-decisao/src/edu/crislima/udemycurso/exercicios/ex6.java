package edu.crislima.udemycurso.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero = input.nextDouble();

        if(numero >= 0.0 && numero <= 25.0) {
            System.out.println("O número digitado está entre 0 e 25");
        } else if(numero >= 25.0 && numero <= 50.0) {
            System.out.println("O número digitado está entre 25 e 50");
        }  else if(numero >= 50.0 && numero <= 75.0) {
            System.out.println("O número digitado está entre 50 e 75");
        }   else if(numero >= 75.0 && numero <= 100.0) {
            System.out.println("O número digitado está entre 75 e 100");
        } else {
            System.out.println("O número digitado está fora de intervalo");
        }

        input.close();
    }
}
