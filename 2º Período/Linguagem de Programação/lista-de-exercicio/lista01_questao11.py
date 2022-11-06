'''
Escreva um programa para armazenar uma agenda de telefones em um dicionário. 
Cada pessoa  pode ter um ou mais telefones e a chave do dicionário é o nome da pessoa. 

Seu programa deve  ter as seguintes opções (todas realizadas através de funções próprias criadas por você): 
a. Incluir Novo Nome – permite acrescentar um novo nome na agenda, com um ou mais telefones. 
b. Incluir Telefone – acrescenta um telefone em um nome já existente na agenda. 
Caso o  nome não exista na agenda, você deve perguntar se a pessoa deseja incluí-lo. 
c. Excluir Telefone – exclui um telefone de uma pessoa que já está na agenda. 
Se a pessoa  tiver apenas um telefone, ela deve ser excluída da agenda.  
d. Excluir Nome – exclui uma pessoa da agenda.  
e. Consultar Telefone – retorna os telefones de uma pessoa na agenda. 

'''
contatos = {}

def addNovoContato():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
    telefones = []
    nome = input("Digite o nome do novo contato: ")
    telefones.append(input(f"Digite um numero para o contato {nome}: "))
    contatos[nome] = telefones
    return print(f"Contato {nome} adicionado com sucesso!")

def addNovoNumero():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
    telefones = []
    telefones.clear()
    novo = ""
    nome = input("Digite o nome do contato para adicionar um número: ")
    if nome not in contatos:
        novo = input(f"{nome} não encontrado na lista. Deseja adicionar este contato?\nDigite sim ou não: ")
        if novo == "sim":
            telefones.append(input(f"Digite um numero para o contato {nome}: "))
            contatos[nome] = telefones
            print("Numero adicionado com sucesso.")
        else:
            print(f"O contato {nome} não foi adicionado.")
        
    else:
        novo_numero = (input(f"Digite um numero para ser adicionado ao contato {nome}: "))
        contatos[nome].append(novo_numero)
        print("Novo contato salvo com sucesso.")

def ExcluirNumero():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
    numdel = 0
    aceitar = ""
    print("Selecione um dos contatos abaixo para excluir APENAS seu número: ")
    print("     Lista de Contatos    ")
    for nome in contatos:
        print(nome)
    nome = input("Qual contato deseja excluir o número? ")
    if len(contatos[nome]) >= 2:
        print(f"Lista de números do contato {nome}: ")
        for i in range(len(contatos[nome])):
            print(f"{i+1} - {contatos[nome][i]}")
        numdel = int(input("Qual telefone deseja excluir? "))
        del contatos[nome][numdel-1]
        print("Numero apagado com sucesso.")
    elif len(contatos[nome]) == 1:
        print("O contato tem apenas UM número de telefone salvo.\nAo deletar este número, o contato também será apagado.")
        aceitar = input("Deseja proseguir? Digite sim ou não: ")
        if aceitar == "sim":
            del contatos[nome]
            print("Contato deletado com sucesso.")
        else:
            print("O contato não foi deletado.")    
    
def ExcluirNome():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
    print("Selecione um dos contatos abaixo para excluir: ")
    print("     Lista de Contatos    ")
    for nome in contatos:
        print(nome)
    nome = input("Qual contato deseja excluir da lista telefônica? ")
    del contatos[nome]
    return print("Contato deletado com sucesso.")
     
def ConsultaTelefone():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
    print("Selecione um dos contatos abaixo para exibir seus números de telefone: ")
    print("-" * 50)
    print("     Lista de Contatos    ")
    print("     -----------------    \n")
    for nome in contatos:
        print(nome)
    print("\n")
    print("-" * 50)
    nome = input("Qual contato deseja selecionar? ")
    for i in range(len(contatos[nome])):
            print(f"Telefone {i+1}: {contatos[nome][i]}")

def menu():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')
    escolha = 0

    while escolha != 6:
        print("+--------------------------------------------------------+")
        print("|                                                        |")
        print("|                   AGENDA TELEFÔNICA                    |")
        print("|                                                        |")
        print("+--------------------------------------------------------+")
        print("|1 - Adicionar novo contato                              |")
        print("|2 – Adicionar novo número                               |")
        print("|3 – Excluir número do contato                           |")
        print("|4 – Excluir contato                                     |")
        print("|5 – Consultar número                                    |")
        print("|6 – Finalizar programa                                  |")
        print("+--------------------------------------------------------+")

        escolha = int(input("Digite uma opção: "))
        if escolha == 1:
            addNovoContato()
        elif escolha == 2:
            addNovoNumero()
        elif escolha == 3:
            ExcluirNumero()
        elif escolha == 4:
            ExcluirNome()
        elif escolha == 5:
            ConsultaTelefone()
        elif escolha == 6:
            print("Programa finalizado.")
            break

menu()
