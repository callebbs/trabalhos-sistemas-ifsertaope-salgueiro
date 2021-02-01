#Programa principal - testa o módulo matematica.py
import matematica as mat

num1 = int(input("Digite um número: "))
num2 = int(input("Digite outro número: "))

resultado = mat.maior(num1, num2)
print( "O maior número é: ", resultado )

resultado = mat.menor(num1, num2)
print( "O menor número é: ", resultado )

resultado = mat.ehMultiplo(num1, num2)
print("O primeiro número é múltiplo do segundo: ", resultado)