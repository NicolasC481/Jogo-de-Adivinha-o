import random

print("--- Jogo de Adivinhação ---")
numero_secreto = random.randint(1, 10)
acertou = False

while not acertou:
    palpite = int(input("Adivinhe um número (entre 1 e 10): "))
    
    if palpite == numero_secreto:
        print("🎉 Parabéns! Você acertou!")
        acertou = True
    elif palpite < numero_secreto:
        print("O número é maior. Tente novamente!")
    else:
        print("O número é menor. Tente novamente!")