'''
Crie um programa em Python que lê um arquivo JSON contendo os nomes e
notas de vários alunos. O programa deverá calcular e mostrar os nomes dos alunos
aprovados e dos reprovados (considerar a média 7). Abaixo segue o modelo de
arquivo que o programa deverá utilizar
'''
import json

arquivo = open("notas.json", 'r')
dados = json.load(arquivo)

print("Calculando média dos alunos...")
print("-" * 30)
print("Alunos APROVADOS: ")
for i in range(len(dados)):
    media_notas = (dados[i]['nota1'] + dados[i]['nota2']) / 2
    if media_notas >= 7:
        print(dados[i]['aluno'])
print("-" * 30)
print("Alunos REPROVADOS: ")
for i in range(len(dados)):
    media_notas = (dados[i]['nota1'] + dados[i]['nota2']) / 2
    if media_notas < 4:
        print(dados[i]['aluno'])
arquivo.close()

print("-" * 30)