package edu.crislima.udemycurso.exercicios;

import java.util.Scanner;

public class ex5 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int id,qtd;
        double valorPago = 0.0;
        System.out.println("Digite o id do item comprado: ");
        id = input.nextInt();
        System.out.println("Digite a quantidade de itens comprado: ");
        qtd = input.nextInt();
        
        if(id == 1) {
            valorPago = 4.00 * qtd;
        } 
        else if(id == 2) {
            valorPago = 4.50 * qtd;
        } 
        else if(id == 3) {
            valorPago = 5.00 * qtd;
        } 
        else if(id == 4) {
            valorPago = 2.00 * qtd;
        }
        else if(id == 5) {
            valorPago = 1.50 * qtd;
        }
        
        System.out.printf("Total: R$ %.2f " , valorPago);
    }
}
