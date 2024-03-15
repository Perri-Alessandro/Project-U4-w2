package perri.practice.Entities;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GestioneCatalogo {
    private static List<Catalogo> archivio = new ArrayList<>();
    private static Periodicità[] tuttePeriodicità = Periodicità.values();
    private static Random random = new Random();
    private static Faker faker = new Faker();

    public static List<Catalogo> creaArchivioIniziale() {

        for (int i = 1; i <= 5; i++) {
            String titolo = faker.backToTheFuture().quote();
            String autore = faker.pokemon().name();
            archivio.add(new Libro(titolo, LocalDate.of(2018 + i, 4 + i, 20 + i), 100 + i * 10, autore, "Genere " + i));
        }
        for (int i = 1; i <= 5; i++) {
            Periodicità periodCasuale = tuttePeriodicità[random.nextInt(tuttePeriodicità.length)];
            String titolo = faker.yoda().quote();
            archivio.add(new Rivista(titolo, LocalDate.of(2018 + i, 7 + i, 15 + i), 50 + i * 5, periodCasuale));
        }
        return archivio;
    }

    public static List<Catalogo> gestisciCatalogo(Scanner sc) {
        List<Catalogo> catalogo = creaArchivioIniziale();

        int scelta;

        do {
            System.out.println("SCEGLI UN OPZIONE: ");
            System.out.println("1 PER AGGIUNGER 1 ELEMENTO AL CATALOGO");
            System.out.println("2 PER RIMUOVERE 1 ELEMENTO DAL CATALOGO");
            System.out.println("3 VISUALIZZARE IL CATALOGO");
            System.out.println("0 PER CHIUDERE IL PROGRAMMA");


            scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {
                case 0:
                    System.out.println("GRAZIE ED ARRIVEDERCI!");
                    break;
                case 1:
                    System.out.println("1 PER AGGIUNGER 1 LIBRO");
                    System.out.println("2 PER AGGIUNGERE UNA RIVISTA");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.println("AGGIUNGI LIBRO - INSERISCI TITOLO, DATA DI PUBBLICAZIONE (yyyy-mm-dd), NUMERO PAGINE, AUTORE E GENERE: ");

                        String titolo = sc.nextLine();
                        String dataStringa = sc.nextLine();
                        LocalDate dataPubblicazione = LocalDate.parse(dataStringa);
                        int pagine = sc.nextInt();
                        sc.nextLine();
                        String autore = sc.nextLine();
                        String genere = sc.nextLine();

                        Libro nuovoLibro = new Libro(titolo, dataPubblicazione, pagine, autore, genere);
                        catalogo.add(nuovoLibro);
                    } else if (tipo == 2) {
                        System.out.println("AGGIUNGI RIVISTA - INSERISCI TITOLO, DATA DI PUBBLICAZIONE (yyyy-mm-dd), NUMERO PAGINE E PERIODICITà (0 settimanale, 1 mensile, 2 semestrale): ");

                        String titolo = sc.nextLine();
                        String dataStringa = sc.nextLine();
                        LocalDate dataPubblicazione = LocalDate.parse(dataStringa);
                        int pagine = sc.nextInt();
                        int periodicita = sc.nextInt();
                        Rivista nuovaRivista = new Rivista(titolo, dataPubblicazione, pagine, Periodicità.values()[periodicita]);
                        catalogo.add(nuovaRivista);
                    }

                    break;
                case 2:
                    rimuoviElemento(sc, catalogo);
                    break;
                case 3:
                    visualizzaCatalogo(catalogo);
                    break;
                default:
                    System.out.println("SCELTA NON VALIDA");
            }
        } while (scelta != 0);
        return catalogo;
    }

    private static void visualizzaCatalogo(List<Catalogo> catalogo) {
        catalogo.forEach(System.out::println);
    }


    private static void rimuoviElemento(Scanner sc, List<Catalogo> catalogo) {

    }
}
