package aula12.ed;

public class Aula12ED {

    public static void main(String[] args) {
       ListaEncadeada lista = new ListaEncadeada();
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

        lista.adicionaNoInicio("12");
        lista.adicionaNoFinal("98");
        lista.adicionaNoInicio("35");
        lista.adicionaNoFinal("40");
        System.out.println(lista.toString());
        
        lista.adicionaNoFinal("20");
        System.out.println(lista.toString());
        
        lista.adiciona(2, 100);
        System.out.println(lista.toString());
    }
    
}
