'''
Crie uma função que calcula e retorna a média de uma lista de números de ponto flutuante.  
Agora faça um programa que recebe a temperatura média de cada um dos meses do ano e  armazene-as em uma lista. 
Em seguida, com o auxílio da função criada por você obtenha e mostre  todas as temperaturas acima da média anual, 
e em que meses elas ocorreram (mostrar o nome  do mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . ., 12 – Dezembro). 
'''

def mediaListas(lista):
    soma = sum(lista)
    media = soma / len(lista)

    return media

meses = [" ", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"]
numeromeses = ["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"]
temperaturas = []

for i in range(1, 13):
    temperaturas.append(float(input(f"Digite a temperatura do mês {meses[i]}: ")))

print(temperaturas)

print("Média das Temperaturas: ", mediaListas(temperaturas))

