'''
Desenvolva um programa que recebe duas listas de caracteres: lista A e lista B. 
Implemente funções para realizar a união, a interseção e a diferença dos elementos dessas duas listas. 
Depois das entradas o programa deve apresentar os retornos de cada uma das funções criadas na tela. 
'''

def uniaoLista(lista1, lista2):
    return lista1 + lista2

def intersecaoLista(lista1, lista2):
    interseclist = []
    for i in lista1:
        if i in lista2 and i in lista1:
            interseclist.append(i)
    return interseclist

def diferencaLista(lista1, lista2):
    diflista = []
    for i in lista1:
        if i not in lista2:
            diflista.append(i)
    for i in lista2:
        if i not in lista1:
            diflista.append(i)
    return diflista

controle = "sim"

lista1 = []
lista2 = []

while controle == "sim":
    lista1.append(input("Digite um elemento para ser adicionado a primeira lista: "))
    controle = input("Deseja adicionar mais elementos? Digite sim ou não: ")

controle = "sim"

while controle == "sim":
    lista2.append(input("Digite um elemento para ser adicionado a segunda lista: "))
    controle = input("Deseja adicionar mais elementos? Digite sim ou não: ")

import os
os.system('cls' if os.name == 'nt' else 'clear')

print("-" * 35)
print(f"1ª Lista criada: {lista1}")
print(f"2ª Lista criada: {lista2}")
print("-" * 35)
print(" ")
print(" * A união das duas listas é: ")
print(uniaoLista(lista1, lista2))
print("-" * 35)
print(" ")
print("A interseção das duas listas é: ")
print("-" * 35)
print(intersecaoLista(lista1, lista2))
print("-" * 35)
print(" ")
print("Os elementos que diferem nas duas listas são: ")
print("-" * 35)
print(diferencaLista(lista1, lista2))
print("-" * 35)