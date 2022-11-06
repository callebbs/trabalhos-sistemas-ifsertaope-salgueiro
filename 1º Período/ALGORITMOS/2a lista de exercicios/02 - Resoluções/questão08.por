programa
{
	
	funcao inteiro fat(inteiro n) {
		se(n == 1)
			retorne 1
		senao
			retorne n * fat(n - 1)
	}
	
	funcao inicio()
	{

	inteiro numero1

	escreva("Digite um número para realizar o fatorial: ")
	leia(numero1)
	escreva(numero1, " fatorial é: ", fat(numero1))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 79; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */