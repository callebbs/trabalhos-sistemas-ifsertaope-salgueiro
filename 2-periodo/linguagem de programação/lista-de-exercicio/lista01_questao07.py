'''
Crie um programa para gerenciar uma lista de tarefas. O programa deve permitir inserir, excluir e marcar tarefas como realizadas. 
As opções do programa devem ser apresentadas através de um menu (conforme exemplo). 
Obs.: as ações de inserir, excluir, marcar tarefa realizada, listar tarefas e o menu devem ser feitas através de funções criadas 
por você. 
'''

tarefas = [" "]

def addTarefa():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
    return tarefas.append(str(input("Digite uma tarefa: ")))

def listarTarefa():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
    i = 1
    print("*" * 30)
    print("Tarefas a serem realizadas: ")
    while i < len(tarefas):
        print(f"Tarefa {i}: {tarefas[i]}")
        i = i + 1
    print("OBS: Tarefas que possuem um * já foram realizadas.")
    print("*" * 30)

def delTarefa():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
    listarTarefa()
    numdel = int(input("Digite o número da tarefa para ser apagada: "))
    del tarefas[numdel]

def marcarTarefa():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
    listarTarefa()
    mtarefa = int(input("Digite o número da tarefa para marcar como concluída: "))
    tarefaconcluida = "* " + tarefas[mtarefa] + " *"
    tarefas[mtarefa] = tarefaconcluida


def menu():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
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

        escolha = int(input("Digite uma opção: "))
        if escolha == 1:
            addTarefa()
        if escolha == 2:
            marcarTarefa()
        if escolha == 3:
            delTarefa()
        if escolha == 4:
            listarTarefa()
        if escolha == 5:
            print("Programa finalizado.")
            break

#-------------------------------------------------

menu()