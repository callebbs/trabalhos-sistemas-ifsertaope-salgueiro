programa
{
	inteiro numero1, numero2
	funcao inicio()
	{
		escreva("Digite um número: ")
		leia(numero1)
		escreva("Agora digite outro número: ")
		leia(numero2)

		se(numero1 > numero2) {
			escreva("Ordem crescente:\n1-", numero2, "\n", "2-", numero1)
		}
		senao {
			escreva("Ordem crescente:\n1-", numero1, "\n", "2-", numero2)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 248; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */