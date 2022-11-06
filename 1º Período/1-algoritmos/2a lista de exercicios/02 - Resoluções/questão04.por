programa
 {
	
	funcao inicio()
	{
	
	real nota1, nota2, media = 0, mediaTotal = 0
	inteiro AlunosAprov = 0, AlunosRecup = 0, AlunosReprov = 0
	
	para(inteiro contador = 1; contador <= 10; contador++) {
		escreva("Digite a primeira nota do aluno nº", contador, ": ")
		leia(nota1)
		escreva("Digite a segunda nota do aluno nº", contador, ": ")
		leia(nota2)
		limpa()

		//cálculo da média das notas individuais de cada aluno
		media = (nota1 + nota2) / 2
		escreva("A média do ", contador, "º aluno(a) é de: ", media, "\n")

		mediaTotal = mediaTotal + media

		//estrutura de verificação se o aluno está reprovado, em recuperação ou aprovado.
		se(media <= 3) {
			escreva("Ele(a) está REPROVADO.\n\n")
			AlunosReprov++
		}
		senao se(media > 3 e media < 7) {
			escreva("Ele(a) está em RECUPERAÇÃO.\n\n")
			AlunosRecup++
		}
		senao {
			escreva("Ele(a) está APROVADO.\n\n")
			AlunosAprov++
		}
	}
		limpa()

		mediaTotal = mediaTotal / 10
		
		escreva("Resultado da turma:")
		escreva("\n-----------------------------------------")
		escreva("\nQuantidade de alunos reprovados: ", AlunosReprov)
		escreva("\nQuantidade de alunos em recuperação: ", AlunosRecup)
		escreva("\nQuantidade de alunos aprovados: ", AlunosAprov)
		escreva("\nA média total da turma: ", mediaTotal, "\n")
		escreva("-----------------------------------------")
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 876; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */