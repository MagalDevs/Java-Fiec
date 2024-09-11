package Questao2;

public class Computador {
    private int id;
    private double preco;
    private String modeloComputador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModeloComputador() {
        return modeloComputador;
    }

    public void setModeloComputador(String modeloComputador) {
        this.modeloComputador = modeloComputador;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", preco=" + preco +
                ", modeloComputador='" + modeloComputador + '\'' +
                '}';
    }
}
