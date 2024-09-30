package menu;

import service.ServicioComprobaciones;
import service.ServicioLectura;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuAccesoFicheros {
    private boolean salir = false;
    private Scanner sc = new Scanner(System.in);
    private ServicioComprobaciones servicioComprobaciones = new ServicioComprobaciones();
    private ServicioLectura servicioLectura = new ServicioLectura();

    public  void mostrarMenuAccesoFicheros(){
        String opcion;
        do {
            System.out.println("--------------------------");
            System.out.println("0. Salir");
            System.out.println("1. Leer Fichero");
            System.out.println("2. Escribir Fichero");
            System.out.println("3. Sobreescribir Fichero");
            System.out.println("4. Listar Directorio");
            System.out.println("--------------------------");

            System.out.println("Introduce una opción");
            opcion = this.pideOpcion();
            this.procesarOpcion(opcion);

        }while (!salir);
    }
    private void procesarOpcion(String opcion) {
        switch (opcion) {
            case "0" -> {
                salir = true;
            }
            case "1" -> {
                leerFichero();
            }
            case "2" -> {
                escribirFichero();
            }
            case "3" -> {
                sobreescribirFichero();
            }
            case "4" -> {
                listarDirectorio();
            }

            default -> {
                System.out.println("Opción incorrecta");
            }
        }
    }

    private String pideOpcion() {
        return this.sc.nextLine();
    }

    private void leerFichero() {
        Path ruta = MenuComprobaciones.pideRuta();
        ArrayList<String> lectura = new ArrayList<>();
        if (servicioComprobaciones.existeFichero(ruta)){
            lectura=servicioLectura.leer(ruta);
            for (int i = 0; i < lectura.size(); i++) {
                System.out.println(lectura.get(i));
            }
        }
    }
    private void escribirFichero() {
        Path ruta = MenuComprobaciones.pideRuta();
        System.out.println("-Escriba a continuacion-");
    }
    private void sobreescribirFichero() {

    }
    private void listarDirectorio() {
        Path ruta = MenuComprobaciones.pideRuta();
        ArrayList<String> lectura;

        if (servicioComprobaciones.existeDirectorio(ruta)){
            lectura=servicioLectura.listarArchivos(ruta);
            for (int i = 0; i < lectura.size(); i++) {
                System.out.println(lectura.get(i));
            }
        }
    }
}
