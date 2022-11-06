print("Criando e escrevendo em arquivos de texto (modo w).")

arquivo = open('texto2.txt', 'w')
arquivo.write("Aluno: Benjamim Calleb Bezerra de Siqueira\n")
arquivo.write("Criando um arquivo de texto com Python\n")
arquivo.write("Arquivo criado através da atividade do Prof. Orlando\n")


print("Texto criado.")
arquivo.close()

print("Lendo o que foi criado: ")
arquivo = open('texto2.txt', 'r')
for linha in arquivo:
    linha = linha.rstrip()
    print(linha)
arquivo.close()