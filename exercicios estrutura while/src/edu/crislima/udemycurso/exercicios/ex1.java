package edu.crislima.udemycurso.exercicios;

import java.util.Scanner;

public class ex1 {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        int senha = teclado.nextInt();
        int senhaVerdadeira = 2002;

        while (senha != senhaVerdadeira) {
            senha = teclado.nextInt();
            if (senha == senhaVerdadeira) {
                System.out.println("Acesso permitido");
                break;
            } else {
                System.out.println("Senha Incorreta");
            }
        }

    }
}
