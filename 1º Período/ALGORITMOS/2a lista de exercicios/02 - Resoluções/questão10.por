programa
{
	//função que recebe o número e divide ele por 10 até o resultado ser 0
	funcao inteiro qtdDigitos(inteiro num1) 
	{
		inteiro contador = 0
		
		enquanto(num1 != 0) {
		contador++
		num1 = num1 / 10	
		}
	retorne contador
	}
	
	funcao inicio()
	{

	//escreve na tela a quantidade de dígidos do numero digitado pelo usuário
	inteiro numero1
	escreva("Digite um número: ")
	leia(numero1)
	escreva("o número ", numero1, " contém ", qtdDigitos(numero1), " dígitos.")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */