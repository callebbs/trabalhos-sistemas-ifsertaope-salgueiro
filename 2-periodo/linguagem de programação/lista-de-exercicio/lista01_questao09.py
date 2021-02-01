'''
Escreva um programa que lê duas notas de vários alunos e armazena estas notas em um  dicionário, onde a chave é o nome do aluno. 
A entrada de dados deve terminar quando for lida  uma string vazia como nome. 
Escreva uma função que permita retornar a média do aluno, dado  o seu nome como argumento. 
'''

def media(nome):
    nota1 = alunos[nome] [0]
    nota2 = alunos[nome] [1]
    media = (nota1 + nota2) / 2
    return media

#--------------------------------------------------------------------------------------------------

alunos = {}
nome = "teste"

while (nome != ""):
    nome = input("Digite o nome do aluno(a): ")
    if nome == "":
        print("Fim do Cadastro")
        print("=" * 30)
        break
    else:
        nota1 = float(input("Digite a primeira nota: "))
        nota2 = float(input("Digite a segunda nota: "))
        alunos[nome] = [nota1, nota2]

print("Lista de Alunos Cadastrados:")
print("-" * 30)
for i in alunos:
    print(i)
print("-" * 30)

resposta = "sim"
while (resposta != "não"):
    nomeMedia = input("Digite o nome para visualizar a média: ")
    print("A média do aluno(a) {} é {}".format(nomeMedia, media(nomeMedia)))

    resposta = input("Deseja continuar? Digite SIM ou NÃO: ")