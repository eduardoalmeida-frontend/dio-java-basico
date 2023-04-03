package edu.eduardo.estudos.orientacao_a_objetos.classe;

public class Main {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 1");
        carro1.setCapacidadeTanque(59);

        System.out.println("Modelo (carro1): " + carro1.getModelo());
        System.out.println("Cor (carro1): " + carro1.getCor());
        System.out.println("Capacidade do tanque (carro1): " + carro1.getCapacidadeTanque());
        System.out.println("Valor para encher o tanque (carro1): " + carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Cinza", "Mercedes Benz Classe C", 66);

        System.out.println("\nModelo (carro2): " + carro2.getModelo());
        System.out.println("Cor (carro2): " + carro2.getCor());
        System.out.println("Capacidade do tanque (carro2): " + carro2.getCapacidadeTanque());
        System.out.println("Valor para encher o tanque (carro2): " + carro2.totalValorTanque(6.46));
    }
}
