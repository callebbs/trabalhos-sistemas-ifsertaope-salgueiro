import json
import requests

local = input("Digite sua localidade: ")


chave = "9f5652c7e9773515c5705cb5f780e628"

url = f"http://api.openweathermap.org/data/2.5/forecast?q={local}&appid={chave}"

resposta = requests.get(url)
resposta.raise_for_status

dados = json.loads(resposta.text)
lista = dados["list"]

print(f"Temperatura hoje em {local}: ")
tempCelcius = lista[0]["main"]["temp"] - 273.15
print("%.2f graus celcius" % tempCelcius)

print(f"Temperatura amanhã em {local}: ")
tempCelcius = lista[1]["main"]["temp"] - 273.15
print("%.2f graus celcius" % tempCelcius)