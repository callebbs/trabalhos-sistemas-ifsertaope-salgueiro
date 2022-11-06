'''
1) Escreva programa que intercala duas tuplas de três elementos cada e apresenta na tela uma tupla com os seis elementos intercalados. Exemplo: (1,2,3) e (4,5,6) = (1,4,2,5,3,6)
'''
#criando as tuplas
tupla1 = (int(input("Digite um número para a primeira tupla: ")), 
int(input("Digite um segundo número para a primeira tupla: ")),
int(input("Digite um terceiro numero número para a primeira tupla: ")))

tupla2 = (int(input("Digite um número para a segunda tupla: ")),
int(input("Digite o segundo número para a segunda tupla: ")),
int(input("Digite o terceiro número para a segunda tupla: ")))

print(f"As tuplas digitadas foram: {tupla1} e {tupla2}")
print("Intercalando tuplas...")

tupla3 = (tupla1[0], tupla2[0], tupla1[1], tupla2[1], tupla1[2], tupla2[2])
print(tupla3)