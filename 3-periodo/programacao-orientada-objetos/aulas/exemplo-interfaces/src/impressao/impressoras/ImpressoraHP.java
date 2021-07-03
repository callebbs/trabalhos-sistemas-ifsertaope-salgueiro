package impressao.impressoras;

import impressao.Impressora;
import impressao.Imprimivel;


public class ImpressoraHP implements Impressora {
    
    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("* * * * * * * * * * * * ");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println("* * * * * * * * * * * * ");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println();
        System.out.println("- - - - - - - - - - - - - ");
        System.out.println("            HP            ");
        System.out.println("- - - - - - - - - - - - - ");
        
    }
    
}
