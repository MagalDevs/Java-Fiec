package ParteA.ParteAC.Classes;

public class Funcionario extends Pessoa{
    private double salario;


    public Funcionario(String cpf, String apelido, int idade, double salario) {
        super(cpf, apelido, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "funcionario{" +
                "salario=" + salario +
                ", cpf='" + cpf + '\'' +
                ", apelido='" + apelido + '\'' +
                ", idade=" + idade +
                '}';
    }
}
