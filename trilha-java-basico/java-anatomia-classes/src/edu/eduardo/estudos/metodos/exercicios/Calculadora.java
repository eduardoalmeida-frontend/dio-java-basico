package edu.eduardo.estudos.metodos.exercicios;

public class Calculadora {
    
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("Soma: " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("Subtração: " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("Multiplicação: " + numero1 + " * " + numero2 + " = " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("Divisão: " + numero1 + " / " + numero2 + " = " + resultado);
    }
}
