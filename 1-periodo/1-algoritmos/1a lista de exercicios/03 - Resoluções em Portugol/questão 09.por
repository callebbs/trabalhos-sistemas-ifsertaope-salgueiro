programa
{
	inteiro numero, n1, r1, n2, r2, n3, r3
	funcao inicio()
	{
		escreva("Digite um número de três dígitos: ")
		leia(numero)

	n1 = numero / 100
	r1 = numero % 100
	r2 = r1 / 10
	r3 = r1 % 10

		escreva("O valor invertido é: ", r3, r2, n1)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */