'''
Faça um programa Python que recebe um número inteiro positivo e em seguida apresenta a tabuada de multiplicação desse número.
'''

print("==" * 20)
print("Prorama de Tabuada")

numero = int(input("Digite um número para realizar a tabuada: "))

print("==" * 7)
print("Tabuada do número {}".format(numero))
print("==" * 7)
for i in range(11):
    print("{} x {}:".format(numero, i), numero * i)
    
print("==" * 5)
print("Fim da tabuada.")