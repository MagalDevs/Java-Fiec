package escola;

public class Aluno extends Pessoa{
    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String getNome() {
        return "Aluno - " + this.nome;
    }
}
