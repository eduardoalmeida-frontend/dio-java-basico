package edu.eduardo.estudos.estruturas_de_repeticao;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplicacao = 1;

        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao *= i;
        }

        System.out.println(fatorial + "! = " + multiplicacao);
    }
}
