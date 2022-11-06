'''
Faça um programa que recebe o peso e altura de uma pessoa, calcula e mostra o seu
IMC e Faixa de Risco com base nas informações abaixo:

Abaixo de 20       -> Abaixo do peso
De 20 a 25         -> Peso normal
Acima de 25 até 30 -> Acima do peso
Acima de 30        -> Obesidade
'''

peso = float(input("Digite seu peso: "))
altura = float(input("Digite sua altura: "))
print("Calculando IMC...")
imc = peso / (altura * 2)

if int(imc) < 20:
    print("Seu IMC é de {} e você está abaixo do peso, visite um nutricionista.".format(int(imc)))
elif int(imc) >= 20 and int(imc) <= 25:
    print("Seu IMC é de {} e você está dentro do seu peso ideal.".format(int(imc)))
elif int(imc) > 25 and int(imc) <= 30:
    print("Seu IMC é de {} e você está acima do peso, visite um nutricionista.".format(int(imc)))
elif int(imc) > 30:
    print("Seu IMC é de {} e você está com nível alto de obesidade, visite um nutricionista.".format(int(imc)))

print("Fim do cálculo de IMC.")