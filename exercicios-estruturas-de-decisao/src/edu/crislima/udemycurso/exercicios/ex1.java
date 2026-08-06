package edu.crislima.udemycurso.exercicios;

import java.util.Scanner;

public class ex1 {

    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero numero: ");
        int numero = input.nextInt();
        if(numero < 0) {
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O numero é positivo");
        }


        input.close();
    }
}
