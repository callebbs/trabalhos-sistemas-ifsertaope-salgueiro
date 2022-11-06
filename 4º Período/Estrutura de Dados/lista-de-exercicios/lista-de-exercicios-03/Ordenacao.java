package lista.de.exercicios.pkg03;

public class Ordenacao {
    private String[] vetorNome;

    public String[] getVetorPalavras() {
        return vetorNome;
    }

    public void setVetorPalavras(String[] vetorPalavras) {
        this.vetorNome = vetorPalavras;
    }
        
    public void quickSortString(String[] vetor2, int inicio, int fim) {
        if(inicio < fim) {
                int p = partition(vetor2, inicio, fim);
                quickSortString(vetor2, inicio, p - 1);
                quickSortString(vetor2, p + 1, fim);
			
        }
			
    }
    
    public int partition(String[] vetor2, int inicio, int fim) {
        String pivo = vetor2[fim];
        int i = inicio;
        for(int j = inicio; j < fim; j++) {
                if(vetor2[j].compareToIgnoreCase(pivo) < 0) {
                        String temp = vetor2[i];
                        vetor2[i] = vetor2[j];
                        vetor2[j] = temp;
                        i++;
                }
        }
        String temp = vetor2[i];
        vetor2[i] = vetor2[fim];
        vetor2[fim] = temp;
        return i;
    }
    
    public void insertionSort(String[] vetor) {
        for(int i = 1; i < vetor.length; i++) {
            String aux = vetor[i];
            int j = i-1;
            while((j > -1) && (vetor[j].length()>aux.length())) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1]=aux;
        }
    }
    
        
        
}
