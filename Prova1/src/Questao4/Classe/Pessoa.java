package Questao4.Classe;

public class Pessoa {
    protected String pessoa;
    protected int idade;

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String pessoa, int idade) {
        this.pessoa = pessoa;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "pessoa='" + pessoa + '\'' +
                ", idade=" + idade +
                '}';
    }
}
