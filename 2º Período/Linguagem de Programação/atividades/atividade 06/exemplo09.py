print("Acrescentando texto ao arquivo criado usando o modo a")
texto = input("Digite uma frase para acrescentar ao arquivo:\n")

arquivo = open('texto2.txt', 'a')
arquivo.write(texto + "\n")
print("Texto adicionado com sucesso.")
arquivo.close()

print("Lendo o que foi criado: \n")
arquivo = open('texto2.txt', 'r')
for linha in arquivo:
    linha = linha.rstrip()
    print(linha)
arquivo.close()