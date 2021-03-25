'''
Utilizando uma API JSON e o módulo Matplotlib, desenvolva uma aplicação que recupera os dados da COVID-19 no Brasil 
e apresenta sua evolução em gráficos. Apresente um gráfico geral do Brasil, 
juntamente com os dados dos contaminados e mortos e também permita que 
o usuário possa escolher algum estado brasileiro que ele deseja ver o gráfico e os dados.
'''

#obtendo dados da API
import matplotlib.pyplot as grafico
import json
import requests

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

#variáveis e listas para armazenar dados
infectados_estados = []
dias_infectados_estados = []
mortes_estados = []
dias_mortes_estados = []
quantidade_dias_infectados_estados = 0
quantidade_dias_mortes_estados = 0
quantidade_infectados_estados = 0
quantidade_mortes_estados = 0

#dados infectados por Estado
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
            quantidade_mortes = dados[i]['deceasedByRegion'][j]['count']
            mortes_estados.append(quantidade_mortes)
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
