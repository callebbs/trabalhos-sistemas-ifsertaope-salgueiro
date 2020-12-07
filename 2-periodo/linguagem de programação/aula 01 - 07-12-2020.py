'''
AULA 01

========== Tipo de Variáveis ==========

Python utiliza tipos de variáveis dinâmicas. Ou seja, ela aceita qualquer tipo de valor, sem necessitar de declarar seu tipo anteriormente.

int = integer / números inteiros
float = números reais / ponto flutuante
string = palavras

*** Ex:

num = 10

* Mostra qual o tipo da variável.
type(num): retorna 'int' - integer: números inteiros

num = 10.7

type(num): retorna 'float' - float: números reais

- Não é necessário declarar antes de atribuir valores.

========== Entrada de dados ==========

nome = input("Digite seu nome: ") - a função input() espera do usuário que insira os dados para armazenar na variável.

========== Criando o primeiro programa ==========

* Agora vamos criar um programa básico de média de notas:

nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))

media = (nota1 + nota2) / 2

float é um tipo de dado de ponto flutuante / número real

'''