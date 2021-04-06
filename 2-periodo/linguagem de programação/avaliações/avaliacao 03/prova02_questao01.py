'''
Desenvolva um programa Python que leia o conteúdo de um arquivo texto e copia esse conteúdo para um segundo arquivo texto, mas, com todas as letras convertidas em minúsculas. Observação: a função que converte as letras em minúsculas deve ser implementada por você (dica: pesquise sobre a tabela ASCII).
'''

def Minusculo(texto): 
    lista_ascii_maiuscula = []
    lista_ascii_minuscula = []

    tamanho_total = len(texto1)

    #descobrindo o código ascii das letras maiúsculas
    for i in range(0, tamanho_total):
        lista = []
        tamanho = len(texto1[i])
        for j in range(0, tamanho):
            if ord(texto1[i][j]) != 10:
                lista.append(ord(texto1[i][j]))
        lista_ascii_maiuscula.append(lista)

    #convertendo as letras maiúsculas em minúsculas pelo código ascii, somando + 32
    tamanho_maiusculo = len(lista_ascii_maiuscula)
    for i in range(0, tamanho_maiusculo):
        lista = []
        tamanho = len(lista_ascii_maiuscula[i])
        #print(tamanho)
        for j in range(0, tamanho):
            if lista_ascii_maiuscula[i][j] != 32:
                lista.append(lista_ascii_maiuscula[i][j] + 32)
            #mantendo o espaço como espaço, caso contrário iria se transformar em outro caractere
            elif lista_ascii_maiuscula[i][j] == 32:
                lista.append(lista_ascii_maiuscula[i][j])
        lista_ascii_minuscula.append(lista)
        tamanho_minusculo = len(lista_ascii_minuscula)

        lista_texto_convertido = []
        for i in range(0, tamanho_minusculo):
            lista = []
            texto = ''
            tamanho = len(lista_ascii_minuscula[i])
            for j in range(0, tamanho):
                texto = texto + chr(lista_ascii_minuscula[i][j])
            texto = texto + '\n'
            lista_texto_convertido.append(texto)
    
    return lista_texto_convertido

import os
os.remove("texto_convertido.txt") 

print("-" * 80)
print("Abrindo arquivo com texto em letras maiúsculas para conversão...")
arquivo = open('texto.txt', 'r')
texto1 = arquivo.readlines()
arquivo.close()

print("-" * 80)
print("Convertendo texto...")
texto2 = Minusculo(texto1)
tamanho_texto = len(texto2)

print("-" * 80)
print("Copiando os textos convertidos letras minúsculas para o novo arquivo...")
arquivo = open('texto_convertido.txt', 'a')
for i in range(0, tamanho_texto):
    arquivo.write(texto2[i])
arquivo.close()
print("Cópia concluída com sucesso.")
print("Programa finalizado.")
print("-" * 80)