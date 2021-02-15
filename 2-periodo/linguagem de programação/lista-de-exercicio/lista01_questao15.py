'''
Alguns sites de downloads utilizam protetores de links, daqueles que pedem para cadastrar um  celular antes de poder fazer o download. Porém, esses protetores na maioria das vezes simplesmente recebem o site de destino como parâmetro da URL e o redirecionam após o cadastro do celular. Sua tarefa é criar uma função chamada extractURL que recebe uma String  contendo um link protegido e retorna o link de destino.  

Observações: 
a. O link de destino pode ou não vir invertido no link protegido e o site do protetor de links  não é sempre o mesmo. 
b. A solução do problema deve utilizar mais de uma função implementada por você. Todas as funções auxiliares para a resolução do problema devem ser criadas por você. 

'''

def extractURL(link):
    for c in range (0, len(link)):
        if link[c] == 'u':
            if link[c+1] == 'r':
                if link[c+2] == 'l':
                    posicao = c + 4
                    break
                
    if link[posicao] == 'h':
        if link[posicao+1] == 't':
            if link[posicao+2] == 't':
                for c in range (posicao, len(link)):
                    print (link[c], end='')
    else:
        for i in range ((len(link)-1), posicao, -1):
            print (link[c], end='')
    

link = input ("Digite o link para extração da URL verdadeira: ")
(extractURL(link))