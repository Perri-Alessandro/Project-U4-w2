////// HO FATTO PARTICOLARMENTE SCHIFO OGGI AL BENCHMARK, SPERO DI RISOLLEVARMI CON QUESTO PROGETTO //////////
package perri.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import perri.practice.Entities.GestioneCatalogo;

import java.util.Scanner;

public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------- ARCHIVIO BIBLIOTECA1 -----------------------------------");

        GestioneCatalogo.gestisciCatalogo(sc);

        sc.close();
    }
}
