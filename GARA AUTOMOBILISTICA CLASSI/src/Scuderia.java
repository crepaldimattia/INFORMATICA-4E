public class Scuderia {
    private String nome;
    private Pilota pilota;
    private int numeroAuto;
    private Integer tempoGiro;

    public Scuderia(String nome, Pilota pilota, int numeroAuto) {
        this.nome = nome;
        this.pilota = pilota;
        this.numeroAuto = numeroAuto;
        this.tempoGiro = -1;  // Inizializzo con -1, che indica che il tempo non è stato ancora registrato.
    }

    public String getNome() {
        return nome;
    }

    public Pilota getPilota() {
        return pilota;
    }

    public int getNumeroAuto() {
        return numeroAuto;
    }

    public Integer getTempoGiro() {
        return tempoGiro;
    }

    public void setTempoGiro(Integer tempoGiro) {
        this.tempoGiro = tempoGiro;
    }

    @Override
    public String toString() {
        return nome + " - Pilota: " + pilota;
    }
}
