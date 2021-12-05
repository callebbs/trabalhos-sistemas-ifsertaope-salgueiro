package aula12.ed;

public class Aula12ED {

    public static void main(String[] args) {
       ListaEncadeada lista1 = new ListaEncadeada();
       
//       Listas Encadeadas
//       System.out.println("Aidionanco no início...");
//       lista.adicionaNoInicio("Star Wars é top");
//       System.out.println(lista.toString());
//       lista.adicionaNoInicio("Matrix é top");
//       System.out.println(lista.toString());
//       lista.adicionaNoInicio("Spice must flow!");
//       System.out.println(lista.toString());
//       
//       System.out.println("Adicionando no final...");
//       lista.adicionaNoFinal("Spider-man vai ser bom!");
//       System.out.println(lista.toString());
//
//        lista.adicionaNoInicio("12");
//        lista.adicionaNoFinal("98");
//        lista.adicionaNoInicio("35");
//        lista.adicionaNoFinal("40");
//        System.out.println(lista.toString());
//        
//        lista.adicionaNoFinal("20");
//        System.out.println(lista.toString());
//        
//        lista.adiciona(2, 100);
//        System.out.println(lista.toString());
//        
//        lista.removeDoComeco();
//        System.out.println(lista.toString());
//        
//        lista.removeDoFinal();
//        System.out.println(lista.toString());
//        
//        lista.remove(1);
//        System.out.println(lista.toString());

//      Lista Duplamente Encadeada
        ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();
        
        lista2.adicionaNoInicio("Star Wars");
        System.out.println(lista2.toString());
        
        lista2.adicionaNoInicio("Dune");
        System.out.println(lista2.toString());
        
        lista2.adicionaNoFinal("Matrix");
        System.out.println(lista2.toString());
    }
}