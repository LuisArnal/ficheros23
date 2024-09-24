package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class ServicioLectura {

    public void leer(String ruta){
        Path p = Path.of(ruta);
        try {
            //Lectura del archivo
            BufferedReader lector = new BufferedReader(new FileReader(String.valueOf(p)));
            String linea=lector.readLine();

            //Mientras el archivo no acabe voy creando y almacenando alumnos
            while (linea != null) {
                String[] registro = linea.split(";");
                System.out.println(Arrays.toString(registro));
                linea = lector.readLine();
            }
            //Cierro el lector
            lector.close();


        }catch (FileNotFoundException e){
            /*if (Files.isDirectory(p)){
                System.out.println("Error: la ruta especificada es un directorio");
            }else {
                System.out.println("Error: la ruta no existe");
            }*/
        }catch (IOException e){
            System.out.println("La lectura ha fallado");
        }


    }

}
