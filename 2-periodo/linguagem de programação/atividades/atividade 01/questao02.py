'''
02
Escreva um programa que recebe um número de dois dígitos e o apresenta de forma invertida. Exemplo: 43 → 34. Dica: use o operador % (resto da divisão).
'''

numero = int(input("Digite um número de dois dígitos: "))

numero1 = numero // 10
numero2 = (numero % 10) * 10

numerofinal = numero2 + numero1

print("O número inverso de {} é {}.".format(numero, numerofinal))