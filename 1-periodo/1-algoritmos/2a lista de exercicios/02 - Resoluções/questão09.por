programa
{
	
	//função que recebe os valores em horas e minutos e os transforma em segundos.
	//os segundos recebidos são apenas salvos na variável
	//após receber os valores, eles são somados e salvos na variável segundosTotais
	funcao inteiro paraSegundos(inteiro num1, inteiro num2, inteiro num3) {
		
		inteiro segundosH, segundosM, segundos, segundosTotais
		segundosH = num1 * 3600
		segundosM = num2 * 60
		segundos = num3

		retorne segundosH + segundosM + segundos
	}
	
	funcao inicio()
	{

	inteiro hora1, minuto1, segundos1
	
	escreva("Digite a quantidade de horas: ")
	leia(hora1)
	escreva("Digite a quantidade de minutos: ")
	leia(minuto1)
	escreva("Digite a quantidade de segundos: ")
	leia(segundos1)
	
	escreva(hora1, " hora(s), ", minuto1, " minuto(s) e ", segundos1, " segundo(s) em segundo(s) é: ", paraSegundos(hora1, minuto1, segundos1), " segundos")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */