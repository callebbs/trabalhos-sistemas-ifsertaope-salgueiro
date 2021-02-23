#1ª Avaliação - Linguagem de Programação

#Questão 02

contador = 1
lista = []
posicoes = []

while contador != 0:
    numero = int(input("Digite um número: "))
    contador = numero
    if numero != 0:
        lista.append(numero)
    else:
        break

repeticoes = 0
maior = 0

for i in range(0, len(lista)):
    if lista[i] >= maior:
        maior = lista[i]

for i in range(0, len(lista)):
    if lista[i] == maior:
        repeticoes = repeticoes + 1

for i in range(0, len(lista)):
    if maior == lista[i]:
        posicoes.append(i)

print(f"Na lista {lista}, o maior número foi {maior}, se repete {repeticoes} vezes nas posições: {posicoes}")