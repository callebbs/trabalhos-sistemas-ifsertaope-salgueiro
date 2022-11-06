package listas;

public class ListasDuplaEncadeadas {
	private No inicio;
	private No fim;
	private int totalDeElementos;
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private No pegaNo (int posicao) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inálida!");
		}
		No atual = this.inicio;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	@Override
	public String toString() {
		if(this.totalDeElementos == 0) return "[]";
		
		StringBuilder builder = new StringBuilder("[");
		
		//Nova forma de percorrer a lista
		No atual = this.inicio;
		for(int i = 0; i < this.totalDeElementos-1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			
			//A cada repetição, o próximo elemento é selecionado.
			//É o que faz percorrer a lista.
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento());
		builder.append("]");
		return builder.toString();	
	}
	
	public void adicionaNoInicio(Object elemento) {
		if(this.totalDeElementos == 0) {
			No novo = new No(elemento);
			this.inicio = novo;
			this.fim = novo;
		} else {
			No novo = new No(elemento, this.inicio);
			this.inicio.setAnterior(novo);
			this.inicio = novo;
		}
		this.totalDeElementos++;
	}
	
	public void adicionaNoFinal(Object elemento) {
		if(this.totalDeElementos == 0) {
			this.adicionaNoInicio(elemento);
		} else {
			No novo = new No(elemento);
			this.fim.setProximo(novo);
			novo.setAnterior(this.fim);
			this.fim = novo;
			this.totalDeElementos++;
		}
	}
	
	public void adiciona(int posicao, Object elemento) {
		if(this.posicaoValida(posicao)) {
			if(posicao == 0) {
				this.adicionaNoInicio(elemento);
			} else {
				No anterior = this.pegaNo(posicao-1);
				No proximo = anterior.getProximo();
				No novo = new No(elemento, proximo);
				anterior.setProximo(novo);
				proximo.setAnterior(novo);
				novo.setAnterior(anterior);
				this.totalDeElementos++;
			}
		} else if (posicao == this.totalDeElementos) {
			this.adicionaNoFinal(elemento);
		} else {
			System.out.println("Posição inválida.");
		}
	}
	


}
