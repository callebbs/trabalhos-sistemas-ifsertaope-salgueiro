'''
Faça um programa que leia uma lista de compras dentro de um arquivo texto, contendo o nome e o preço de diversos produtos (separados por dois-pontos), calcule e mostre a lista detalhada e o total da compra em um arquivo HTML. Observação: crie pelo menos 3 funções para auxiliar na solução do problema. Segue a estrutura do arquivo.
'''
def ValorDevido(dados):
    valor = 0.0
    total_itens = len(dados)
    for i in range(0, total_itens):
        precos = dados[i][-5:-1]
        preco = float(precos)
        valor = valor + preco
    return valor

def GerarRecibo():
    #total_itens = len(dados)
    recibo = open('recibo_compras.html', 'w')
    recibo.write('''<!DOCTYPE html>
    <html lang="pt-br">
    <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recibo de Compras</title>
    </head>
    <body>
    Produtos<br>
    (Nome: Valor)<br>
    ---------------------<br>
    ''')
    #ListarCompras(dados)
    total_itens = len(dados)
    for i in range(0, total_itens):
        recibo.write(dados[i][:-1] + '<br>')
    recibo.write('<br>')
    recibo.write('--------------------<br>')
    recibo.write('Total a pagar:<br>')
    recibo.write(f'{ValorDevido(dados):.2f}')
    recibo.write('</body>')
    recibo.write('</html>')
    recibo.close()

def LendoDados():
    arquivo = open('lista_de_compras.txt', 'r')
    dados = arquivo.readlines()
    arquivo.close()
    return dados

dados = LendoDados()
GerarRecibo()