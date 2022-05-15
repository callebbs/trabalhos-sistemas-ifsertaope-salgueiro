package aula010;

public class Aula010 {

    public static void main(String[] args) {
        Lista lista = new Lista();

        /*System.out.print("ADICIONA NO INICIO");
        lista.adicionaNoInico("FLAMENGO � RUIM");
        System.out.print(lista.toString());
        lista.adicionaNoInico("VASCO � BOM");
        System.out.print(lista.toString());
        lista.adicionaNoInico("BOTAFOGO N�O TEM TORCIDA");
        System.out.print(lista.toString());*/

        System.out.print("------------------------------");

        System.out.println("");

        /*lista.adicionaNoFinal("PALMEIRAS � O MELHOR");
        System.out.println(lista.toString());
        lista.adicionaNoFinal("CORINTHIANS � RUIM");
        System.out.println(lista.toString());
        lista.adicionaNoFinal("S�O PAULO FLORZINHAS");
        System.out.println(lista.toString());*/

        System.out.print("ADICIONA NO FIM ORIGINAL");

        System.out.println("");

        System.out.print("------------------------------");

        System.out.println("");

        lista.adicionaNoFinalNew("PALMEIRAS É O MELHOR");
        lista.adicionaNoFinalNew("CORINTHIANS É RUIM");
        lista.adicionaNoFinalNew("SÃO PAULO FLORZINHAS");
        lista.adicionaNoInico("É O LAION");
        System.out.println(lista.toString());
        lista.adiciona(2, "É O LEÃO");
        
        System.out.println(lista.toString());
        System.out.println(lista.pega(2));
        
        lista.removeDoComeco();
        
         System.out.println(lista.toString());
    }
    
}
