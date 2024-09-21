package Aulas.interfaces.empresa;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Operario extends Pessoa implements Funcionario {
    @Override
    public void folga() {
        System.out.println("2 dias por semana");
    }

    @Override
    public void trabalha() {
        System.out.println("5 dias por semana");
    }
}
