package aula09.ed;

public class Ordenacao {
    public void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length-1; i++) {
            
            boolean estaOrdenado = true;
            
            for(int j = 0; j < vetor.length-1-i; j++) {
                if(vetor[j] > vetor[j+1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                    estaOrdenado = false;
                }
            }
            
            if (estaOrdenado) {
                break;
            }
        }
    }
   
    public void bubbleSortNome(Animal[] vetor){
        for(int i = 0; i < vetor.length - 1; i++){
            
            boolean estaOrdenado = true;
            
            for(int j = 0; j < vetor.length - 1 - i; j++){
                if(vetor[j].getNome().compareToIgnoreCase(vetor[j+1].getNome()) > 0){
                    Animal aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                    estaOrdenado = false;
                }
            }
            if(estaOrdenado){
                break;
            }
        }
    }
    
}
