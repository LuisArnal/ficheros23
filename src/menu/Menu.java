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
        System.out.println("1. Comprobaciones");
        System.out.println("2. Acceso a Ficheros");
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
            MenuAccesoFicheros menuAccesoFicheros = new MenuAccesoFicheros();
            menuAccesoFicheros.mostrarMenuAccesoFicheros();
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
