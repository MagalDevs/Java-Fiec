import org.junit.jupiter.api.Test;

public class Testes {
    @Test
    void test(){
        Cachorro dog = new Cachorro();
        dog.setIdade(12);
        dog.setNome("Allejo");
        dog.setRaca("Puddle");
        System.out.println("Cachorro " + dog.getNome() + " da raca " + dog.getRaca() + " tem " + dog.getIdade() + " anos");
    }

    class Cachorro{
        //atributos
        String nome;
        String raca;
        int idade;

        public int getIdade(){
            return idade;
        }
        public String getNome(){
            return nome;
        }
        public String getRaca(){
            return raca;
        }

        public void setIdade(int idade){
            this.idade = idade;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }

        //Métodos

        public void latir() {
            System.out.println("Au Au");
        }

        public void correr(){
            System.out.println("*correndo...");
        }
    }

}

