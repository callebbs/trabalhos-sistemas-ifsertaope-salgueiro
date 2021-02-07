estudo = lambda a: True if a == "Python" else False
linguagens = ["Python", "C", "Java", "Assembly"]
resultado = list(filter(estudo, linguagens))

print(resultado)