import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class atividade1 {
    Scanner scanner = new Scanner(System.in);
    @Test
    void test(){
        Aluno alunoNovo = new Aluno();
        alunoNovo.setNome("Daniel");
        alunoNovo.setRm(37046);
        alunoNovo.setCurso("Informática");
        System.out.println("Nome: " + alunoNovo.getNome() + ", Rm: " + alunoNovo.getRm() + ", Curso: " + alunoNovo.getCurso());
    }

    class Aluno {
        String nome;
        String curso;
        int rm;

        public int getRm() {
            return rm;
        }

        public String getNome() {
            return nome;
        }

        public String getCurso() {
            return curso;
        }

        public void setRm(int rm) {
            this.rm = rm;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }
    }

}
