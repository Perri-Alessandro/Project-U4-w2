package perri.practice.Files;

import org.apache.commons.io.FileUtils;
import perri.practice.Entities.Catalogo;
import perri.practice.Entities.GestioneCatalogo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FilesMain {
    public static void main(String[] args) {
        File file = new File("src/archivioBiblioteca.txt"); //Dove troverò il mio file

        StringBuilder sb = new StringBuilder();
        sb.append("---------------------ARCHIVIO BIBLIOTECA---------------------\n");

        List<Catalogo> archivio = GestioneCatalogo.getArchivio();
        for (Catalogo catalogo : archivio) {
            sb.append(catalogo.toString()).append(System.lineSeparator());
        }

        try {
            FileUtils.writeStringToFile(file, sb.toString(), StandardCharsets.UTF_8);
            System.out.println("FILE archivioBiblioteca.txt SCRITTO");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
