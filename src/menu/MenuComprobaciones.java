package menu;

import service.ServicioComprobaciones;


import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Scanner;

public class MenuComprobaciones {
    private boolean salir = false;
    private static Scanner sc = new Scanner(System.in);
    private ServicioComprobaciones servicioComprobaciones = new ServicioComprobaciones();

    public void mostrarMenuComprobaciones() {
        String opcion;
        do {
            System.out.println("--------------------------");
            System.out.println("0. Salir");
            System.out.println("1. Comprobar si el fichero existe");
            System.out.println("2. Comprobar si el directorio existe");
            System.out.println("--------------------------");

            System.out.println("Introduce una opción");
            opcion = this.pideOpcion();
            this.procesarOpcion(opcion);

        } while (!salir);
    }

    private void procesarOpcion(String opcion) {
        switch (opcion) {
            case "0" -> {
                salir = true;
            }
            case "1" -> {
                comprobarFichero();
            }
            case "2" -> {
                comprobarDirectorio();
            }
            default -> {
                System.out.println("Opción incorrecta");
            }
        }
    }


    private String pideOpcion() {
        return this.sc.nextLine();
    }

    public static Path pideRuta() {
        Path ruta = Path.of("");
        System.out.println("Introduce la ruta a comprobar");
        String text = sc.nextLine();
        boolean rutaOk = false;

        while (!rutaOk){
        try {
            ruta = Path.of(text);
            rutaOk=true;
        }catch (InvalidPathException e){
            System.out.println("Ruta no valida introduce una ruta valida");
            text= sc.nextLine();
        }
        }
        return ruta;
    }

    private void comprobarFichero() {

        if (servicioComprobaciones.existeFichero(pideRuta())){
            System.out.println("Fichero existe");
        }else {
            System.out.println("Fichero no existe");
        }

    }

    private void comprobarDirectorio() {

        if (servicioComprobaciones.existeDirectorio(pideRuta())){
            System.out.println("Directorio existe");
        }else {
            System.out.println("Directorio no existe");
        }

    }

    /*
    TEST
    Path p1 = Path.of("src/resources/fileEj1.txt");
    Path p2 = Path.of("src/resources/fileEj2.txt");
    Path p3 = Path.of("src/resources/ej1");
    Path p4 = Path.of("src/resources/ej2");
    */

}
