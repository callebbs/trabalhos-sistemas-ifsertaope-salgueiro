
public class No {
	//Guarda a refer�ncia para o pr�ximo elemento
	private No proximo;
	// Valor
	private Object elemento;
	
	public No(Object elemento, No proximo) {
		this.proximo = proximo;
		this.elemento = elemento;
	}
	
	public No(Object elemento) {
		this.elemento = elemento;
	}
	
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

}
