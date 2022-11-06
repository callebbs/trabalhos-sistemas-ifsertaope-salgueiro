print("Abrindo arquivo de texto e mostrando seu conteúdo com o for:")

arquivo = open('texto.txt','r')
for linha in arquivo:
    linha = linha.rstrip()
    print(linha)

arquivo.close()