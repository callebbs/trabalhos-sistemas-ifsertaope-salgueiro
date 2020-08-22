#QUESTÃO 06

'''
Crie uma função que calcula e retorna a média de uma lista de números de ponto flutuante.

Agora faça um programa que recebe a temperatura média de cada um dos meses do ano e
armazene-as em uma lista. Em seguida, com o auxílio da função criada por você obtenha e mostre
todas as temperaturas acima da média anual, e em que meses elas ocorreram (mostrar o nome
do mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . ., 12 – Dezembro)
'''
#------------------------------------------------------------------------------------------------
def media(lista):
    totaldasoma = 0
    
    for i in lista:
        totaldasoma += i
    
    return (totaldasoma / len(lista))
#------------------------------------------------------------------------------------------------

meses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"]
nmeses = ["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"]
temperaturas = []
somatem = sum(temperaturas)

for i in range(0, 12):
    temperaturas.append(float(input("Digite a temperatura do mês de {}: ".format(meses[i]))))

print("A média da temperatura anual é de: ", media(temperaturas))

print('-' * 50)
print("Meses com temperaturas acima da média: ")
for i in range(0, 12):
    mesesquentes = [[]]
    if  temperaturas[i] > media(temperaturas):
        print("{} - {}".format(nmeses[i], meses[i]))
print('-' * 50)