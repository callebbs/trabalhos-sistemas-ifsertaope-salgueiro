'''
2) Faça um programa que receba 10 números inteiros e os armazene numa lista, em seguida calcule e mostre da lista:
a)    Os números pares
b)    A quantidade de números pares
c)    Os números ímpares
d)    O somatório dos números ímpares
'''
numeros = []
numerosPares = []
numerosImpares = []
contadorPares = 0
contadorImpares = 0

#recebendo os valores e guardando numa lista
for i in range(10):
    num = int(input("Digite um numero: "))
    numeros.append(num)

print(f"Numeros recebidos.\n A lista digitada foi {numeros}.")

print("-" * 70)
print("Analisando os números digitados...")

#verificando numeros pares e impares
for valor in numeros:
    if valor % 2 == 0:
        numerosPares.append(valor)
        contadorPares = contadorPares + 1
    else:
        numerosImpares.append(valor)
        contadorImpares = contadorImpares + 1

print(f"Foram digitados {contadorPares} números pares, que foram: {numerosPares}.")
print(f"Foram digitados {contadorImpares} números ímpares, que foram: {numerosImpares}.")
print("-" * 70)