import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int numAdivinhacao = new Random().nextInt();
        int numDigitado = 0;

        System.out.println("----------------------------------------");
        System.out.println("Bem vindo ao nosso jogo de adivinhações!");
        System.out.println("----------------------------------------");
        System.out.println("Você terá 5 tentativas para adivinhas o número");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Agora digite um número entre 0 e 100: ");
            numDigitado = leitura.nextInt();

            if (numDigitado > numAdivinhacao){
                System.out.println("O número digitado por vc é maior que o número que deve adivinhar!");
            } else if (numDigitado < numAdivinhacao) {
                System.out.println("O número digitado por vc é menor que o número que deve adivinhar!");
            } else break;

            System.out.println("Tentativa número: "+ i);
        }
    }
}