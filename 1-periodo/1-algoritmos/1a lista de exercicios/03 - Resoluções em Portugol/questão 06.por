programa
{
	inteiro valorTotal, n100, r100, n50, r50, n10, r10, n1, r1
	
	funcao inicio()
	
	{
	
	escreva("Digite o valor da conta: ")
	leia(valorTotal)

	n100 = valorTotal / 100
	r100 = valorTotal % 100
	n50 = r100 / 50
	r50 = r100 % 50
	n10 = r50 / 10
	r10 = r50 % 10
	n1 = r10 / 1

	escreva("=======================================\n")
	escreva("Notas necessárias para o pagamento: \nNota de 100: ", n100, "\nNota de 50: ", n50, "\nNota de 10: ", n10, "\nNota de 1: ", n1)
	escreva("\n=======================================")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */