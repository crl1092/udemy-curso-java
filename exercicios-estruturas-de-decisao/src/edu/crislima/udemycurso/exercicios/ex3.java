package edu.crislima.udemycurso.exercicios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Digite o primeiro numero");
        a = input.nextInt();
        System.out.println("Digite o segundo numero");
        b = input.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("Os números são múltiplos");
        } else {
            System.out.println("Os números não são múltiplos");
        }
    }
}
