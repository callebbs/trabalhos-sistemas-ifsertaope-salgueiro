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
    
    public void selectionSort(int[] vetor) {
        int menor , aux;
        
        for (int i = 0; i < vetor.length-1; i++) {
            menor = i;
            for (int j = i+1; j < vetor.length; j++) {
                if (vetor[menor] > vetor[j]) {
                    menor = j;
                }
            }
            if (menor != i) {
                aux = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = aux;
            }
        }
    }
    
    public void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i-1;
            
            while((j > -1) && (vetor[j] > aux)) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
            
        }
    }
    
}
