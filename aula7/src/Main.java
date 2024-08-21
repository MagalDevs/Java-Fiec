import escola.Pessoa;
import escola.Professor;
import escola.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Fellipe");
        professor.setCpf(1234);
        professor.setDept("TI");

        Aluno aluno = new Aluno();
        aluno.setCurso("TI");
        aluno.setNome("Daniel");

        System.out.println(professor.getNome());
        System.out.println(aluno.getNome());
    }
}


