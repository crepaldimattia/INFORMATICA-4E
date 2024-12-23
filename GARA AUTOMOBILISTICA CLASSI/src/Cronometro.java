import java.time.LocalTime;

public class Cronometro {
    private LocalTime startTime;
    private LocalTime endTime;

    public void setStartTime() {
        this.startTime = LocalTime.now();
    }

    public void setEndTime() {
        this.endTime = LocalTime.now();
    }

    public int getTempoGiro() {
        if (startTime == null || endTime == null) {
            throw new IllegalStateException("Tempo non impostato correttamente.");
        }
        return Math.abs((int) java.time.Duration.between(startTime, endTime).toMillis());
    }

    private void calcolaTempoGiro() {
        // Metodo privato per calcoli aggiuntivi, se necessari.
    }
}
