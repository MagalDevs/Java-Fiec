package escola;

public class Professor extends Pessoa{
    private String Dept;

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    @Override
    public String getNome() {
        return "Professor - " + this.nome;
    }
}
