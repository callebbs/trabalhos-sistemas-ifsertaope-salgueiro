programa
{
	inteiro numero, resultado
	funcao inicio()
	{
		escreva("Escreva um número: ")
		leia(numero)
		resultado = numero % 7

		se(resultado == 0) {
			escreva("O número é divisível por 7.")
		}
		senao {
			escreva("O número não é divisível por 7.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */