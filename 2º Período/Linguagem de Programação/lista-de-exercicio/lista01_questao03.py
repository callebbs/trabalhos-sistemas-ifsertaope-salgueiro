'''
Desenvolva um programa que leia 9 (nove) números inteiros e os armazene numa matriz 3x3,  
em seguida mostre na tela os elementos que estão no triângulo inferior direito da matriz. 

'''

matriz = []
linha1 = []
linha2 = []
linha3 = []

print("=" * 22)
print("Criando a matriz: ")

for i in range(0, 3):
    linha1.append(int(input("Digite a primeira linha da matriz 3x3: ")))

for i in range(0, 3):
    linha2.append(int(input("Digite a segunda linha da matriz 3x3: ")))

for i in range(0, 3):
    linha3.append(int(input("Digite a terceira linha da matriz 3x3: ")))

matriz = [linha1, linha2, linha3]

print("=" * 22)
print(f"A matriz criada foi: \n{matriz[0]}\n{matriz[1]}\n{matriz[2]}")
print("=" * 22)

print("Elementos que estão no triângulo inferior direito desta matriz:")

print(f"[      {matriz[0][2]}]")
print(f"[   {matriz[1][1]}, {matriz[1][2]}]")
print(f"{matriz[2]}")
print("=" * 22)
