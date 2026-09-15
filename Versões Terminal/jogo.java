import java.util.Scanner;
import java.util.Random;

public class jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        boolean acertou = false;

        System.out.println("--- Jogo de Adivinhação ---");

        while (!acertou) {
            System.out.print("Adivinhe um número (entre 1 e 10): ");
            int palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("🎉 Parabéns! Você acertou!");
                acertou = true;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número é maior. Tente novamente!");
            } else {
                System.out.println("O número é menor. Tente novamente!");
            }
        }
        scanner.close();
    }
}