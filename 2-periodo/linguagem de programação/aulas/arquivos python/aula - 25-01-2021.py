#funções

def paresNaLista(lista):
    qtdPares = 0

    for e in lista:
        if e % 2 == 0:
            qtdPares = qtdPares + 1
    
    return qtdPares

#-

numeros = [2, 5, 7, 8, 9, 13, 15]
print(paresNaLista(numeros))