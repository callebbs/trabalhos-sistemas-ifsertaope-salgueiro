'''
Faça um programa que leia 2 (duas) strings e em seguida informa o conteúdo delas seguido do  seu comprimento. 
Informe também se as duas strings possuem o mesmo comprimento e se são  iguais ou diferentes no conteúdo.  

Exemplo:

Compara duas strings 
String 1: Brasil Hexa 2022 
String 2: Brasil! Hexa 2022! 
Tamanho de "Brasil Hexa 2022": 16 caracteres 
Tamanho de "Brasil! Hexa 2022!": 18 caracteres 
As duas strings são de tamanhos diferentes. 
As duas strings possuem conteúdos diferentes.

'''
lista1 = []
lista2 = []

lista1 = str(input("Digite uma frase qualquer: "))
lista2 = str(input("Digite outra frase qualquer: "))

tamanho1 = len(lista1)
tamanho2 = len(lista2)

print("=" * 25)
print(" Comparador de Strings",)
print("=" * 25)
print(f"String 1: {lista1}\nString 2: {lista2}")
print(f"Tamanho de {lista1}: {len(lista1)} caracteres.\nTamanho de {lista2}: {len(lista2)} caracteres.")

if tamanho1 == tamanho2:
    print("As duas strings são de tamanhos iguais.")
else:
    print("As duas strings são de tamanhos diferentes.")

if lista1 == lista2:
    print("As duas strings possuem conteúdos iguais.")
else:
    print("As duas strings possuem conteúdos diferentes.")

print("=" * 25)
print("Fim do programa.")
print("=" * 25)