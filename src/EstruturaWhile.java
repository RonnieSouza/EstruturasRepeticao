public class EstruturaWhile {
    public static void main(String[] args) {

        //while testa a condição antes da executação do codigo, ou seja se a condição não for satisfeita já na primeira
        //ele nem executa nenhuma vez o trexo de codigo

        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = 5.0;

            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + " adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Foi gasta toda a mesada");

    }
}
