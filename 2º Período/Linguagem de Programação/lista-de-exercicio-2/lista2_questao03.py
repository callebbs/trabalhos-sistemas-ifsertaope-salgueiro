#nova key foi gerada para o professor avaliar o código

#questão respondida ao som de Nirvana - Nevermind (1991)

import requests
import json
import os
import urllib.parse

url = #LINK DA API

texto = str(input('Digite o texto para tradução: '))
texto_convertido = urllib.parse.quote(texto)

idioma_traducao = str(input("Qual idioma quer traduzir o texto?\n** Digite en para Inglês **\n** Digite es para Espanhol **\nDigite sua escolha: "))

payload = f"q={texto_convertido}&source=pt&target={idioma_traducao}"

headers = {
    'content-type': "application/x-www-form-urlencoded",
    'accept-encoding': "application/gzip",
    'x-rapidapi-key': "1cd986695dmsh8e7366a93c80b37p1c06b2jsnb49e41a57c3b",
    'x-rapidapi-host': "google-translate1.p.rapidapi.com"
    }

traducao = requests.request("POST", url, data=payload, headers=headers)

os.system('cls')
dados = json.loads(traducao.text)
print("-" * 50)
print(f"Texto original: {texto}\n")

if idioma_traducao == "en":
    print(f"Tradução do Português do Brasil para Inglês:")
elif idioma_traducao == "es":
    print(f"Tradução do Português do Brasil para Espanhol:")

print(dados["data"]["translations"][0]['translatedText'])
print("-" * 50)