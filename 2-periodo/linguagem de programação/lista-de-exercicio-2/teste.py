#obtendo dados da API

import os
import matplotlib.pyplot as grafico
import json
import requests

def clear():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')

url = "https://api.apify.com/v2/datasets/3S2T1ZBxB9zhRJTBB/items?format=json&clean=1"

resposta = requests.get(url)
resposta.raise_for_status
dados = json.loads(resposta.text)

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

clear()
print("Resumo dos dados: ")
print(f"Total de Infectados no Brasil: {infectados_brasil[-1]}")
print(f"Total de Mortes no Brasil: {mortes_brasil[-1]}")
print(f"Total de dias de pandemia: {quantidade_dias_infectados_brasil}")
print(f'-' * 50)
print(f'Total de Infectados em {estado}: {infectados_estados[-1]}')
print(f'Total de Mortes em {estado}: {mortes_estados[-1]}')