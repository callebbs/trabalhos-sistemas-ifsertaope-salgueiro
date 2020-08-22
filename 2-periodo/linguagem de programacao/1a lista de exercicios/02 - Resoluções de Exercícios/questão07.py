#QUESTÃO 07

'''
Crie um programa para gerenciar uma lista de tarefas. O programa deve permitir inserir, excluir
e marcar tarefas como realizadas. As opções do programa devem ser apresentadas através de
um menu (conforme exemplo). Obs.: as ações de inserir, excluir, marcar tarefa realizada, listar
tarefas e o menu devem ser feitas através de funções criadas por você.
'''
#---------------------------------------------------------------------------------------------------

def markTarefa():
    listar()
    tarmar = int(input("Informe o número da tarefa para marcação: "))
    nometar = "* " + tarefas[tarmar - 1] + " *"
    tarefas[tarmar - 1] = nometar


def listTarefa():
    i = 0
    while i < len(tarefas):
        print("Tarefa {} : {}".format(i + 1, tarefas[i]))
        i += 1


def excluir():
    listar()
    tardel = int(input("Informe o número da tarefa para exclusão: "))
    del tarefas[tardel - 1]
    listar()


def listar():
    i = 0
    while i < len(tarefas):
        print("Tarefa {} : {}".format(i + 1, tarefas[i]))
        i += 1

def addTarefa():
    return tarefas.append(str(input("Digite uma tarefa: ")))


def menu():
    escolha = 0

    while escolha != 5:
        print("+--------------------------------------------------------+")
        print("|                                                        |")
        print("|                   LISTA DE TAREFAS                     |")
        print("|                                                        |")
        print("+--------------------------------------------------------+")
        print("|1 - Inserir tarefa                                      |")
        print("|2 – Marcar tarefa como concluída                        |")
        print("|3 – Excluir tarefa                                      |")
        print("|4 – Listar tarefas                                      |")
        print("|5 – Sair                                                |")
        print("+--------------------------------------------------------+")

        escolha = int(input("Digite sua opção: "))
        if escolha == 1:
            addTarefa()
        if escolha == 2:
            markTarefa()
        if escolha == 3:
            excluir()
        if escolha == 4:
            listTarefa()
        if escolha == 5:
            break
#---------------------------------------------


tarefas = []
menu()