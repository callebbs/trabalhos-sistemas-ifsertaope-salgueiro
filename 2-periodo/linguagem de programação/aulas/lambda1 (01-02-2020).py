numeros = [4, 57, 2, 8, 27, 34, 76, 1, 91]

numPares = filter((lambda n: n % 2 == 0), numeros)

print(list(numPares))

'''
SEM LAMBDA

numeros = [4, 57, 2, 8, 27, 34, 76, 1, 91]

numPares = list( filter((lambda n: n % 2 == 0), numeros) )

print( numPares )
'''