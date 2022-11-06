'''
Utilizando uma API JSON e o módulo Matplotlib, desenvolva uma aplicação que recupera os dados da COVID-19 no Brasil 
e apresenta sua evolução em gráficos. Apresente um gráfico geral do Brasil, 
juntamente com os dados dos contaminados e mortos e também permita que 
o usuário possa escolher algum estado brasileiro que ele deseja ver o gráfico e os dados.
'''

import os
import matplotlib.pyplot as grafico
import json
import requests

#função pra limpar tela
def clear():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')

#obtendo dados da API
url = "https://api.apify.com/v2/datasets/3S2T1ZBxB9zhRJTBB/items?format=json&clean=1"

resposta = requests.get(url)
resposta.raise_for_status
dados = json.loads(resposta.text)

#interação com usuário
sigla_estado = " "
print("Programa de geração de gráficos da COVID-19 no Brasil.")
lista_estados = {
    "Acre": "AC",
    "Alagoas": "AL",
    "Amapá": "AP",
    "Amazonas": 'AM',
    "Bahia": "BA",
    "Ceará": "CE",
    "Distrito Federal": "DF",
    "Espírito Santo": "ES",
    "Goiás": "GO",
    "Maranhão": "MA",
    "Mato Grosso": "MT",
    "Mato Grosso do Sul": "MS",
    "Minas Gerais:": "MG",
    "Pará": "PA",
    "Paraíba": "PB",
    "Pernambuco": "PE",
    "Piauí": "PI",
    "Rio de Janeiro": "RJ",
    "Rio Grande do Norte": "RN",
    "Rio Grande do Sul": "RS",
    "Rondônia": "RO",
    "Roraima": "RR",
    "Santa Catarina": "SC",
    "São Paulo": "SP",
    "Sergipe": "SE",
    "Tocantins": "TO"
}
estado = input("Digite o nome estado para ver os dados do COVID-19: ")

for i in range(0, len(lista_estados)):
    if estado in lista_estados:
        sigla_estado = lista_estados[estado]
    else:
        print("Estado inválido.")
        break

print(f" ** Dados do Estado de {estado} **")

#variáveis e listas para armazenar dados dos Estados
infectados_estados = []
dias_infectados_estados = []
mortes_estados = []
dias_mortes_estados = []
quantidade_dias_infectados_estados = 0
quantidade_dias_mortes_estados = 0
quantidade_infectados_estados = 0
quantidade_mortes_estados = 0

#obtendo dados infectados por Estado
for i in range(0, 508):
    for j in range(0, len(dados[i]['infectedByRegion'])):
        if dados[i]['infectedByRegion'][j]['state'] == sigla_estado:
            quantidade_infectados_estados = dados[i]['infectedByRegion'][j]['count']
            infectados_estados.append(quantidade_infectados_estados)
            quantidade_dias_infectados_estados = quantidade_dias_infectados_estados + 1
            dias_infectados_estados.append(quantidade_dias_infectados_estados)
        else:
            continue

#gerando gráficos de infectados por Estado
print("Gerando gráficos...")
grafico.plot(dias_infectados_estados, infectados_estados)
grafico.title(f'Dados de Infectados em {estado}')
grafico.xlabel("Dias corridos da Pandemia")
grafico.ylabel("Quantidade de infectados")
grafico.show()

#dados mortes por Estado
for i in range(1, 509):
    for j in range(0, len(dados[i]['deceasedByRegion'])):
        if dados[i]['deceasedByRegion'][j]['state'] == sigla_estado:
            quantidade_mortes_estados = dados[i]['deceasedByRegion'][j]['count']
            mortes_estados.append(quantidade_mortes_estados)
            quantidade_dias_mortes_estados = quantidade_dias_mortes_estados + 1
            dias_mortes_estados.append(quantidade_dias_mortes_estados)
        else:
            continue

#gerando gráficos de mortes por Estado
grafico.plot(dias_mortes_estados, mortes_estados)
grafico.title(f'Dados de Mortes em {estado}')
grafico.xlabel("Dias corridos da Pandemia")
grafico.ylabel("Quantidade de mortes")
grafico.show()

#variáveis e listas para armazenar dados do Brasil
infectados_brasil = []
dias_infectados_brasil = []
mortes_brasil = []
dias_mortes_brasil = []
quantidade_infectados_brasil = 0
quantidade_dias_infectados_brasil = 0
quantidade_mortes_brasil = 0
quantidade_dias_mortes_brasil = 0

#obtendo dados dos infectados no Brasil
for i in range(0, 509):
    quantidade_infectados_brasil = dados[i]['infected']
    infectados_brasil.append(quantidade_infectados_brasil)
    quantidade_dias_infectados_brasil = quantidade_dias_infectados_brasil + 1
    dias_infectados_brasil.append(quantidade_dias_infectados_brasil)

#gerando gráficos de infectados no Brasil
grafico.plot(dias_infectados_brasil, infectados_brasil)
grafico.title(f'Dados de Infectados no Brasil')
grafico.xlabel("Dias corridos da Pandemia")
grafico.ylabel("Quantidade de infectados em milhões")
grafico.show()

#obtendo dados de mortes no Brasil
for i in range(0, 509):
    quantidade_mortes_brasil = dados[i]['deceased']
    mortes_brasil.append(quantidade_mortes_brasil)
    quantidade_dias_mortes_brasil = quantidade_dias_mortes_brasil + 1
    dias_mortes_brasil.append(quantidade_dias_mortes_brasil)

#gerando gráficos de mortes no Brasil
grafico.plot(dias_mortes_brasil, mortes_brasil)
grafico.title(f'Dados de Mortes no Brasil')
grafico.xlabel("Dias corridos da Pandemia")
grafico.ylabel("Quantidade de mortes")
grafico.show()

#resumo dos dados

clear()
print("Resumo dos dados: ")
print(f'-' * 50)
print(f"Total de Infectados no Brasil: {infectados_brasil[-1]}")
print(f"Total de Mortes no Brasil: {mortes_brasil[-1]}")
print(f"Total de dias de pandemia: {quantidade_dias_infectados_brasil}")
print(f'-' * 50)
print(f'Total de Infectados em {estado}: {infectados_estados[-1]}')
print(f'Total de Mortes em {estado}: {mortes_estados[-1]}')
print(f'-' * 50)