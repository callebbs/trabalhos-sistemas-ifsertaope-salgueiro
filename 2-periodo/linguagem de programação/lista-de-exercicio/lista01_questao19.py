'''
Implemente uma função chamada eliminarRepetidos([ Int ]) 🡪 [ Int ], que recebe uma lista de  inteiros e devolve a mesma lista, mas sem elementos repetidos, mantendo apenas a primeira ocorrência de cada elemento. 

Observações: 
a. Não utilize strings para a solução do problema. 
b. Todas as funções auxiliares para a resolução do problema devem ser criadas por você. 

'''

def eliminarRepetidos(lia):
    lista = lia
    conta = 0
    while conta < len(lista):
        contarepetido = conta + 1
        while contarepetido < len(lista):

            if lista[contarepetido] == lista[conta]:
                del(lista[contarepetido])
            else:
                contarepetido += 1
        conta += 1
    return (lia)

listint = []

for i in range(0, 7):
    elementos = int(input(f"Digite o {i+1}° elemento da lista: "))
    listint.append (elementos)

print("-" * 30)

print(eliminarRepetidos(listint))