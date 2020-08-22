#QUESTÃO 05

'''
Desenvolva um jogo em que o usuário tenha que adivinhar uma palavra que será mostrada com
as letras embaralhadas. O programa terá uma lista de palavras e escolherá uma aleatoriamente.
O jogador terá três tentativas para adivinhar a palavra. Ao final a palavra sorteada deverá ser
mostrada na tela, informando se o usuário ganhou ou perdeu o jogo.
'''

#---------------------------------------------------------------------------------------------------

jogarMais = "sim"

import random
nomesProf = ["kelsen", "orlando", "francisco", "francenila", "marcelo", "alice", "josenildo", "augusto", "raquel"]
escolhida = random.choice(nomesProf)
wordjogo = list(escolhida)
random.shuffle(wordjogo)

print("-" * 30)
print("-----Jogo da Adivinhação------\nDentre os nomes dos professores\nde Sistemas Para Internet no IF-Sertão Salgueiro\nTente adivinhar quem é essa pessoa: -> {}".format(''.join(wordjogo)))
print("-" * 30)

palpite = str(input(("Você tem TRÊS tentativas.\nDigite a seu palpite: ")))

for i in range(0, 3):
    if palpite == escolhida:
        print("Parabéns! Você acertou! O nome sorteado é: {}".format(escolhida))
        break
    elif i == 2:
        print("Suas chances acabaram e você não acertou! O nome era: {}". format(escolhida))
    else:
        palpite == str(input("Você errou. Tente novamente!\nDigite outro palpite: "))




