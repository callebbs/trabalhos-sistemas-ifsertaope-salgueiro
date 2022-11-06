'''
Desenvolva um programa Python que leia o conteúdo de um arquivo texto e cria um outro arquivo texto com o mesmo conteúdo, mas com todas as letras convertidas em minúsculas.
'''

print("Lendo conteúdos do primeiro arquivo texto_original.txt ...")
arquivo = open('texto_original.txt', 'r')
texto1 = arquivo.readlines()
arquivo.close()

linhas = len(texto1)

print("Copiando os conteúdos no arquivo texto_lower.txt ...")
arquivo = open('texto_lower.txt', 'a')
for i in range(0, linhas):
    texto2 = texto1[i]
    texto2 = texto2.lower()
    arquivo.write(texto2)

print("Conteúdo copiado!")