import java.util.Scanner;

public class OutroLoop {


    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double nota = 0;
        double media = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Avaliação para o filme");
            nota = leitura.nextDouble();
            if (nota != -1){
                media+=nota;
                totalDeNotas++;
            }
        }

        System.out.println("A média das avaliações do filme é: "+media/totalDeNotas);

    }
}
