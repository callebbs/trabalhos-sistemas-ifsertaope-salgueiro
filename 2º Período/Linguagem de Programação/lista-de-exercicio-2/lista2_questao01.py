'''
Crie um programa que emite "beeps" em uma hora e minuto marcados pelo usuário.
Dessa forma, o programa deverá receber do usuário a hora e o minuto que ele quer que o alarme dispare (o beep).
Quando chegar na hora e minuto exatos, o alarme deverá tocar 5 vezes (5 beeps).
'''

from datetime import datetime
import winsound

print("-" * 30)
print("Programa de Alarme")
print("-" * 30)
hora_escolhida = str(input("Digite a hora e o minuto para acionar o lembrete: Formato: HH:MM: "))
alarme = datetime.strptime(hora_escolhida, '%H:%M')

print("-" * 30)
print(f"O alarme será tocado às: {alarme.hour}:{alarme.minute}")
print("-" * 30)

while True:
    if datetime.now().hour == alarme.hour and datetime.now().minute == alarme.minute:
        for i in range(5):
            winsound.Beep(440, 1000)
        break