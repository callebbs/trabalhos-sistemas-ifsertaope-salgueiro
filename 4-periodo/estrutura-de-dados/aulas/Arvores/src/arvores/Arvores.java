
package arvores;

public class Arvores {

    public static void main(String[] args) {
        
        Arvore arvore = new Arvore();
        
        arvore.inserir(20);
        arvore.inserir(30);
        arvore.inserir(40);
        arvore.inserir(25);
        
        System.out.println("Verificando o elemento...");
        No no = arvore.busca(30);
        
        if(no == null) {
            System.out.println("Elemento não encontrado na árvore.");
        } else {
            System.out.println("Elemento encontrado.");
            System.out.println("Pai do elemento: " + no.getPai().getValor());
            System.out.println("Filho da esquerda " + no.getEsq().getValor());
            System.out.println("Filho da direita " + no.getDir().getValor());
        }
    }
    
}
