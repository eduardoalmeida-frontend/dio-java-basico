package edu.eduardo.estudos.operadores_relacionais;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("------");
        System.out.println("Int");
        System.out.println("------");
        // Ints (declaração)
        int i1 = 10;
        int i2 = 20;
        // Ints (comparação)
        System.out.println("i1 == i2: " + (i1 == i2));
        System.out.println("i1 != i2: " + (i1 != i2));
        System.out.println("i1 > i2: " + (i1 > i2));
        System.out.println("i1 <= i2: " + (i1 <= i2));

        System.out.println("------");
        System.out.println("Float");
        System.out.println("------");
        // Floats (declaração)
        float f1 = 4.5f;
        float f2 = 3.5f;
        // Floats (comparação)
        System.out.println("f1 == f2: " + (f1 == f2));
        System.out.println("f1 != f2: " + (f1 != f2));
        System.out.println("f1 >= f2: " + (f1 >= f2));
        System.out.println("f1 < f2: " + (f1 < f2));

        System.out.println("------");
        System.out.println("Char");
        System.out.println("------");
        // Chars (declaração)
        char c1 = 'x';
        char c2 = 'y';
        // Chars (comparação)
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1 != c2: " + (c1 != c2));
        System.out.println("c1 > c2: " + (c1 > c2));
        System.out.println("c1 <= c2: " + (c1 <= c2));

        System.out.println("------");
        System.out.println("String");
        System.out.println("------");
        // Strings (declaração)
        String s1 = "Fulano";
        String s2 = "Fulano";
        // Strings (comparação)
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 != s2: " + (s1 != s2));
        // System.out.println(s1 >= s2); * não é possível comparar o tamanho de duas Strings
        // System.out.println(s1 < s2); * não é possível comparar o tamanho de duas Strings

        System.out.println("------");
        System.out.println("Boolean");
        System.out.println("------");
        // Booleans (declaração)
        boolean b1 = true;
        boolean b2 = false;
        // Boolens (comparação)
        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b1 != b2: " + (b1 != b2));
        // System.out.println(b1 > b2); * não é possível comparar o tamanho de dois booleans

        // Boolean e Int (comparação)
        // System.out.println(b1 <= i1); * não é possível comparar o tamanho de um boolean com o de um int

        System.out.println("------");
        System.out.println("Int e Float");
        System.out.println("------");
        // Int e Float (comparação)
        System.out.println("i2 <= f1: " + (i2 <= f1));

    }
}
