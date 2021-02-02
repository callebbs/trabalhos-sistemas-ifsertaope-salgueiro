# Aula 01 - Python - Operações Matemáticas

Aulas da cadeira de Linguagem de Programação do Curso de Sistemas para Internet do IF-Sertão PE - Campus Salgueiro.

## Operações Básicas de Matemática

```
Divisão com resto : 2 / 2
Multiplicação:  2 * 2
Soma: 2 + 2
Subtração: 2 - 2
Resto da divisão: 2 % 2
Divisão sem resto: 2 // 2
```

## Calculando em Python

Ao utilizar o IDLE, pode-se utilizar os cálculos diretamente, sem a necessidade de criação de script e/ou variáveis.

> Exemplo:

```
>>> 2 + 2 

>>> 4
```

## Criando um programa para cálculo de média

nota1 = int(input("Digite a sua primeira nota: "))
nota2 = int(input("Digite a sua segunda nota: "))

media = (nota1 + nota2) / 2

print("Sua média é: ", media)