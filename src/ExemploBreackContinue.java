public class ExemploBreackContinue {
    public static void main(String[] args) {
        for (int cont = 1; cont <= 5; cont++) {
            if(cont == 3)
                break;
            //como tem esse break aqui ele para nesse ponto e nem imprime o proximo comando

            System.out.println("numero: " + cont);
        }

        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");

        for (int cont = 1; cont <= 5; cont++) {
            if(cont == 3)
                continue;
            //como tem esse continue aqui ele não executa o trexo de codigo a seguir e continua o processo
            //ou seja ele não vai imprimir o numero 3

            System.out.println("numero: " + cont);
        }
    }
}
