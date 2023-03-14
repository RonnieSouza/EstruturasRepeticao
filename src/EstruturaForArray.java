public class EstruturaForArray {
    public static void main(String[] args) {
        String alunos [] = {"JOAO" , "PAULA" , "GEOVANA" , "LETICIA"};

        for (int cont = 0; cont < alunos.length; cont++) {
            System.out.println("O indice agora é: " + cont + " e o aluno é o: " + alunos[cont]);
        }

        //temos tambem para usar com array o for each
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
