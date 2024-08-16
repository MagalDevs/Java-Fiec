import org.junit.jupiter.api.Test;

public class Testes {
    @Test
    void test(){
        Cachorro dog = new Cachorro();
        System.out.println(dog.idade);
    }

    class Cachorro{
        //atributos
        String nome;
        String raca;
        int idade;

        //Métodos

        public void latir() {
            System.out.println("Au Au");
        }

        public void correr(){
            System.out.println("*correndo...");
        }
    }

}

