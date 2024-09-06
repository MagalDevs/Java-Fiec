package Quest4.Classe;

public class Obras {
    private String id;
    private String obra;
    private String autoria;
    private int anoAlocamento;

    public Obras(String id, String obra, String autoria, int anoAlocamento) {
        this.id = id;
        this.obra = obra;
        this.autoria = autoria;
        this.anoAlocamento = anoAlocamento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObra() {
        return obra;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public String getAutoria() {
        return autoria;
    }

    public void setAutoria(String autoria) {
        this.autoria = autoria;
    }

    public int getAnoAlocamento() {
        return anoAlocamento;
    }

    public void setAnoAlocamento(int anoAlocamento) {
        this.anoAlocamento = anoAlocamento;
    }

    @Override
    public String toString() {
        return "Obras{" +
                "id='" + id + '\'' +
                ", obra='" + obra + '\'' +
                ", autoria='" + autoria + '\'' +
                ", anoAlocamento=" + anoAlocamento +
                '}';
    }
}
