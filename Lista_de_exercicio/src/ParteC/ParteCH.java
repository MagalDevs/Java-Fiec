package ParteC;

import org.junit.jupiter.api.Test;

public class ParteCH {

    public class Produto{
        String nome;
        double preco;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

    }

    @Test
    void Proudutos(){
        Produto produto = new Produto();
        produto.nome = "Produto1";
        produto.preco = 12.99;

        System.out.println("Nome: " + produto.getNome() +"\nPreço: R$" + produto.getPreco());
    }


}
