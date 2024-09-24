package service;
/*
    Programa que detecta si una ruta específica existe y,
    de ser así, analiza si apunta a un fichero o un directorio
    haciendo uso de la librería java.nio
 */
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicioComprobaciones {

    public boolean existe(String ruta){
        Path p = Path.of(ruta);
        boolean existe = false;
        //String mensaje="";

        if (Files.exists(p)) {
            existe = true;
        }else{

        }
        return existe;
    }

}
