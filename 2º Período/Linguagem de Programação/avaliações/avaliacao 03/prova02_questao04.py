'''
Implemente uma função lambda que recebe como argumento a lista de dados JSON da questão anterior e retorna apenas os dados dos alunos aprovados (considerar média 7).
'''
import json

arquivo = open('notas.json', 'r')
dados = json.load(arquivo)
arquivo.close()

print("Alunos aprovados: ")
aprovados = lambda dados: print(dados[i])

aluno = []

for i in range(len(dados)):
    media_notas = (dados[i]['nota1'] + dados[i]['nota2']) / 2
    if media_notas >= 7:
        aluno = aprovados(dados)