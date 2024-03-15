package perri.practice.Entities;

import java.time.LocalDate;

public class Rivista extends Catalogo {
    public Periodicità periodicità;

    public Rivista(String titolo, LocalDate annoDiPubblicazione, int numeroPagine, Periodicità periodicità) {
        super(titolo, annoDiPubblicazione, numeroPagine);
        this.periodicità = periodicità;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "titolo='" + titolo + '\'' +
                "codiceIsbn=" + codiceIsbn +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", numeroPagine=" + numeroPagine +
                ", Periodicità=" + periodicità +
                '}';
    }
}
