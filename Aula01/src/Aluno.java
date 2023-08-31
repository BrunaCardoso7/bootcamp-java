public class Aluno {
    String nome;
    int[] notasSemestral = new int [2];

    public static int calcularMedia(int[] notasSemestral) {
        int soma = 0;
        for (int nota : notasSemestral){
            System.out.println("nota "+nota);
            soma+=nota;
        }
        return soma/notasSemestral.length;
    }
    public static void main(String[] args) {
        Aluno Eduardo = new Aluno();
        Eduardo.nome = "Eduardo";
        Eduardo.notasSemestral[0] = 2;
        Eduardo.notasSemestral[1] = 8;
        int media = calcularMedia(Eduardo.notasSemestral);
        if(media < 7){
            System.out.println("Eduardo tá de recuperação");
        } else if(media >=7){
            System.out.println("Eduardo está passado de semestre");
        }
        System.out.println("Média do aluno Eduardo é: " + media);
    }
}
