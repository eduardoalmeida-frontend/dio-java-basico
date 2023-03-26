package edu.eduardo.estudos.estruturas_de_repeticao_e_arrays;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int soma = 0;
        int maior = 0;

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;
            
            if (numero > maior) maior = numero;

            count++;
        } while(count < 5);

        System.out.println("\nMaior: " + maior);
        System.out.println("Média: " + (soma / 5));
    }
}
