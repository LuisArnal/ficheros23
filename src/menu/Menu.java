package menu;

import java.util.Scanner;

public class Menu {
    private boolean salir = false;
    private Scanner sc = new Scanner(System.in);

public void mostrarMenu(){
        String opcion;
    do {
        System.out.println("--------------------------");
        System.out.println("0. Salir");
        System.out.println("1. Comprobar Fichero");
        System.out.println("2. Ejercicio1 ficheros NIO");
        System.out.println("3. Ejercicio2 ficheros");
        System.out.println("4. Ejercicio2 ficheros NIO");
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
            MenuComprobaciones menuTest = new MenuComprobaciones();
            menuTest.mostrarMenuComprobaciones();
        }
        case "2" -> {

        }
        case "3" -> {

        }
        case "4" -> {

        }
        default -> {
            System.out.println("Opción incorrecta");
        }
    }
}
    private String pideOpcion() {
        return this.sc.nextLine();
    }
}
