package edu.crislima.udemycursi.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();
        for(int i = 0; i < nCasos; i++) {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
            double media = ((num1 *2) + (num2 * 3) + (num3 * 5)) / 10.0;
            System.out.println(String.format("%.1f", media));
        }
        sc.close();
    }
}
