package ParteS.ParteSB.Classes;

public class Voo {
    protected int id;
    protected String origem;
    protected String destino;
    protected String data;

    public Voo(int id, String origem, String destino, String data) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "id=" + id +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
