import winsound

arquivo = open("musica.txt", "r")
frequencia = []
tempo = []

for linha in arquivo.readlines():
	if linha[0] == "*":
		tempo = tempo + [linha[1:]]
		continue
	else:
		frequencia = frequencia + [linha]

for conta1 in range(len(tempo)):
	conta1 = conta1 + 1
	for conta2 in range(len(frequencia)):
	    print(winsound.Beep(int(frequencia[conta2]), int(tempo[conta1])))

arquivo.close()
