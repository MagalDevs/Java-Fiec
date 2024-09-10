package ParteS.ParteSB.Classes;

public class VooInternacional extends Voo{
    private String escala;

    public VooInternacional(int id, String origem, String destino, String data, String escala) {
        super(id, origem, destino, data);
        this.escala = escala;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    @Override
    public String toString() {
        return "VooInternacional{" +  "id=" + id + ", origem='" + origem + '\'' + ", destino='" + destino + '\'' +", escala='" + escala + '\'' +   ", data='" + data + '\'' + '}';
    }
}
