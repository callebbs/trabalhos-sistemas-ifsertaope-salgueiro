programa
{
	
	funcao inicio()
	{

	inteiro vetor1[15], QtdNum = 1, menornumero, i2 = 0

	escreva("Digite um número: ")
	leia(vetor1[i2])
	menornumero = vetor1[i2]
	
	//Recebimento dos números nos vetores
	//para(inteiro i = 0; i < 1; i++) {
	//	escreva("Digite um número: ")
	//	leia(vetor1[i])
	//	menornumero = vetor1[i]
	//}

	para(inteiro i = 1; i < 15; i++) {
		escreva("Digite um número: ")
		leia(vetor1[i])
		
		se(vetor1[i] < menornumero) {
			menornumero = vetor1[i]
		}
		}
	escreva("No vetor: {")
	//escrevendo o vetor na tela
	para(inteiro i = 0; i < 15; i++) {
		escreva(vetor1[i], ",")
	}
	escreva("}, o menor número é ", menornumero, " e se encontra na(s) posição(ões): ")

	//mostrando qual o menor valor dentro do vetor e em que posição se encontra
	para(inteiro i = 0; i < 15; i++) {
		se(vetor1[i] == menornumero) {
			escreva(i, " ")
		}
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor1, 7, 9, 6}-{menornumero, 7, 33, 11}-{i2, 7, 46, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */