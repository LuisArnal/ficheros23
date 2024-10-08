package service;


import java.io.IOException;
import java.nio.file.DirectoryStream;
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
    public ArrayList<String> escribir(Path ruta){
        ArrayList<String> escritura = new ArrayList<>();
        String texto=" ";
        //Lectura del archivo
        /*
        try {
            escritura= (ArrayList<String>) Files.write;
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo");
        }
        */
        return escritura;
    }

    public ArrayList<String> listarArchivos(Path ruta){
        ArrayList<String> lectura = new ArrayList<>();
        //Lectura del archivo
        try (DirectoryStream<Path> contenido = Files.newDirectoryStream(ruta)) {
            for (Path p : contenido) {
                System.out.println(p.getFileName());
            }
            //aseguramos que se capturan todas las posibles excepciones que no se han gestionado
        }catch (SecurityException e){
            System.out.println("No tiene permiso de lectura de este directorio.");
        }catch (IOException e) {
            System.out.println("No se ha podido leer el directorio.");
        }
        return lectura;
    }
}
