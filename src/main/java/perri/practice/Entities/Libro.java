package perri.practice.Entities;

import java.time.LocalDate;

public class Libro extends Catalogo {
    public String autore;

    public String genere;

    public Libro(String titolo, LocalDate annoDiPubblicazione, int numeroPagine) {
        super(titolo, annoDiPubblicazione, numeroPagine);
    }

    public Libro(String titolo, LocalDate annoDiPubblicazione, int numeroPagine, String autore, String genere) {
        super(titolo, annoDiPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }
    
    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", numeroPagine=" + numeroPagine +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
