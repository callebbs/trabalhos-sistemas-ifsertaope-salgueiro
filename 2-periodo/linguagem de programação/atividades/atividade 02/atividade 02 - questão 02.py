'''
Uma empresa decide dar um aumento de 5% aos funcionários com salário inferior a R$
1045,00. Faça um programa que receba o salário do funcionário e mostre o valor do salário
reajustado ou uma mensagem, caso ele não tenha direito ao aumento.
'''

salario = float(input("Digite o vlaor do seu salário: "))

if salario < 1045.00:
    salario = salario + salario * 0.05
    print("Seu novo salário é: {}".format(salario))
else:
    print("Você não recebe aumento.")