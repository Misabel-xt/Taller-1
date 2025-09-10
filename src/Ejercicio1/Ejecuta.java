package Ejercicio1;

public class Ejecuta {
    public static void main(String[] args) {
        Libro L1 = new Libro();
        L1.mostrarvalores();
        System.out.println("Libro inicializado con un constructor por defecto"+ "\n");

        Libro L2 = new Libro("Corazón delator", "Edgar Allan Poe",20);
        L2.mostrarvalores();
        System.out.println("Libro inicializado con un constructor parametrizado");

    }
}
