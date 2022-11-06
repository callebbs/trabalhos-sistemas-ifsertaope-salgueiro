programa
{
	inteiro salario, reajuste, novosalario
	funcao inicio()
	{
	escreva("Digite seu salário: ")
	leia(salario)

	se(salario >= 800) {
		escreva("Você não receberá reajuste")
	}
	senao {
		reajuste = (salario * 0.05)
		novosalario = salario + reajuste
		escreva("Seu novo salário é: ", novosalario)

	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */