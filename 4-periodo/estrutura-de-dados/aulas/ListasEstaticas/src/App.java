
public class App {

	public static void main(String[] args) {
		
		Vetor lista = new Vetor(3);
		lista.adicionaNoFinal("Salgueiro");
		lista.adicionaNoFinal("Cabrobo");
		lista.adicionaNoFinal("Oroco");
		System.out.print(lista);
		System.out.println("\nTamanho da lista: " + lista.tamanho());
		System.out.println("Valor da posicao: " + lista.busca(2));
		System.out.println("O elemento esta presente? " + lista.verifica("Salgueiro"));
		System.out.println("Adiciona Petrolina: " + lista.adiciona(3, "Petrolina"));
		System.out.println(lista);
		System.out.println("Removendo elemento: " + lista.busca(0));
		lista.remove(0);
		System.out.println(lista);
		
		int pos = lista.verificaPosicao("Petrolina");
		if (pos > -1) {
			lista.remove(pos);
		}
		System.out.println(lista);
		
		System.out.println("=============================");
		VetorGenerico listaGenerica = new VetorGenerico(3);
		listaGenerica.adiciona(0, "Star Wars");
		listaGenerica.adicionaNoFinal(77);
		listaGenerica.adicionaNoFinal(true);
		listaGenerica.adicionaNoFinal(lista);
		
		System.out.println(listaGenerica);
	}

}
