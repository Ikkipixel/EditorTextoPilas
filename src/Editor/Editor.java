package Editor;

public class Editor {

    private Pila pilaAcciones;
    private Pila pilaDeshacer;

    public Editor() {

        pilaAcciones = new Pila();
        pilaDeshacer = new Pila();

    }

    public void escribir(String texto) {

        pilaAcciones.push(texto);
        pilaDeshacer = new Pila();

    }

    public void undo() {

        if (!pilaAcciones.isEmpty()) {

            String accion = pilaAcciones.pop();
            pilaDeshacer.push(accion);

            System.out.println("Se deshizo: " + accion);

        } else {

            System.out.println("No hay acciones para deshacer");

        }
    }

    public void redo() {

        if (!pilaDeshacer.isEmpty()) {

            String accion = pilaDeshacer.pop();
            pilaAcciones.push(accion);

            System.out.println("Se rehizo: " + accion);

        } else {

            System.out.println("No hay acciones para rehacer");

        }
    }

    public void mostrarTexto() {

        if (pilaAcciones.isEmpty()) {

            System.out.println("No hay texto.");
            return;

        }

        System.out.println("Texto actual:");

        for (String linea : pilaAcciones.getElementos()) {

            System.out.println(linea);

        }
    }
}