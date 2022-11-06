print("Retornando somente as linhas que possuem a palavra Sistemas")

arquivo = open('texto.txt', 'r')
contador = 0
for linha in arquivo:
	linha = linha.rstrip()
	if 'Sistemas' in linha:
		contador = contador + 1
		print(linha)

print(f"Foram retornadas {contador} linhas")
arquivo.close()