programa
{
	inteiro tabuada, resultado
	funcao inicio()
	{
		escreva("Digite o número para mostrar a tabuada: ")
		leia(tabuada)

		escreva("--------------")

			para (inteiro i = 1; i <= 10; i++) {

			resultado = tabuada * i

			escreva("\n", tabuada, " X ", i, " = ", resultado)
			}
		escreva("\n--------------")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */