'''
Desenvolva um programa que leia um ano através do teclado e através do monitor
informe se ele é ou não bissexto. Dica: um ano é bissexto se ele for divisível por 400 ou se
ele for divisível por 4 e não for por 100
'''

ano = int(input("Digite um ano: "))

if ano % 400 == 0 or ano % 4 == 0 and ano % 100 != 0:
    print("O ano {} é bissexto.".format(ano))
else:
    print("O ano {} não é bissexto.".format(ano))