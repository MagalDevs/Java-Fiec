package ParteA.ParteAC.Classes;

public class Pessoa {
    protected String cpf;
    protected String apelido;
    protected int idade;

    public Pessoa(String cpf, String apelido, int idade) {
        this.cpf = cpf;
        this.apelido = apelido;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", apelido='" + apelido + '\'' +
                ", idade=" + idade +
                '}';
    }
}
