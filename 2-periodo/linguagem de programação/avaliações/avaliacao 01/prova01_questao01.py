#1ª Avaliação - Linguagem de Programação

#Questão 01

nome = str(input("Digite o seu nome: "))
tamanho = len(nome)
espaco = 10  
# Outer loop
for i in range(0, tamanho):
    espaco = espaco - 1
    # Inner loop 1 
    for j in range(espaco, 1, -1):
        print(" ",end="")
    # Inner loop 2
    for k in range(0, i+1):
        print(nome[k],end="")
    # Inner loop 3
    for n in range(0, i):
        print(nome[n],end="")
    print()