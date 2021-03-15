import json

def addNovoContato():
    #limpando texto anterior
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
        
    #importando dados
    arquivo = open("dados.json","r")
    dados = json.load(arquivo)
   
    #adicionando dados
    novo_nome = str(input("Digite o nome para adicionar na lista: "))
    dados.append(novo_nome)
    print("Nome adicionado com sucesso.")
    
    #adicionando ao json
    arquivo = open("dados.json","w")
    json.dump(dados, arquivo)
    arquivo.close()

def DeletarContato():
    arquivo = open("dados.json","r")
    dados = json.load(arquivo)
    
    #deletando dados
    arquivo = open("dados.json", "w")
    novo_nome = str(input("Digite o nome para deletar da lista: "))
    dados.remove(novo_nome)
    json.dump(dados, arquivo)
    arquivo.close()
    print("Nome deletado com sucesso.")

def PesquisarContato():
    #pesquisando
    arquivo = open("dados.json","r")
    dados = json.load(arquivo)

    nome = str(input("Digite o nome que deseja pesquisar: "))
    for i in dados:
        if nome in dados:
            print(f"O nome {nome} foi encontrado.")
            break
        else:
            print(f"O nome {nome} não foi encontrado.")
            break

def menu():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
    escolha = 0

    while escolha != 4:
        print("+-------------------------------------+")
        print("|                                     |")
        print("|         AGENDA TELEFÔNICA           |")
        print("|                                     |")
        print("+-------------------------------------+")
        print("|1 - Adicionar novo contato.          |")
        print("|2 - Deletar contato.                 |")
        print("|3 - Pesquisar contato.               |")
        print("|4 - Finalizar programa               |")
        print("+-------------------------------------+")

        escolha = int(input("Digite uma opção: "))
        if escolha == 1:
            addNovoContato()
        elif escolha == 2:
            DeletarContato()
        elif escolha == 3:
            PesquisarContato()
        elif escolha == 4:
            print("Programa finalizado.")
            break

menu()