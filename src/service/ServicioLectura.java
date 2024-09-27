package service;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;



public class ServicioLectura {

    public ArrayList<String> leer(Path ruta){
        ArrayList<String> lectura = new ArrayList<>();
            //Lectura del archivo
        try {
            lectura= (ArrayList<String>) Files.readAllLines(ruta);
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo");
        }
        return lectura;
    }

    public ArrayList<String> listarArchivos(Path ruta){
        ArrayList<String> lectura = new ArrayList<>();
        //Lectura del archivo
        try {
            lectura= (ArrayList<String>) Files.list(ruta);
        } catch (IOException e) {
            System.out.println("No se puede leer el directorio");
        }
        return lectura;
    }
}
