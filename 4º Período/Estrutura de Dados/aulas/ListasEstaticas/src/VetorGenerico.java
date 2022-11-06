
public class VetorGenerico {
	private Object[] elementos;
	private int tamanho;
	
	
	public VetorGenerico(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	private boolean posicaoValida(int posicao) {
		if((posicao >= 0) && (posicao <= this.tamanho)) 
				return true;
			return false;
	}
	
	public void adicionaNoFinal(Object elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
		} else {
			this.aumentaCapacidade();
			this.elementos[this.tamanho] = elemento;
		
		}
		this.tamanho++;
	}
	
	public boolean adiciona(int posicao, Object elemento) {
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
			Object[] elementosNovos = new Object[this.elementos.length * 2];
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
			if(this.elementos[i] != null)
			System.out.print(elementos[i] + ", ");
		}
		if(this.elementos[this.tamanho] != null)
		System.out.print(this.elementos[this.elementos.length-1]);
		System.out.print("]");
	}
	
	public Object busca(int posicao) {
		try {
			return this.elementos[posicao];
		} catch (Exception e) {
			System.out.println("Erro na busca. Posição inválida.");
			System.out.println(e.getMessage());
			return "";
		}		
	}
	
	public Boolean verifica(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return true;
			}
		}
		return false;
	}
	
	public int verificaPosicao(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
}
