public class VetorProva {
	private int[] elementos;
	private int tamanho;
	
	
	public VetorProva(int capacidade) {
		this.elementos = new int[capacidade];
		this.tamanho = 0;
	}
	
	private boolean posicaoValida(int posicao) {
		if((posicao >= 0) && (posicao <= this.tamanho)) 
				return true;
			return false;
	}
	
	public void adicionaNoFinal(int elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			
		} else {
			this.aumentaCapacidade();
		}
		this.tamanho++;
	}
	
	public boolean adiciona(int posicao, int elemento) {
		if(this.posicaoValida(posicao)) {
			if(this.tamanho == this.elementos.length) {
				this.aumentaCapacidade();
			}
			for(int i = this.tamanho-1; i >= posicao; i--) {
				this.elementos[i+1] = this.elementos[i];
			}
			this.elementos[posicao] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}
	
	public void remove(int posicao) {
		if((posicao >= 0) && (posicao < this.tamanho)) {
			for(int i = posicao; i < tamanho-1; i++) {
				this.elementos[i] = elementos[i+1];
			}
			this.tamanho--;
		}
	}
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			int[] elementosNovos = new int[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	// Retorna o tamanho da lista
	public int tamanho() {
		return this.tamanho;
	}
	
	public String toStringOld() {
		String s = "[";
		for (int i = 0; i < this.tamanho-1; i++) {
			s += this.elementos[i] + ", ";
		}
			if (this.tamanho > 0) s += this.elementos[this.tamanho-1];
			s += "]";
		return s.toString();
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i] + ", ");
		}
			if (this.tamanho > 0) 
				s.append(this.elementos[this.tamanho-1]);
			s.append("]");
		return s.toString();
	}
	
	public void imprime() {
		System.out.print("[");
		for(int i = 0; i < this.elementos.length-1; i++) {
			if(this.elementos[i] != 0)
			System.out.print(elementos[i] + ", ");
		}
		if(this.elementos[this.tamanho] != 0)
		System.out.print(this.elementos[this.elementos.length-1]);
		System.out.print("]");
	}
	
	public int busca(int posicao) {
		try {
			return this.elementos[posicao];
		} catch (Exception e) {
			System.out.println("Erro na busca. Posição inválida.");
			System.out.println(e.getMessage());
			return 0;
		}		
	}
	
	public Boolean verifica(int elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i] == elemento) {
				return true;
			}
		}
		return false;
	}
	
	public int verificaPosicao(int elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i] == elemento) {
				return i;
			}
		}
		return -1;
	}
	
	
	/*
	 * Questão 06
	 * Crie um método que recebe uma lista estática de inteiros e 
	 * divide os seus elementos em duas novas listas, 
	 * uma para os elementos pares e outra para os elementos ímpares. 
	 * Ao final, imprima as três listas na tela.
	 */
	public void divideLista() {
		//Criando novos vetores para receber os valores separados
		VetorProva listaPar = new VetorProva(this.tamanho);
		VetorProva listaImpar = new VetorProva(this.tamanho);
		//Verificação de números ímpares e pares
		for(int i = 0; i < this.elementos.length; i++) {
			if(elementos[i] % 2 == 0) {
				//Caso o elemento seja par, adiciona na lista par
				listaPar.adicionaNoFinal(elementos[i]);
			} else {
				//Caso o elemento seja impar, adiciona na lista impar
				listaImpar.adicionaNoFinal(elementos[i]);
			}
		}
		//Imprime as listas criadas na tela.
		System.out.println("Vetores com valores pares: "+ listaPar.toString());
		System.out.println("Vetores com valores ímpares: "+ listaImpar.toString());
	}
	
	/*
	 * 07. Crie um método que imprima a posição da última recorrência de 
	 * um determinado elemento em uma lista estática.
	 * 
	 * o que eu fiz
	 * 	public int elementosRepetidos() {
		int posicao = 0;
		for(int i = posicao; i < this.tamanho-1; i++) {
			if(elementos[i] == elementos[i+1]) {
				posicao++;
			}	
		}
		return posicao;
	 * 
	 * 
	 */
	
	public void ultimaRecorrencia(int elemento) {
		for(int i = this.tamanho-1; i >= 0; i--) {
			if(elemento == this.elementos[i]) {
				System.out.println("Posição da ultima recorrencia: " + i);
				break;
			}
		}
	}
	
	
}