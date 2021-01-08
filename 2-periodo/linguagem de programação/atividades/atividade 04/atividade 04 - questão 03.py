'''
3) Desenvolva um programa que receba dados para uma matriz 3x5 de inteiros, calcule e mostre:
a)    Todos os elementos da matriz organizados em linhas e colunas
b)    A quantidade de elementos pares
c)    A soma dos elementos ímpares
d)    A média aritmética de todos os elementos
'''

linha1 = []
linha2 = []
linha3 = []
contadorPares = 0
somaImpares = 0
somaElementos = 0

#recebimento dos elementos e criação da matriz
for i in range(5):
    num = int(input("Digite os elementos da matriz 3x5: "))
    linha1.append(num)

for i in range(5):
    num = int(input("Digite os elementos da matriz 3x5: "))
    linha2.append(num)

for i in range(5):
    num = int(input("Digite os elementos da matriz 3x5: "))
    linha3.append(num)

matriz = [linha1, linha2, linha3]
print("A matriz formada foi:")
print(linha1)
print(linha2)
print(linha3)
print("-" * 35)

#verificação, contagem dos elementos pares e soma dos elementos impares
for valor in linha1:
    somaElementos = somaElementos + valor
    if valor % 2 == 0:
        contadorPares = contadorPares + 1
    else:
        somaImpares = somaImpares + valor

for valor in linha2:
    somaElementos = somaElementos + valor
    if valor % 2 == 0:
        contadorPares = contadorPares + 1
    else:
        somaImpares = somaImpares + valor

for valor in linha3:
    somaElementos = somaElementos + valor
    if valor % 2 == 0:
        contadorPares = contadorPares + 1
    else:
        somaImpares = somaImpares + valor

print(f"Quantidade de elementos pares: {contadorPares}.")
print(f"A soma dos elementos ímpares: {somaImpares}")

mediaElementos = int(somaElementos / 15)

print(f"A média aritmética dos elementos desta matriz é de {mediaElementos}.")
print("-" * 35)