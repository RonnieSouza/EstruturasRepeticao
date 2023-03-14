import java.util.Random;

public class EstruturaDoWhile {
    public static void main(String[] args) {

        //Nesta estrutura o laço de repetição é executado pelo menos 1 vez mesmo que a condição seja falsa.
        System.out.println("Discando....");

        do {
            System.out.println("Telefone Tocando...");
        } while(tocando());

        System.out.println("Alo!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu ? " + atendeu);
        return ! atendeu;
    }

}
