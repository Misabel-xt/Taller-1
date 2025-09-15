package Ejercicio1;
import java.util.Scanner;
public class Ejecuta {
    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);

        // --- Crear Libro con constructor parametrizado ---
        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Número de páginas: ");
        int paginas = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        Libro libro1 = new Libro(titulo, autor, paginas);

        // --- Crear CuentaBancaria con constructor sobrecargado ---
        System.out.println("\nIngrese los datos de la cuenta bancaria:");
        System.out.print("Número de cuenta: ");
        int numeroCuenta = sc.nextInt();
        System.out.print("Saldo: ");
        int saldo = sc.nextInt();
        sc.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();
        cuentaBancaria cuenta1 = new cuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        // --- Crear Estudiante con constructor completo ---
        System.out.println("\nIngrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        Estudiante estudiante1 = new Estudiante(nombre, edad, curso);

        // --- Mostrar detalles ---
        System.out.println("\n===== OBJETOS CREADOS =====");
        System.out.println(libro1);
        System.out.println(cuenta1);
        System.out.println(estudiante1);

        sc.close();
    }
}

    
