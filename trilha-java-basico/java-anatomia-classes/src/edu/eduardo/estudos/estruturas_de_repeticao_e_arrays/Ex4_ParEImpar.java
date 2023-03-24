package edu.eduardo.estudos.estruturas_de_repeticao_e_arrays;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;
        int count = 0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scanner.nextInt();

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpares);

    }
}
