package Questao4.Classe;

public class Aluno extends Pessoa{
    private int rm;

    public Aluno(String pessoa, int idade, int rm) {
        super(pessoa, idade);
        this.rm = rm;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "rm=" + rm +
                ", pessoa='" + pessoa + '\'' +
                ", idade=" + idade +
                '}';
    }
}
