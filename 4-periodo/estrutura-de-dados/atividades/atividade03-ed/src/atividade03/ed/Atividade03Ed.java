package atividade03.ed;

public class Atividade03Ed {

    public static void main(String[] args) {
       ListaEncadeada lista = new ListaEncadeada();
       lista.adicionaNoFinal("Estruturas de Dados é top");
       System.out.println(lista.toString());
       lista.adicionaNoFinal("Assista Star Wars");
       System.out.println(lista.toString());
       lista.adicionaNoFinal("Pela Ordem de lançento!");
       System.out.println(lista.toString());
       
    }
    
}
