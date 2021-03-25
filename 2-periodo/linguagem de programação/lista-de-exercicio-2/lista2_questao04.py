'''
Utilizando uma API JSON e o módulo Matplotlib, desenvolva uma aplicação que recupera os dados da COVID-19 no Brasil 
e apresenta sua evolução em gráficos. Apresente um gráfico geral do Brasil, 
juntamente com os dados dos contaminados e mortos e também permita que 
o usuário possa escolher algum estado brasileiro que ele deseja ver o gráfico e os dados.
'''

#pegando dados da API
import matplotlib.pyplot as grafico
import json
import requests

url = "https://api.apify.com/v2/datasets/3S2T1ZBxB9zhRJTBB/items?format=json&clean=1"

resposta = requests.get(url)
resposta.raise_for_status
dados = json.loads(resposta.text)

#interação com usuário
print("Programa de geração de gráficos da COVID-19 no Brasil.")
estado = input("Digite a sigla do estado para ver os dados do COVID-19: ")
print(f"Apresentando dados do estado {estado}")


infectados = []
mortes = []
dias_infectados = []
dias_mortes = []
quantidade_dias_infectados = 0
quantidade_dias_mortes = 0
quantidade_infectados = 0
quantidade_mortes = 0

#dados infectados por Estado
for i in range(0, 508):
    for j in range(0, len(dados[i]['infectedByRegion'])):
        if dados[i]['infectedByRegion'][j]['state'] == estado:
            quantidade_infectados = dados[i]['infectedByRegion'][j]['count']
            infectados.append(quantidade_infectados)
            quantidade_dias_infectados = quantidade_dias_infectados + 1
            dias_infectados.append(quantidade_dias_infectados)
        else:
            continue

#gerando gráficos de infectados por Estado
print("Gerando gráficos...")
grafico.plot(dias_infectados, infectados)
grafico.title('Dados de Infectados em Pernambuco')
grafico.xlabel("Dias corridos da Pandemia")
grafico.ylabel("Quantidade de infectados")
grafico.show()

#dados mortes por Estado
for i in range(1, 509):
    for j in range(0, len(dados[i]['deceasedByRegion'])):
        if dados[i]['deceasedByRegion'][j]['state'] == estado:
            quantidade_mortes = dados[i]['deceasedByRegion'][j]['count']
            mortes.append(quantidade_mortes)
            quantidade_dias_mortes = quantidade_dias_mortes + 1
            dias_mortes.append(quantidade_dias_mortes)
        else:
            continue

#gerando gráficos de mortes por Estado
grafico.plot(dias_mortes, mortes)
grafico.title(f'Dados de Mortes em Pernambuco')
grafico.xlabel("Dias corridos da Pandemia")
grafico.ylabel("Quantidade de mortes")
grafico.show()