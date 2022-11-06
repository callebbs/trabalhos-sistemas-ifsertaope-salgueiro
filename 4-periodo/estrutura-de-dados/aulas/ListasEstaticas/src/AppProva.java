
public class AppProva {

	public static void main(String[] args) {
		VetorProva prova = new VetorProva(9);
		
		prova.adicionaNoFinal(1);
		prova.adicionaNoFinal(2);
		prova.adicionaNoFinal(2);
		prova.adicionaNoFinal(4);
		prova.adicionaNoFinal(5);
		prova.adicionaNoFinal(6);
		prova.adicionaNoFinal(7);
		prova.adicionaNoFinal(10);
		prova.adicionaNoFinal(10);
		
		System.out.println("O vetor criado foi: " + prova.toString());
		
		prova.divideLista();
		prova.ultimaRecorrencia(2);
		
		
		
		

	}

}
