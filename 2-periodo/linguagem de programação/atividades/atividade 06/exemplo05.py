print("Contando linhas do arquivo...")
contador = 0
arquivo = open('texto.txt', 'r')
for linha in arquivo:
    contador = contador + 1
print(f"Número de linhas no arquivo: {contador}")

arquivo.close()
