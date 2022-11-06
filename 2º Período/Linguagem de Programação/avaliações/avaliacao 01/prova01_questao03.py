#1ª Avaliação - Linguagem de Programação

#Questão 03

def somaTrios(lista):
    tamanho = len(lista)
    nova_lista = []
    soma = 0
    for i in range(0, tamanho):
        for i in lista[i]:
            soma = soma + i
        nova_lista.append(soma)
        soma = 0

    return print(nova_lista)

somaTrios([[1,2,3],[3,4,5],[5,6,7],[7,8,9],[9,10,11]])