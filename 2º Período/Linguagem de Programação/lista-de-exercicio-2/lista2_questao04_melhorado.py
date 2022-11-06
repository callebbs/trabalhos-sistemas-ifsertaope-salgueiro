import os
import matplotlib.pyplot as grafico
import json
import requests

#obtendo dados da API
print("Baixando dados. Aguarde...")
url = "https://api.apify.com/v2/datasets/3S2T1ZBxB9zhRJTBB/items?format=json&clean=1"

resposta = requests.get(url)
resposta.raise_for_status
dados = json.loads(resposta.text)
dias = len(dados)

def clear():
    #função para limpar a tela
    import os
    os.system('cls' if os.name == 'nt' else 'clear')

def LimpaListas():

    #variáveis e listas para armazenar dados dos Estados
    infectados_estados = []
    dias_infectados_estados = []
    mortes_estados = []
    dias_mortes_estados = []
    quantidade_dias_infectados_estados = 0
    quantidade_dias_mortes_estados = 0
    quantidade_infectados_estados = 0
    quantidade_mortes_estados = 0

    #variáveis e listas para armazenar dados do Brasil
    infectados_brasil = []
    dias_infectados_brasil = []
    mortes_brasil = []
    dias_mortes_brasil = []
    quantidade_infectados_brasil = 0
    quantidade_dias_infectados_brasil = 0
    quantidade_mortes_brasil = 0
    quantidade_dias_mortes_brasil = 0

def menu():
    escolha = 0
    clear()

    while escolha != 6:
        print("+--------------------------------------------------------+")
        print("|                                                        |")
        print("|                   COVID-19 NO BRASIL                   |")
        print("|                                                        |")
        print("+--------------------------------------------------------+")
        print("|                                                        |")
        print("| 1 - Gráfico dos dados do Brasil                        |")
        print("| 2 – Gráfico dos dados por Estado                       |")
        print("| 3 – Resumo dos dados (sem gráfico)                     |")
        print("| 4 – Sair do programa                                   |")
        print("|                                                        |")
        print("+--------------------------------------------------------+")

        escolha = int(input("Digite uma opção: "))
        if escolha == 1:
            GraficosBrasil()
        elif escolha == 2:
            GraficosEstado()
        elif escolha == 3:
            ResumoDados()
        elif escolha == 4:
            print("Programa finalizado.")
            break

def GraficosEstado():
    clear()
    sigla_estado = " "
    print("Dados da COVID-19 por Estado")
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
    estado = input("Digite o nome estado para visualizar os dados: ")

    for i in range(0, len(lista_estados)):
        if estado in lista_estados:
            sigla_estado = lista_estados[estado]
        else:
            print("Estado inválido.")
            break

    print(f"Estado selecionado: {estado}")

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
    for i in range(0, dias):
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
    for i in range(1, dias):
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

    LimpaListas()

def GraficosBrasil():
    clear()
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
    for i in range(0, dias):
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
    for i in range(0, dias):
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

    LimpaListas()

def ResumoDados():
    clear()
    sigla_estado = " "
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
    estado = input("Digite o nome estado para visualizar os dados: ")

    for i in range(0, len(lista_estados)):
        if estado in lista_estados:
            sigla_estado = lista_estados[estado]
        else:
            print("Estado inválido. Tente novamente.")
            break
    
    #variáveis e listas para armazenar dados dos Estados
    infectados_estados = []
    dias_infectados_estados = []
    mortes_estados = []
    dias_mortes_estados = []
    quantidade_dias_infectados_estados = 0
    quantidade_dias_mortes_estados = 0
    quantidade_infectados_estados = 0
    quantidade_mortes_estados = 0

    #variáveis e listas para armazenar dados do Brasil
    infectados_brasil = []
    dias_infectados_brasil = []
    mortes_brasil = []
    dias_mortes_brasil = []
    quantidade_infectados_brasil = 0
    quantidade_dias_infectados_brasil = 0
    quantidade_mortes_brasil = 0
    quantidade_dias_mortes_brasil = 0

    #obtendo dados infectados por Estado
    for i in range(0, dias):
        for j in range(0, len(dados[i]['infectedByRegion'])):
            if dados[i]['infectedByRegion'][j]['state'] == sigla_estado:
                quantidade_infectados_estados = dados[i]['infectedByRegion'][j]['count']
                infectados_estados.append(quantidade_infectados_estados)
                quantidade_dias_infectados_estados = quantidade_dias_infectados_estados + 1
                dias_infectados_estados.append(quantidade_dias_infectados_estados)
            else:
                continue
    
    #dados mortes por Estado
    for i in range(1, dias):
        for j in range(0, len(dados[i]['deceasedByRegion'])):
            if dados[i]['deceasedByRegion'][j]['state'] == sigla_estado:
                quantidade_mortes_estados = dados[i]['deceasedByRegion'][j]['count']
                mortes_estados.append(quantidade_mortes_estados)
                quantidade_dias_mortes_estados = quantidade_dias_mortes_estados + 1
                dias_mortes_estados.append(quantidade_dias_mortes_estados)
            else:
                continue

    #obtendo dados dos infectados no Brasil
    for i in range(0, dias):
        quantidade_infectados_brasil = dados[i]['infected']
        infectados_brasil.append(quantidade_infectados_brasil)
        quantidade_dias_infectados_brasil = quantidade_dias_infectados_brasil + 1
        dias_infectados_brasil.append(quantidade_dias_infectados_brasil)

    for i in range(0, dias):
        quantidade_mortes_brasil = dados[i]['deceased']
        mortes_brasil.append(quantidade_mortes_brasil)
        quantidade_dias_mortes_brasil = quantidade_dias_mortes_brasil + 1
        dias_mortes_brasil.append(quantidade_dias_mortes_brasil)

    clear()

    #print(f"Estado selecionado: {estado}")
    #print("Resumo dos dados: ")
    print(f'-' * 50)
    print(f"Total de Infectados no Brasil: {infectados_brasil[-1]}")
    print(f"Total de Mortes no Brasil: {mortes_brasil[-1]}")
    print(f"Total de dias de pandemia: {quantidade_dias_infectados_brasil}")
    print(f'-' * 50)
    print(f'Total de Infectados em {estado}: {infectados_estados[-1]}')
    print(f'Total de Mortes em {estado}: {mortes_estados[-1]}')
    print(f'-' * 50)
    LimpaListas()

menu()