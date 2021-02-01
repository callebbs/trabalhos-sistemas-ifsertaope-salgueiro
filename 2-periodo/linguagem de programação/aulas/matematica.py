#Módulo matematica
#Retorna o maior entre dois números
def maior(x, y):
    if x >= y:
        return x
    else:
        return y

#Retorna o menor entre dois números
def menor(x, y):
    if x <= y:
        return x
    else:
        return y

#Verifica se um número é múltiplo de outro
def ehMultiplo(x, y):
    if x % y == 0:
        return True
    else:
        return False