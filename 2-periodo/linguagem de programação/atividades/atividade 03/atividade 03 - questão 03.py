'''
Desenvolva um programa Python que recebe 12 números inteiros e em seguida mostra a média dos números pares que foram lidos.
'''
soma_numeros = 0
quantidade = 0

for i in range(13):
    numero = int(input("Digite um número inteiro: "))
    if numero % 2 == 0:
        soma_numeros = soma_numeros + numero
        quantidade = quantidade + 1
    
print("=" * 7)
print("Fim da quantidade de números, agora calculando a média...")
media_pares = float(soma_numeros / quantidade)
print("A média de números pares digitados foi de: {}".format(media_pares))