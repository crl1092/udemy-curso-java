package edu.crislima.udemycursojava.exercicios;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int a = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = input.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int c = input.nextInt();
        System.out.print("Digite o quarto numero: ");
        int d = input.nextInt();

        int diferenca = (a * b) - (c * d);
        System.out.printf("Diferença = %d %n", diferenca);

        input.close();
    }
}
