
public class App {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.adicionaNoInicio("Star Wars");
		lista.adicionaNoInicio("Jedi Tales");
		lista.adicionaNoFinal("Clone Wars");
		System.out.println(lista);
		lista.adiciona(1, "Calleb");
		System.out.println(lista);
		

	}

}
