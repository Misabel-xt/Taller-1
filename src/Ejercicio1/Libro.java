package Ejercicio1;
//Crea una clase Libro con las siguientes propiedades: titulo, autor, numeroPaginas. Define:
//1. Un constructor por defecto que asigne valores predeterminados.
//2. Un constructor parametrizado que permita asignar valores específicos.
//3. Métodos para mostrar los detalles del libro.

import javax.swing.*;

public class Libro {
    private String titulo;
    private String autor;
    private int numerodepaginas;

    public Libro(){
        titulo = "Desconocido";
        autor = "Desconocido";
        numerodepaginas = 0;
    }

    public Libro(String titulo, String autor, int numerodepaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numerodepaginas = numerodepaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumerodepaginas() {
        return numerodepaginas;
    }

    public void setNumerodepaginas(int numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }

    @Override
    public String toString() {
        return "La inform" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numerodepaginas=" + numerodepaginas +
                '}';
    }
}
