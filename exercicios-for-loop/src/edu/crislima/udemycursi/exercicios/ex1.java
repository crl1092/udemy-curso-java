package edu.crislima.udemycursi.exercicios;

import java.util.Scanner;

public class ex1 {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        int x =  teclado.nextInt();

        for(int a = 0; a < x; a++) {
            if(a % 2 == 0) {
                System.out.println(a);
            }
        }

        teclado.close();
    }

}
