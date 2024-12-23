import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Scuderia> scuderie = new ArrayList<>();
        boolean fine = false;

        String[] opzioni = {
                "GESTORE GARA AUTOMOBILISTICA",
                "INSERIMENTO SCUDERIE",
                "VISUALIZZAZIONE SCUDERIE",
                "CORRI GARA",
                "ESCI"
        };

        do {
            switch (Tools.menu(opzioni, scanner)) {
                case 1: // Aggiungi Scuderia
                    scanner.nextLine(); // Consuma il carattere di nuova riga residuo
                    System.out.print("Inserisci nome scuderia: ");
                    String nomeScuderia = scanner.nextLine();

                    System.out.print("Inserisci nome pilota: ");
                    String nomePilota = scanner.nextLine();

                    System.out.print("Inserisci cognome pilota: ");
                    String cognomePilota = scanner.nextLine();

                    System.out.print("Inserisci nazionalità pilota: ");
                    String nazionalitaPilota = scanner.nextLine();

                    // Crea e aggiungi scuderia
                    Pilota pilota = new Pilota(nomePilota, cognomePilota, nazionalitaPilota);
                    Scuderia scuderiaAggiunta = new Scuderia(nomeScuderia, pilota, 1);
                    scuderie.add(scuderiaAggiunta);

                    System.out.println("Scuderia e pilota aggiunti con successo.");
                    break;

                case 2: // Visualizza Scuderie
                    if (scuderie.isEmpty()) {
                        System.out.println("Nessuna scuderia disponibile.");
                    } else {
                        System.out.println("Elenco delle scuderie:");
                        for (Scuderia scuderia : scuderie) {
                            String tempoGiro = "Non disponibile";
                            if (scuderia.getTempoGiro() != -1) {
                                tempoGiro = scuderia.getTempoGiro().toString();
                            }
                            System.out.println(scuderia + " - Tempo Giro: " + tempoGiro);
                        }
                    }
                    break;

                case 3: // Corri Gara
                    if (scuderie.isEmpty()) {
                        System.out.println("Errore: Nessuna scuderia disponibile per la gara.");
                        break;
                    }

                    Gara gara = new Gara("Gran Premio", "Italia");
                    for (Scuderia scuderia : scuderie) {
                        gara.addScuderia(scuderia);
                    }

                    gara.simulaGara();
                    System.out.println("La gara è stata vinta da: " + gara.getVincitore());
                    break;

                case 4: // Esci
                    fine = true;
                    System.out.println("Chiusura in corso...");
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        } while (!fine);

        scanner.close();
    }
}
