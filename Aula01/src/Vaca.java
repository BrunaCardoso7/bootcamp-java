public class Vaca {
    float peso;
    String nome;
    public static void somVaca(){
        System.out.println("moooon");
    }
    public static void main(String[] args) {
        Vaca Clarabela = new Vaca();
        Clarabela.nome = "Clarabela";
        Clarabela.peso = 50;
        System.out.println("nome da vaca: " + Clarabela.nome);
         System.out.println("peso da vaca: " + Clarabela.peso);
        Clarabela.somVaca();
    }
}
