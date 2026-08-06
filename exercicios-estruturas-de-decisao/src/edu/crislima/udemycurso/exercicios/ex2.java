package edu.crislima.udemycurso.exercicios;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é ímpar");
        }


        input.close();
    }
}
