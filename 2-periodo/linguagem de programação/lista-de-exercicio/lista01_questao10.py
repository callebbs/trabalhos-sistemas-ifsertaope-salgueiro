'''
Uma pista de Kart permite 3 (três) voltas para cada um dos 6 (seis) corredores. 
Escreva um  programa que leia todos os tempos em segundos e os guarde em um dicionário, 
onde a chave é o nome do corredor. 

Ao final diga, através de funções criadas por você, de quem foi a melhor volta da prova 
e em que volta isso ocorreu; 
e ainda a classificação final em ordem crescente (do campeão para o último colocado). 

O campeão é o que teve a menor média de tempos. 
'''

dicionario_voltas = {}
corredores = []

def PilotoMaisRapido():

    menorVolta = dicionario_voltas[corredores[0]][0]
    piloto = corredores[0]
    voltaMaisRapida = 0

    for pilotos in range(0, 2):
        for voltas in range(0, 3):
            if dicionario_voltas[(corredores[pilotos])][voltas] < menorVolta:
                menorVolta = dicionario_voltas[corredores[pilotos]][voltas]
                piloto = corredores[pilotos]
                voltaMaisRapida = voltas

    print(f"A menor volta foi do piloto(a) {piloto}, na {voltaMaisRapida+1}ª volta com o tempo de {menorVolta} segundos.")

#criação do nome dos pilotos

for nomes in range(0, 2):
    nome_corredor = input(f"Informe o nome do corredor {nomes+1}: ")
    corredores.append(nome_corredor)

#criação das voltas de cada piloto

for i in range(0, 2):
    dicionario_voltas[corredores[i]] = float(input(f"Informe os tempos (em segundos) das três voltas do piloto(a) {i+1}:\nVolta 1: ")), float(input("Volta 2: ")),float(input("Volta 3: "))


PilotoMaisRapido()