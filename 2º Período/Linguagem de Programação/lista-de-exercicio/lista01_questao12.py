'''
Implemente uma função que, dado um número n maior que 2, devolve uma String com todos os números primos menores ou iguais a n, separados por espaços em branco. 
'''

def NumerosPrimos(numero):
    primos = ""
    for i in range(2, numero+1):
        contador = 0
        for j in range(2, i+1):
            if i % j == 0:
               contador += 1
        if contador <= 1:
            primos = primos + " " + str(i)
    return primos

print("Listagem de Números Primos: ")
numero = int(input("Digite o número: "))
if numero >= 2:
    print(f"Os números primos são:{NumerosPrimos(numero)}")
else:
    print("Número inválido. Digite um número acima de 2.")