'''
Uma pista de Kart permite 3 (três) voltas para cada um dos 6 (seis) corredores. 
Escreva um  programa que leia todos os tempos em segundos e os guarde em um dicionário, onde a chave é 
o nome do corredor. Ao final diga, através de funções criadas por você, de quem foi a melhor 
volta da prova e em que volta isso ocorreu; e ainda a classificação final em ordem crescente (do campeão para o último colocado). 
O campeão é o que teve a menor média de tempos. 
'''

def melhorVolta():
    for i in range(0, 3):
        

voltas = {}
corredores = []
 
for i in range (0,6):
    nome_corredor =  input(f"Informe o nome do corredor {i+1}: ")
    corredores.append(nome_corredor)

for i in range(0, 3):
    voltas[corredores[i]] = float(input(f"Informe os tempos das três voltas do corredor {i+1}:\nVolta 1: ")),float(input("Volta 2: ")),float(input("Volta 3: "))