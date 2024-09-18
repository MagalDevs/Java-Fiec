package org.example;

import org.example.Classes.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno aluno0 = new Aluno();
        Aluno aluno1 = new Aluno(12, "l", "kd", 223, "lkjljk", "dljal@lk");

        Aluno aluno2 = Aluno.builder()
                .rm(12)
                .telefone("dafafa")
                .nome("Marcos")
                .cep("13545758")
                .build();

        System.out.println(aluno2);
    }
}