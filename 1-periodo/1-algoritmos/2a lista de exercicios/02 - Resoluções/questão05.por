programa
{
	
	funcao inicio()
	{

	inteiro Valores1[10], Valores2[10], Resultado[10]

	//estrutura de repetição para receber os 10 primeiros valores e salvar no primeiro vetor
	para(inteiro i = 0; i < 10; i++) {
		escreva("Digite o valor para multiplicar: ")
		leia(Valores1[i])
		}
		limpa()

	//estrutura de repetição para receber os 10 segundos valores e salvar no segundo vetor
	para(inteiro i = 0; i < 10; i++) {
		escreva("Digite o valor ser multiplicado: ")
		leia(Valores2[i])
		}
		limpa()

	para(inteiro i = 0; i <= 9; i++) {

		Resultado[i] = Valores1[i] * Valores2[i]
	}

		escreva("O vetor resultante é: {")
	para(inteiro i = 0; i < 10; i++) {
		escreva(Resultado[i], ", ")
	}
	escreva("}")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 583; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */