package aula09.ed;

public class Busca {
    
    public String buscaBinaria(int[] vetor, int inicio, int fim, int elemento) {
        int meio = (fim + inicio) / 2;
        int valorMeio = vetor[meio];
        
        if (inicio < fim) {
          if (valorMeio == elemento) {
              return "Elemento encontrado na posição " + meio + ".";
          }  else if (elemento > valorMeio) {
              return buscaBinaria(vetor, meio + 1, fim, elemento);
          } else {
              return buscaBinaria(vetor, inicio, meio - 1, elemento);
          }
        } else {
            return "Valores inválidos";
        } 
    }
    
}
