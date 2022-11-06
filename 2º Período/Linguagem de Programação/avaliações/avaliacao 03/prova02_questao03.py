'''
Crie uma aplicação em Python que lê um arquivo JSON contendo os nomes e  notas de vários alunos. O programa deverá calcular e mostrar os nomes, as médias e a situação dos alunos aprovados (média >= 7), reprovados (média < 7) e em recuperação (média >= 4 e média <7). Observação: crie pelo menos 3 funções para auxiliar na solução do problema e gere um gráfico com as estatísticas dos aprovados, reprovados e em recuperação. Abaixo segue o modelo de arquivo que o programa deverá utilizar.
'''

import json
import matplotlib.pyplot as grafico

arquivo = open('notas.json', 'r')
dados = json.load(arquivo)
arquivo.close()

aprovados = []

def Aprovados():
    aprovados = []
    for i in range(len(dados)):
        media_notas = (dados[i]['nota1'] + dados[i]['nota2']) / 2
        if media_notas >= 7:
            aprovados.append(dados[i]['aluno'])
    return aprovados

def Reprovados():
    reprovados = []
    for i in range(len(dados)):
        media_notas = (dados[i]['nota1'] + dados[i]['nota2']) / 2
        if media_notas < 4:
            reprovados.append(dados[i]['aluno'])
    return reprovados

def Recuperacao():
    recuperacao = []
    for i in range(len(dados)):
        media_notas = (dados[i]['nota1'] + dados[i]['nota2']) / 2
        if media_notas >= 4 and media_notas < 7:
            recuperacao.append(dados[i]['aluno'])
    return recuperacao

aprovados = Aprovados()
recuperacao = Recuperacao()
reprovados = Reprovados()

#Reprovados()
#Recuperacao()

print(f'Alunos aprovados: {aprovados}')
print(f'Alunos em recuperação: {recuperacao}')
print(f'Alunos reprovados: {reprovados}')

#criando gráficos
lista_medias = []
lista_nomes = []
for i in range(len(dados)):
    media_notas = (dados[i]['nota1'] + dados[i]['nota2']) / 2
    lista_medias.append(media_notas)
    lista_nomes.append(dados[i]['aluno'])

#print(lista_medias)
#print(lista_nomes)

grafico.plot(lista_nomes, lista_medias)
grafico.title(f'Situação dos alunos:')
grafico.xlabel("Alunos")
grafico.ylabel("Médias")
grafico.show()