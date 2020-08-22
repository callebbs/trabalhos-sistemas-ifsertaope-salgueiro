#QUESTÃO 08

'''
Desenvolva um programa que recebe duas listas de caracteres: lista A e lista B. Implemente
funções para realizar a união, a interseção e a diferença dos elementos dessas duas listas. Depois
das entradas o programa deve apresentar os retornos de cada uma das funções criadas na tela.
'''
#---------------------------------------------------------------------------------------------------------

def Intersec(lista1, lista2):
    InterList = []
    
    for i in listaA:
        if i in listaB:
            InterList.append(i)
    return InterList

def Diferenca(lista1, lista2):
    DifeList = []

    for i in listaA:
        if i not in listaB:
            DifeList.append(i)
    for i in listaB:
        if i not in listaA:
            DifeList.append(i)
    return DifeList

def Uniao(lista1, lista2):
    UniList = []
    Todos = listaA + listaB

    for i in Todos:
     
        if i not in UniList:
            UniList.append(i)
       
    return UniList
#---------------------------------------------------------------------------------------------------------

listaA = ["a", "b", "d", "e"]
listaB = ["a", "b", "c", "e"]

print("Lista A:", listaA)
print("Lista B: ", listaB)
print("A interseção das listas é:", Intersec(listaA, listaB))
print("A diferença das listas é: ", Diferenca(listaA, listaB))
print("A união das listas é: ", Uniao(listaA, listaB))

