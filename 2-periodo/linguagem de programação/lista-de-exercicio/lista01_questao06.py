'''
Crie uma função que calcula e retorna a média de uma lista de números de ponto flutuante.  
Agora faça um programa que recebe a temperatura média de cada um dos meses do ano e armazene-as em uma lista. 
Em seguida, com o auxílio da função criada por você obtenha e mostre todas as temperaturas acima da média anual, 
e em que meses elas ocorreram (mostrar o nome do mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . ., 12 – Dezembro). 
'''

def mediaListas(lista):
    soma = sum(lista)
    media = soma / len(lista)

    return media

meses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"]
numeromeses = ["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"]
temperaturas = []

for i in range(0, 12):
    temperaturas.append(float(input(f"Digite a temperatura do mês {meses[i]}: ")))
print("-" * 50)
print("Média Anual da temperatura: ", (mediaListas(temperaturas)))
print("-" * 50)
print("Meses com temperaturas acima da média anual:")

for i in range(1, 12):
    if temperaturas[i] > mediaListas(temperaturas):
        print(f"{numeromeses[i]} - {meses[i]}: {temperaturas[i]}")
print("-" * 50)