package org.example.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Aluno extends Pessoa{
    private int rm;
    private String nome;
    private String curso;
    private int idade;
    private String telefone;
    private String email;
}

