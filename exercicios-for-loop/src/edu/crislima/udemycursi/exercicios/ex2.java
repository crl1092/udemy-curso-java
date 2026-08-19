package edu.crislima.udemycursi.exercicios;

import java.util.Scanner;

public class ex2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 0;
        int out = 0;
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a >= 10 && a <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
