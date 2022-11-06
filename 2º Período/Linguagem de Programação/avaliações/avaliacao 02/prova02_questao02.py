'''
Faça um programa que leia uma lista de compras dentro de um arquivo, contendo
o nome e o preço de diversos produtos (separados dois-pontos), e calcule o total da
compra. Segue a estrutura do arquivo.
'''

arquivo = open('lista_de_compras.txt', 'r')
dados = arquivo.readlines()
arquivo.close()

total_itens = len(dados)
valor = 0.0
total = 0.0

print("Calculando o total das compras...")
for i in range(0, total_itens):
    preco = dados[i][-5:-1]
    preco1 = float(preco)
    total = total + preco1

print(f"Total a pagar: {total}")