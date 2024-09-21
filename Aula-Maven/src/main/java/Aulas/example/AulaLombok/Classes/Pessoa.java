package Aulas.example.AulaLombok.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    String cpf;
    String cep;
    int numero;
    String complemento;

}

