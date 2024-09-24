package menu;

import service.ServicioComprobaciones;
import service.ServicioLectura;

import java.nio.file.Path;
import java.util.Scanner;

public class MenuComprobaciones {
    private boolean salir = false;
    private Scanner sc = new Scanner(System.in);
    private ServicioComprobaciones servicioComprobaciones = new ServicioComprobaciones();
    private ServicioLectura servicioLectura = new ServicioLectura();

public  void mostrarMenuComprobaciones(){
    String opcion;
    do {
        System.out.println("--------------------------");
        System.out.println("0. Salir");
        System.out.println("1. Fichero existe");
        System.out.println("2. Leer Fichero");
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
            comprobarExistencia();
        }
        case "2" -> {

        }

        default -> {
            System.out.println("Opción incorrecta");
        }
    }
}
    private String pideOpcion() {
        return this.sc.nextLine();
    }
private void comprobarExistencia(){
    System.out.println("Introduce la ruta a comprobar");
    /*
    Path p1 = Path.of("src/resources/fileEj1.txt");
    Path p2 = Path.of("src/resources/fileEj2.txt");
    Path p3 = Path.of("src/resources/ej1");
    Path p4 = Path.of("src/resources/ej2");
    */
    String ruta = this.sc.nextLine();
    if(servicioComprobaciones.existe(ruta)){
        System.out.println("El recurso existe");
        servicioLectura.leer(ruta);
    }else {
        System.out.println("El recurso no existe");
    }

}
}
