print("Retornando somente as linhas que contenha uma palavra escolhida pelo usuário.")
palavra = input("Digite a palavra para busca: ")

arquivo = open('texto.txt', 'r')
contador = 0
for linha in arquivo:
	linha = linha.rstrip()
	if palavra in linha:
		contador = contador + 1
		print(linha)
	else:
		print("palavra não encontrada.")

print(f"Foram encontradas {contador} linhas.")
arquivo.close()