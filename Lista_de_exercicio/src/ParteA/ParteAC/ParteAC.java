package ParteA.ParteAC;
import  ParteA.ParteAC.Classes.Funcionario;

public class ParteAC {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("1234", "Deivid", 29, 3000);

        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getApelido());
        System.out.println(funcionario.getIdade());
        System.out.println(funcionario.getSalario());
    }
}
