arq = open("dados_aula00_escrita.txt", "r")

linhas = arq.readlines()

for lin in linhas:
    print( lin, end="" )

arq.close()