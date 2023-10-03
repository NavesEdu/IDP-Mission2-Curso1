// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o ScreenMatch!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: "+ anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.0F;

        //média calculada através de 3 notas
        double media = (9.8 +6.3 + 8.0) /3;
        System.out.println(media);

        String sinopse;
        sinopse = "Filme de aventura com o Tom Cruise";
        sinopse = """
                Top Gun
                Filme de aventura com o Tom Cruise
                """+ anoDeLancamento;
        System.out.println(sinopse);

        String nomeFilme = "Top Gun";
        String sinopseComFormat;
        sinopseComFormat = """
                O nome do filme é %s, e seu ano de lançamento é %d
                """.formatted(nomeFilme, anoDeLancamento);

        System.out.println(sinopseComFormat);

        int classificacao = (int) media/2;
        System.out.println(classificacao);



    }
}