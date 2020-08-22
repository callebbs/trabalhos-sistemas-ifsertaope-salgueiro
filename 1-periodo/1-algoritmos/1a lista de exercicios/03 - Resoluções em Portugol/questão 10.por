programa
{
	real altura, peso
	inteiro imc
	
	funcao inicio()
	{
		escreva("Digite seu peso: ")
		leia(peso)
		escreva("Digite sua altura: ")
		leia(altura)

		imc = peso / (altura * altura)

		se(imc < 20) {
			escreva("Seu IMC é de: ", imc, " e sua faixa de risco é: Abaixo do peso.")
		}
		se(imc >= 20 e imc <= 25) {
			escreva("Seu IMC é de: ", imc, " e sua faixa de risco é: Peso normal.")
		}
		se(imc > 25 e imc <=30) {
			escreva("Seu IMC é de: ", imc, " e sua faixa de risco é: Acima do peso.")
		}
		se(imc > 30) {
			escreva("Seu IMC é de: ", imc, " e sua faixa de risco é: Obesidade.")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */