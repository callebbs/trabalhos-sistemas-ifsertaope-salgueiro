'''
Elabore um programa Python que receba a idade e a altura de várias pessoas, calcula e mostra a média das alturas daquelas com mais de 50 anos. Para encerrar a entrada de dados, digite uma idade menor que zero.
'''

idade = 1
quantidade = 0
soma_alturas = 0

while idade > 0:
    idade = int(input("Digite a idade: "))
    if idade < 0:
        print("Fim da entrada de dados. Motivo: Idade digitada menor que 0.")
        break
    altura = float(input("Digite a altura desta pessoa: (ex: 1.80): "))
    if idade > 50:
        soma_alturas = soma_alturas + altura
        quantidade = quantidade + 1

print("Calculando média...")

media_alturas = soma_alturas / quantidade
print("A média das alturas das pessoas com mais de 50 anos é de {:.2f}.".format(media_alturas))