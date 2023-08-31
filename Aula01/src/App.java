public class App {
     public class Cachorro{
        String nome;
        int idade;
        int peso;
        void infDog(){
            System.out.println("A idade do Cachorro é: " + idade);
            System.out.println("O peso do Cachorro é: " + peso);
        }
        void latir(){
            System.out.println(nome + " disse: auau!");
        }
    }
    public class Poodle extends Cachorro{
        int quantPatas;
    }
    public static void main(String[] args) {
        App app = new App();
        Poodle Ray = app.new Poodle();
        Ray.idade = 8;
        Ray.peso = 10;
        Ray.nome = "Ray";
        Ray.quantPatas = 4;
        Ray.infDog();
        Ray.latir();
    }
}
