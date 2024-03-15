package perri.practice.Entities;

import java.time.LocalDate;

public abstract class Catalogo {
    protected static int ultimoCodiceIsbn = 10000;
    protected int codiceIsbn;
    protected String titolo;

    protected LocalDate annoDiPubblicazione;

    protected int numeroPagine;

    public Catalogo(String titolo, LocalDate annoDiPubblicazione, int numeroPagine) {
        this.codiceIsbn = ultimoCodiceIsbn++;
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "codiceIsbn=" + codiceIsbn +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
