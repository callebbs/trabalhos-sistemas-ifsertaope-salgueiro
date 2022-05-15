public class Arvore {
	public No raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	
	public boolean isEmpty() {
		return this.raiz == null;
	}
	
	public void inserir(int elemento) {
		if(this.isEmpty()) {
			this.raiz = new No(elemento);
		} else {
			No atual = this.raiz;
			
			while(atual != null) {
				if(elemento < atual.getValor()) {
					if(atual.getEsquerda() == null) {
						No novo = new No(elemento);
						atual.setEsquerda(novo);
						novo.setPai(atual);
						return;
					}
					
					atual = atual.getEsquerda();
					
				} else {
					if(atual.getDireita() == null) {
						No novo = new No(elemento);
						atual.setDireita(novo);
						novo.setPai(atual);
						return;
					}
					
					atual = atual.getDireita();
				}
			}
		}
	}
	
	public No busca(int elemento) {
		No atual = this.raiz;
		
		while(atual != null) {
			if(atual.getValor() == elemento) return atual;
			if(elemento < atual.getValor()) atual = atual.getEsquerda();
			if(elemento >= atual.getValor()) atual = atual.getDireita();
		}
		
		return null;
	}
	
	public boolean busca2(int elemento) {
		No atual = this.raiz;
		
		while(atual != null) {
			if(atual.getValor() == elemento) return true;
			if(elemento < atual.getValor()) atual = atual.getEsquerda();
			if(elemento >= atual.getValor()) atual = atual.getDireita();
		}
		
		return false;
	}
	
	public void inserirRec(int elemento) {
		if(this.isEmpty()) {
			this.raiz = new No(elemento);
		}else {
			inserirRec(this.raiz, elemento);
		}
	}
	
	public void inserirRec(No no, int elemento) {
		if(elemento < no.getValor()) {
			if(no.getEsquerda() == null) {
				No novo = new No(elemento);
				no.setEsquerda(novo);
				novo.setPai(no);
				return;
			}
			inserirRec(no.getEsquerda(), elemento);
		}else {
			if(no.getDireita() == null) {
				No novo = new No(elemento);
				no.setDireita(novo);
				novo.setPai(no);
				return;
			}
			inserirRec(no.getDireita(), elemento);
		}
	}
	
	public No minimo() {
		if(isEmpty()) {
			return null;
		}else {
			No atual = this.raiz;
			while(atual.getEsquerda() != null) {
				atual = atual.getEsquerda();
			}
			return atual;
		}
	}
	
	public No minimoRec() {
		if(isEmpty()) {
			return null;
		}else {
			return minimoRec(this.raiz);
		}
	}
	
	public No minimoRec(No no) {
		if(no.getEsquerda() == null) {
			return no;
		}else {
			return minimoRec(no.getEsquerda());
		}
	}
        
        
    	public No maximo() {
		if(isEmpty()) {
			return null;
		}else {
			No atual = this.raiz;
			while(atual.getDireita() != null) {
				atual = atual.getDireita();
			}
			return atual;
		}
	}      
        public No maximoRec() {
		if(isEmpty()) {
			return null;
		}else {
			return maximoRec(this.raiz);
		}
	}
        
	public No maximoRec(No no) {
		if(no.getDireita() == null) {
			return no;
		}else {
			return maximoRec(no.getDireita());
		}
	}        
        
}