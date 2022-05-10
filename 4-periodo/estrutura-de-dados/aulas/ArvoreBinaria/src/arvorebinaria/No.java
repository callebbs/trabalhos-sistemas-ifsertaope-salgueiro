public class No {
	private int valor;
	private No esquerda;
	private No direita;
	private No pai;
	
	public No(int valor) {
		super();
		this.valor = valor;
		this.esquerda = null;
		this.direita = null;
		this.pai = null;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public No getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	public No getDireita() {
		return direita;
	}
	public void setDireita(No direita) {
		this.direita = direita;
	}
	public No getPai() {
		return pai;
	}
	public void setPai(No pai) {
		this.pai = pai;
	}	
}