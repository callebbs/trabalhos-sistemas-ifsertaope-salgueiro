'''
Faça um programa que leia uma lista de compras dentro de um arquivo texto, contendo o nome e o preço de diversos produtos (separados por dois-pontos), calcule e mostre a lista detalhada e o total da compra em um arquivo HTML. Observação: crie pelo menos 3 funções para auxiliar na solução do problema. Segue a estrutura do arquivo.
'''

nome = "João"
arquivo = open('lista_de_compras.txt', 'r')
compras = arquivo.readlines()
arquivo.close()

texto = f'''
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recibo de Compras</title>
</head>
<body>
    
</body>
</html>
'''


recibo = open('recibo_compras.html', 'w')
recibo.write(texto)
recibo.close()


