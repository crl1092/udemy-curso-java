package edu.crislima.udemycursojava.exercicios;
import java.util.Scanner;
import java.util.Locale;
public class ex4 {
    static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o id do funcionário: ");
        int id = sc.nextInt();
        System.out.println("Digite o numero de horas que voçê trabalha: ");
        int horas = sc.nextInt();
        System.out.println("Digite o valor da hora: ");
        double valorHora = sc.nextDouble();

        double salario = valorHora * horas;

        System.out.printf("O funcionário de id: %d , recebe o Salario de: U$ %.2f%n", id , salario);

        sc.close();
    }
}
