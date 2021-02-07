from functools import reduce
lista = ["Com ", "Orlando ", "Python ", "é ", "fácil."]
ifsertao = lambda x, y: x + y
reduce(ifsertao, lista)