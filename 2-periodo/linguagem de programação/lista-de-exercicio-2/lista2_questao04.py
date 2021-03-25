'''
Utilizando uma API JSON e o módulo Matplotlib, desenvolva uma aplicação que recupera os dados da COVID-19 no Brasil 
e apresenta sua evolução em gráficos. Apresente um gráfico geral do Brasil, 
juntamente com os dados dos contaminados e mortos e também permita que 
o usuário possa escolher algum estado brasileiro que ele deseja ver o gráfico e os dados.
'''

import matplotlib.pyplot as grafico
import json
import requests

url = "https://api.apify.com/v2/datasets/3S2T1ZBxB9zhRJTBB/items?format=json&clean=1"

resposta = requests.get(url)
resposta.raise_for_status
dados = json.loads(resposta.text)

estado = input("Digite a sigla do estado para ver os dados do COVID-19: ")

infectados = []
mortes = []
dias_infectados = []
dias_mortes = []
quantidade_dias_infectados = 0
quantidade_dias_mortos = 0
quantidade_infectados = 0
quantidade_mortos = 0

for i in range(0, 508):
    for j in range(0, len(dados[i]['infectedByRegion'])):
        if dados[i]['infectedByRegion'][j]['state'] == estado:
            #teste de funcionamento do filtro de dados
            #print(f"Dia {i}")
            #print(f"Estado {dados[i]['infectedByRegion'][j]['state']}")
            #print(f"Infectados {dados[i]['infectedByRegion'][j]['count']}")
            quantidade_infectados = dados[i]['infectedByRegion'][j]['count']
            infectados.append(quantidade_infectados)
            quantidade_dias_infectados = quantidade_dias_infectados + 1
            dias_infectados.append(quantidade_dias_infectados)
        #    quantidade_mortos = dados[i]['deceasedByRegion'][j]['count']
        #    mortes.append(quantidade_mortos)
        #    quantidade_dias_mortos = quantidade_dias_mortos + i
        #    dias_mortes.append(quantidade_dias_mortos)
        else:
            continue


#print(f"Lista de infectados {infectados}")
#print(f"Lista de dias infectados {dias_infectados}")
#print(f"Lista de mortos {mortes}")
#print(f"Lista de dias mortos {dias_mortes}")


grafico.plot(dias_infectados, infectados)
grafico.title('Dados de Infectados em Pernambuco')
grafico.xlabel("Dias corridos da Pandemia")
grafico.ylabel("Quantidade de infectados")
grafico.show()