'''
01
Escreva um programa que recebe uma temperatura em graus Celsius e a apresenta em graus Fahrenheit, de acordo com a fórmula abaixo:
Fahrenheit = (1,8 x Celsius) + 32
'''

temperatura = float(input("Digite a temperatura em Graus Celcius: "))

print("Convertendo {} graus Celcius em Farenheit fica: {}".format(temperatura, ((1.8 * temperatura) + 32)))
