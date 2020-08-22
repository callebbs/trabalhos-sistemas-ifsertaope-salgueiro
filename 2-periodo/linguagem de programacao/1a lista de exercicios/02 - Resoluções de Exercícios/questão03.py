#QUESTÃO 03

'''
Desenvolva um programa que leia 9 (nove) números inteiros e os armazene numa matriz 3x3,
em seguida mostre na tela os elementos que estão no triângulo inferior direito da matriz.
'''
#----------------------------------------------------------------------------------------

matriz = []
lista1 = []
lista2 = []
lista3 = []

for i in range(0, 3):
    lista1.append(int(input("Digite 09 números para criar uma matriz 3x3: ")))

for i in range(0, 3):
    lista2.append(int(input("Digite 09 números para criar uma matriz 3x3: ")))

for i in range(0, 3):
    lista3.append(int(input("Digite 09 números para criar uma matriz 3x3: ")))

matriz = [lista1, lista2, lista3]

import os
os.system('cls')

print("A matriz digitada foi:")
print("=" * 30)
print(matriz[0])
print(matriz[1])
print(matriz[2])
print("=" * 30, "\n")

print("Os elementos do triângulo inferior direito da matriz são: ")
print("#" * 30)
print(matriz[0] [1:2])
print(matriz[1] [1:3])
print(matriz[2])
print("#" * 30)