'''
04
Desenvolva um programa que recebe duas notas, calcula e mostra a média ponderada dessas notas, considerando peso 2 para a primeira e peso 3 para a segunda.
'''

nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
mediap = (nota1 + nota2) / (2 + 3)
print("A média ponderada das notas {} e {} é de: {}.".format(nota1, nota2, mediap))