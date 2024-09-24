package libs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.PatternSyntaxException;

public class Leer {
    /**
     * Método para imprimir mensaje que se repite
     */
    static public void mostrarEnPantalla(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @return dato - cadena introducida por teclado
     */
    static public String pedirCadena(final String texto) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String dato = "";
        boolean error = true;
        while (error) {
            try {
                dato = "";
                mostrarEnPantalla(texto);
                dato = dataIn.readLine();
                error = false;
            } catch (IOException e) {
                mostrarEnPantalla("Vuelve a introducir el dato, por favor. ");
                error = true;
            }
        }
        return dato;
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @param regex - expresi�n regular a aplicar. Si es null no aplica ninguna
     * @return dato - cadena introducida por teclado
     */
    static public String pedirCadena(final String texto, String regex) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String dato = "";
        boolean error = true;
        while (error) {
            try {
                dato = "";
                mostrarEnPantalla(texto);
                dato = dataIn.readLine();
                if (regex == null) {
                    error = false;
                } else {
                    error = !dato.matches(regex);
                    if (error) {
                        mostrarEnPantalla("Por favor, vuelve a introducir el dato, no es un valor posible. ");
                    }
                }
            } catch (IOException e) {
                mostrarEnPantalla("Vuelve a introducir el dato, por favor. ");
                error = true;
            } catch (PatternSyntaxException e) {
                mostrarEnPantalla("La expresi�n regular no es correcta.");
                System.exit(0);
            }
        }
        return dato;
    }
}
