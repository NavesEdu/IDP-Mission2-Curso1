import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favortiro");
        String filme = leitura.nextLine();

        System.out.println(filme);

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println(anoDeLancamento);

        System.out.println("Avaliação para o filme");
        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);


    }

}
