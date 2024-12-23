public class Pilota {
    private String nome;
    private String cognome;
    private String nazionalita;

    public Pilota(String nome, String cognome, String nazionalita) {
        this.nome = nome;
        this.cognome = cognome;
        this.nazionalita = nazionalita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " (" + nazionalita + ")";
    }
}
