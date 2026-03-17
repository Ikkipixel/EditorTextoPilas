package Editor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Editor editor = new Editor();

        int opcion;

        do {

            System.out.println("\n--- EDITOR DE TEXTO ---");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar texto actual");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese texto: ");
                    String texto = scanner.nextLine();
                    editor.escribir(texto);

                    break;

                case 2:

                    editor.undo();

                    break;

                case 3:

                    editor.redo();

                    break;

                case 4:

                    editor.mostrarTexto();

                    break;

                case 5:

                    System.out.println("Saliendo del programa...");
                    break;

                default:

                    System.out.println("Opción no válida");

            }

        } while (opcion != 5);

        scanner.close();
    }
}