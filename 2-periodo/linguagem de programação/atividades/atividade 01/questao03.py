'''
03
Crie um programa que recebe o valor de um produto e dá um desconto de 10%. Apresente o resultado na tela
'''

valor = float(input("Digite o valor do produto para o cálculo do desconto: "))

desconto = valor / 100 * 10

valorfinal = valor - desconto

print("O produto de valor R${} com desconto de 10 por cento: {:.2f}.".format(valor, valorfinal))