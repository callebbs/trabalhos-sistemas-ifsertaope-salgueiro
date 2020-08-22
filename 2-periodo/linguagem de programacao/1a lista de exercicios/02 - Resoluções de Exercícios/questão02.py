#QUESTÃO 02

'''
Crie um programa que solicite o nome do usuário e o
imprima no formato de escada invertida.
'''

#================================================================

nome = str(input("Digite seu nome: ")).upper()
tamanho = (len(nome))

for i in range(0, tamanho):
    print(" {0:>10}".format(nome[i:tamanho]))


    
