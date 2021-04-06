'''
Implemente uma função chamada somenteAprovados(). Esta função deve
receber como argumento a lista de dados JSON da questão anterior e retorna
apenas os dados dos alunos aprovados (considerar média 7).
'''
import json

def somenteAprovados(arquivo):
    arquivo = open("notas.json", 'r')
    dados = json.load(arquivo)

    print("Alunos aprovados: ")
    for i in range(len(dados)):
        media_notas = (dados[i]['nota1'] + dados[i]['nota2'])/2
        if media_notas >= 7:
            print(dados[i]['aluno'], "- Média:", media_notas)
        
    arquivo.close()

somenteAprovados('notas.json')