import json
import requests
import urllib.parse
import os

URL = "https://google-translate1.p.rapidapi.com/language/translate/v2/"

textoPT = str( input("Digite o texto (PT-BR) a ser traduzido: "))
textoTrad = urllib.parse.quote(textoPT)

escIdiom = str( input("Escolha o idioma que deseja traduzir ( en para Inglês / es para Espanhol): "))

payload = f"q={textoTrad}&source=pt&target={escIdiom}"

headers = {
    "content-type": "application/x-www-form-urlencoded",
	"accept-encoding": "application/gzip",
	"x-rapidapi-key": "4c1396d286msh4aff03865ff54dap1678b2jsn204e52ff8cfe",
	"x-rapidapi-host": "google-translate1.p.rapidapi.com"
    }

trad = requests.request("POST", URL, data=payload, headers=headers)

os.system("cls")
dados = json.loads(trad.text)
print(f"Texto digitado (PT-BR): {textoPT}\n")

if escIdiom == "en":
    print(f"Traduzido do PT-BR para o Inglês (EN): ")
elif escIdiom == "es":
    print(f"Traduzido do PT-BR para Espanhol (ES): ")

print(dados["data"]["translations"][0]["translatedText"])