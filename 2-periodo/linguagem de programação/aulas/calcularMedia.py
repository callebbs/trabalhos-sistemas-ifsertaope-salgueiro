#feito na aula 14-12-2020

nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))

media = (nota1 + nota2) / 2

if media >= 7:
    print("Você está aprovado.\nSua média foi {}".format(media))
else: 
    print("Infelizmente você não atingiu a nota.\nSua média foi de {}.".format(media))