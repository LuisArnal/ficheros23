package service;
/*
    Programa que detecta si una ruta específica existe y,
    de ser así, analiza si apunta a un fichero o un directorio
    haciendo uso de la librería java.nio
 */
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicioComprobaciones {

    public boolean existeFichero(Path ruta){
        boolean existe = false;

        if (Files.exists(ruta)) {
            existe = true;
        }
        return existe;
    }


    public boolean existeDirectorio(Path ruta){
        boolean existe = false;

        if (Files.isDirectory(ruta)) {
            existe = true;
        }
        return existe;
    }

}
