package aula12.ed;

public class Aula12ED {

    public static void main(String[] args) {
       ListaEncadeada lista = new ListaEncadeada();
        System.out.println("Aidionanco no início...");
       lista.adicionaInicio("Star Wars é top");
       System.out.println(lista.toString());
       lista.adicionaInicio("Matrix é top");
       System.out.println(lista.toString());
       lista.adicionaInicio("Spice must flow!");
       System.out.println(lista.toString());
       
       System.out.println("Adicionando no final...");
       lista.adicionaNoFinal("Spider-man vai ser bom!");
       System.out.println(lista.toString());
    }
    
}
