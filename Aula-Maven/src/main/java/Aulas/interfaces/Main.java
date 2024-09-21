package Aulas.interfaces;

import Aulas.interfaces.empresa.Funcionario;
import Aulas.interfaces.empresa.Motorista;
import Aulas.interfaces.empresa.Operario;
import Aulas.interfaces.empresa.Pessoa;

public class Main {
    public static void main(String[] args) {
        Operario operario = new Operario();
        Motorista motorista = new Motorista();

        imprimeTrabalho(operario);
        imprimeTrabalho(motorista);
    }

    public static void imprimeTrabalho(Funcionario f){
        f.trabalha();
    }

    public static void pegaNome(Pessoa p){
        System.out.println(p.getName());
    }
}
