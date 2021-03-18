'''
Faça um programa Python que, através de uma API JSON, obtenha a cotação do dólar e do euro. 
O programa deve receber um valor em reais do teclado e convertê-lo para dólares e euros. 
Como saída, a aplicação deverá apresentar a cotação do dólar e do euro e a conversão 
dos reais fornecidos como entrada.
'''

import json
import requests

url = "https://economia.awesomeapi.com.br/json/all"

resposta = requests.get(url)
resposta.raise_for_status

dados = json.loads(resposta.text)

dolar_comercial = dados["USD"]
dolar_turismo = dados["USDT"]
euro = dados["EUR"]

valor = int(input("Digite o valor em REAIS para converter: "))

print("-" * 45)
print(f"Data e Horário: {dolar_comercial['create_date']}")
print("-" * 45)
print(f"Cotação do {dolar_comercial['name']}: {dolar_comercial['high']}")
print(f"Cotação do {dolar_turismo['name']}: {dolar_turismo['high']}")
print("-" * 45)
print(f"Data e Horário: {euro['create_date']}")
print(f"Cotação do {euro['name']}: {euro['high']}")
print("-" * 45)
print(f"Conversão:")

dolar_atual = float(dolar_comercial['high'])
euro_atual = float(euro['high'])

conversao_dolar = valor / int(dolar_atual)
conversao_euro = valor / int(euro_atual)
print(f"R${valor} para USD: {conversao_dolar:.2f} dólares.")
print(f"R${valor} para EUR: {conversao_euro:.2f} euros.")
print("-" * 45)