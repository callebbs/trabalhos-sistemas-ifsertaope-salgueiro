#QUESTÃO 01

'''
Faça um programa que leia 2 (duas) strings e em seguida informa
o conteúdo delas seguido do seu comprimento.

Informe também se as duas strings possuem o mesmo
comprimento e se são iguais ou diferentes no conteúdo.
'''

#================================================================

string1 = input("Digite uma frase: ")
string2 = input("Digite outra frase: ")

tamanho1 = len(string1)
tamanho2 = len(string2)

print("=" * 50)
print("Tamanho da frase:", string1, len(string1), "caracter(es).")
print("Tamanho da frase:", string2, len(string2), "caracter(es).")


if tamanho1 == tamanho2:
    print("As duas strings são de tamanhos iguais.")
else:
    print("As duas strings são de tamanhos diferentes.")
if (string1 != string2):
    print("As duas strings possuem conteúdos diferentes.")
else:
    print("As duas strings possuem conteúdos iguais.")
print("=" * 50)
