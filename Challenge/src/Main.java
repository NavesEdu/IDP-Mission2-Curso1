import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new  Scanner(System.in);

        //Declaração de variáveis
        String nome;
        String tipoConta;
        double saldo;
        String operacoes;
        int op;
        double receber;
        double transferir;
        //double novoSaldo;

        System.out.println("Vamos iniciar sua conta!");
        System.out.println("Primeiro entre com o seu nome: ");
        nome = leitura.nextLine();
        System.out.println("Agora entre com o tipo da sua conta: ");
        tipoConta = leitura.nextLine();
        System.out.println("Entre com o saldo inicial da sua conta: ");
        saldo = leitura.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo Inicial:  R$ " + String.format("%.2f",saldo));

        System.out.println("Operações possíveis: ");

        operacoes = """
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
        System.out.println(operacoes);

        System.out.println("Digite a operação desejada: ");
        op = leitura.nextInt();

        while (op != 4){

            switch (op){

                case 1:
                    System.out.println("Aqui está o saldo da sua conta: " + String.format("%.2f",saldo));
                    break;

                case 2:
                    System.out.println("Informe o valor a receber: ");
                    receber = leitura.nextDouble();
                    saldo +=receber;
                    System.out.println("Saldo atualizado: R$ " + String.format("%.2f",saldo));
                    break;

                case 3:
                    System.out.println("Informe o valor a ser transferido: ");
                    transferir = leitura.nextDouble();
                    if (transferir > saldo){
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo -= transferir;
                        System.out.println("Saldo atualizado: R$ " + String.format("%.2f",saldo));
                    }
                    break;
            }

            System.out.println(operacoes);
            System.out.println("Digite a operação desejada: ");
            op = leitura.nextInt();
        }

    }
}