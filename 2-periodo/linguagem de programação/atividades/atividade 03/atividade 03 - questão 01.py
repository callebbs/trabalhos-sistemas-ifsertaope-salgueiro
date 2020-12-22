'''
Escreva um programa Python querecebe a idade de 10 pessoas, calcula e mostra a quantidade de pessoas maiores de idade 
(idade >= 18 anos)
'''

print("Bem vindo(a) ao programa de contador de idades.")
cont = 0

for i in range(10):
    idade = float(input("Digite uma idade: "))
    if idade >= 18:
        cont = cont + 1

print("Das idades digitadas, {} são de pessoas com maior idade.".format(cont))
print("Fim do programa.")