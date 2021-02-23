#1ª Avaliação - Linguagem de Programação

#Questão 04

def votar():
    candidato1 = 0
    candidato2 = 0
    candidato3 = 0
    candidato4 = 0
    branco = 0
    votonulo = 0
    voto = 1
    
    while voto != 0:  
        voto = int(input("Digite o código do candidato para votar: "))
        if voto == 1:
            candidato1 = candidato1 + 1
        elif voto == 2:
            candidato2 = candidato2 + 1
        elif voto == 3:
            candidato3 = candidato3 + 1
        elif voto == 4:
            candidato4 = candidato4 + 1
        elif voto == 5:
            branco = branco + 1
        elif voto >= 6:
            votonulo = votonulo + 1
        elif voto == 0:
            break

votar()
print(candidato1)