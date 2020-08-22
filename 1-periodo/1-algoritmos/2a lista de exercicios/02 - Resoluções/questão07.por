programa
{
	
	funcao maior(inteiro num1, inteiro num2, inteiro num3) {
		se(num1 > num2 e num1 > num3) {
			escreva("O maior número é: ", num1)
		}
		senao se(num2 > num1 e num2 > num3) {
			escreva("O maior número é: ", num2)
		}
		senao se(num3 > num1 e num3 > num2) {
			escreva("O maior número é: ", num3)
		}
		}

	funcao inicio() {

		inteiro num1, num2, num3

		escreva("Digite um numero: ")
		leia(num1)
		escreva("Digite um numero: ")
		leia(num2)
		escreva("Digite um numero: ")
		leia(num3)
		
		maior(num1, num2, num3)
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */