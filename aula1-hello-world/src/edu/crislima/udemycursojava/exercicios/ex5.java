package edu.crislima.udemycursojava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o id do primeiro item que vai comprar:");
        int idItemUm = input.nextInt();
        System.out.println("Digite a quantidade do primeiro item que vai comprar:");
        int qtdItemUm = input.nextInt();
        System.out.println("Digite o preço do item um:");
        double precoItemUm = input.nextDouble();
        System.out.println("Digite o id do item dois:");
        int idItemDois = input.nextInt();
        System.out.println("Digite a quantidade do item dois:");
        int qtdItemDois = input.nextInt();
        System.out.println("Digite o preço do item dois");
        double precoItemDois = input.nextDouble();

        double precoTotal = (precoItemUm * qtdItemUm)+ (precoItemDois * qtdItemDois);

        IO.println(String.format("Identificador dos items comprados: Item1: %d & Item2: %d %nQuantidades de items comprados: %d do item 1 & %d do item 2 %nValor total a pagar: R$ %.2f Reais", idItemUm,idItemDois,qtdItemUm,qtdItemDois,precoTotal));
        input.close();
    }
}
