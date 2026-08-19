package edu.crislima.udemycursi.exercicios;

import java.util.Scanner;

public class ex5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int resultado =1 ;
        for(int i = 1; i <= num; i++){
           resultado = resultado * i;
        }
        System.out.println("O fatorial é: " + resultado);
        sc.close();
    }

}
