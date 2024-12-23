import java.util.ArrayList;
import java.util.Collections;

public class Gara {
    private String nome;
    private String nazionalita;
    private ArrayList<Scuderia> griglia;
    private String vincitore;

    public Gara(String nome, String nazionalita) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.griglia = new ArrayList<>();
    }

    public void addScuderia(Scuderia scuderia) {
        griglia.add(scuderia);
    }

    public void simulaGara() {
        if (griglia.isEmpty()) {
            System.out.println("Errore: Nessuna scuderia nella griglia di partenza.");
            return;
        }
        for (Scuderia scuderia : griglia) {
            // Simula un tempo di giro casuale tra 50 e 150
            scuderia.setTempoGiro((int) (Math.random() * 100) + 50);
        }
        // Ordina la griglia in base al tempo del giro
        Collections.sort(griglia, (s1, s2) -> s1.getTempoGiro().compareTo(s2.getTempoGiro()));
        vincitore = griglia.get(0).getPilota().toString(); // Prende il pilota della scuderia con il miglior tempo
    }

    public String getVincitore() {
        return vincitore;
    }
}
