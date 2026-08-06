package edu.crislima.udemycurso.exercicios;

import java.util.Scanner;

public class ex4 {
    static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int hrInicio, hrFim, duracao;
        System.out.println("Digite a hora de inicio do jogo");
        hrInicio = input.nextInt();
        System.out.println("Digite a hora de fim do jogo");
        hrFim = input.nextInt();

        if (hrInicio < hrFim) {
            duracao = hrFim - hrInicio;
        }  else {
            duracao = 24 - hrInicio + hrFim;
        }

        System.out.println(String.format("O jogo durou %d horas", duracao));


        input.close();
    }
}
