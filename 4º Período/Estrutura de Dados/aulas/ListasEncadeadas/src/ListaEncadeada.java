
public class ListaEncadeada {
	private No inicio;
	private No fim;
	private int totalDeElementos;
	
	public No getInicio() {
		return inicio;
	}
	public void setInicio(No inicio) {
		this.inicio = inicio;
	}
	public No getFim() {
		return fim;
	}
	public void setFim(No fim) {
		this.fim = fim;
	}
	public int getTotalDeElementos() {
		return totalDeElementos;
	}
	public void setTotalDeElementos(int totalDeElementos) {
		this.totalDeElementos = totalDeElementos;
	}
	
	public void adicionaNoInicio(Object elemento) {
		// Cria um novo nó e define seu próximo No
		No novo = new No(elemento, this.inicio);
		// Inicio aponta para o novo elemento, sendo assim o inicio da lista.
		this.inicio = novo;
		// Verifica se a lista é vazia, se não for, fim aponta para novo.
		if(this.totalDeElementos == 0) this.fim = novo;
		// Incrementa o total de elementos, que diz qual o tamanho da lista.
		this.totalDeElementos++;
	}
	
	public void adicionaNoFinal(Object elemento) {
		// Verifica se a lista está vazia, caso esteja, chama o método
		// adicionaNoInicio para setar também o início da lista.
		if(this.totalDeElementos == 0) this.adicionaNoInicio(elemento);

		No novo = new No(elemento);
		// O próximo do antigo fim, é o novo elemento.
		this.fim.setProximo(novo);
		// Atualiza a referencia pra fim
		this.fim = novo;
		this.totalDeElementos++;
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
	
	public boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private No pegaNo(int posicao) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		No atual = this.inicio;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	public void adiciona(int posicao, Object elemento) {
		if(posicao == 0) this.adicionaNoInicio(elemento);
		if(posicao == this.totalDeElementos-1) this.adicionaNoFinal(elemento);
		No anterior = this.pegaNo(posicao-1);
		No novo = new No(elemento, anterior.getProximo());
		anterior.setProximo(novo);
		this.totalDeElementos++;
	}
	
	public Object pega(int posicao) {
		return this.pegaNo(posicao).getElemento();
	}
	
	public void removeDoInicio() {
		this.inicio = this.inicio.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) this.fim = null;
	}
	
	public void removeDoFinal() {
		if(this.totalDeElementos == 0) { 
			System.out.println("A lista está vazia.");
		} else if(this.totalDeElementos == 1) {
			this.removeDoInicio();
		} else {
			No penultimo = this.pegaNo(this.totalDeElementos-2);
			penultimo.setProximo(null);
			this.fim = penultimo;
			this.totalDeElementos--;
		}
			
	}
	
	public boolean remove(int posicao) {
		if(this.posicaoValida(posicao)) {
			if(posicao == 0) {
				this.removeDoInicio();
				return true;
			} else if(posicao == this.totalDeElementos-1) {
				this.removeDoFinal();
				return true;
			} else {
				No anterior = this.pegaNo(posicao-1);
				No atual = anterior.getProximo();
				anterior.setProximo(atual.getProximo());
				this.totalDeElementos--;
				return true;
			}
		} else {
			return false;
		}
	}
	
	public boolean contem(Object elemento) {
		No atual = this.inicio;
		for(int i = 0; i < this.totalDeElementos; i++) {
			if(atual.getElemento().equals(elemento)) return true;
			atual = atual.getProximo();
		}
		return false;
	}
	
	public int tamanho() {
		return this.totalDeElementos;
	}
}
