LARGURA = 80
arq = open("texto.txt", "r")

for linha in arq.readlines():
    if linha[0] == ";":
        continue
    elif linha[0] == ">":
        print(linha[1:].rjust(LARGURA))
    elif linha[0] == "*":
        print(linha[1:].center(LARGURA))
    else:
        print(linha)

arq.close()