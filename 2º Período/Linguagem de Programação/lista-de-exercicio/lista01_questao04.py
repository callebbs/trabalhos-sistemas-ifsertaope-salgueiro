'''
Faça um programa que solicite a data de nascimento (DD de MM de AAAA) do usuário e imprime a data no formato DD/MM/AAAA.

Exemplo:
Data de Nascimento: 29 de Outubro de 1973
Você nasceu em 29/10/1973
'''
def mesesAno(m):
    Meses = [" ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"]
    
    if m == "Janeiro":
        return str(Meses[1])
    elif m == "Fevereiro":
        return str(Meses[2])
    elif m == "Março":
        return str(Meses[3])
    elif m == "Abril":
        return str(Meses[4])
    elif m == "Maio":
        return str(Meses[5])
    elif m == "Junho":
        return str(Meses[6])
    elif m == "Julho":
        return str(Meses[7])
    elif m == "Agosto":
        return str(Meses[8])
    elif m == "Setembro":
        return str(Meses[9])
    elif m == "Outubro":
        return str(Meses[10])
    elif m == "Novembro":
        return str(Meses[11])
    elif m == "Dezembro":
        return str(Meses[12])

#------------------------------------------------------------------

dia = input("Digite o DIA em que você nasceu (Ex: 19): ")
mes = input("Digite o MÊS em que você nasceu: (Ex: Junho): ")
ano = input("Digite o ANO em que você nasceu: (Ex: 1989): ")

data = [dia, mes, ano]

print("Data de Nascimento: {} de {} de {}.".format(data[0], data[1], data[2]))
print("Você nasceu em: {} / {} / {}".format(data[0], mesesAno(mes), data[2]))
