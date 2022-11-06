'''
Crie um programa que solicite o nome do usuário e o imprima no formato de escada invertida.  

Exemplo: 
Digite seu nome: FULANO 
FULANO 
ULANO 
 LANO 
 ANO 
 NO 
 O

'''

nome = str(input("Digite o seu nome: ")).upper()
tamanho = len(nome)

for i in range(0, tamanho):
    #print(f"{nome[i:tamanho]}")
    print(" {>2:>10}".format(nome[i:tamanho]))