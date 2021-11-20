package aula12.ed;

public class Aula12ED {

    public static void main(String[] args) {
       ListaEncadeada lista = new ListaEncadeada();
       
       lista.adicionaInicio("Star Wars é top");
       System.out.println(lista.toString());
       lista.adicionaInicio("Matrix é top");
       System.out.println(lista.toString());
       lista.adicionaInicio("Spice must flow!");
       System.out.println(lista.toString());
    }
    
}
