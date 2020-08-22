programa
{
	real numero, numeroMenor
	inteiro contador = 2
	funcao inicio()
	{
	escreva("Digite um número: ")
	leia(numero)

	numeroMenor = numero
	
	enquanto (contador <= 10) {
		escreva("Digite um número: ")
		leia(numero)
		contador++

		se(numero < numeroMenor) {
			numeroMenor = numero
		}
	}
	escreva("O menor número digitado foi: ", numeroMenor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 61; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */