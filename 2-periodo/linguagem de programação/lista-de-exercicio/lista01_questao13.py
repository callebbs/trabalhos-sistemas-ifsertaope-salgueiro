'''
Crie uma função que, dados uma lista de String e um padrão (uma String), retorne todos os 
elementos da lista com suas letras trocadas (maiúsculas por minúsculas e vice-versa) 
e na ordem  inversa, menos o padrão. 

Obs.: É proibido usar qualquer função da biblioteca de Python que inverta listas. 
'''

lista_palavras = []
inverte = []

def inverteRetira (lista_palavras, padrao):
    for i in range(0, len(lista_palavras)):
        palavras = ''
        for j in range(0,len(lista_palavras[i])):
            if lista_palavras[i] != padrao:
                if lista_palavras[i][j] == lista_palavras[i][j].upper():
                    palavras += (lista_palavras[i][j].lower())  
                else:
                    palavras += (lista_palavras[i][j].upper())
                inverte.append(palavras)
    
    for i in range((len(inverte)-1), -1,-1):
        print(inverte[i], end = ' ')

numero = int(input("Digite a quantidade de palavras para inverter: "))

for i in range (0, numero):
    palavra = input(f"Digite a {i}ª palavra: ")
    lista_palavras.append(palavra)
padrao = input("Digite a palavra padrão: ")

inverteRetira(lista_palavras, padrao)