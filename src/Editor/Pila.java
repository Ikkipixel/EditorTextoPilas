package Editor;

import java.util.ArrayList;

public class Pila {


    private ArrayList<String> elementos;

    // Constructor
    public Pila() {
        elementos = new ArrayList<>();
    }

    // Agregar un elemento a la pilas
    public void push(String elemento) {
        elementos.add(elemento);
    }

    // Elimina el último elemento
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }

    // Mostrar el último elemento sin eliminarlo
    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return elementos.get(elementos.size() - 1);
    }

    // Verifica si la pila está vacía
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public ArrayList<String> getElementos() {
        return elementos;
    }
}

