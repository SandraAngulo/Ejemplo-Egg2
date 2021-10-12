
package coleccionpelicula;

import java.util.Comparator;

public class Pelicula {
   private String titulo;
   private String director;
   private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
public static Comparator<Pelicula> ordenPorDuracionAsc = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula e2, Pelicula e1) { // Le pasamos dos objetos a comparar
            return e1.getDuracion().compareTo(e2.getDuracion()); // Los comparamos usando el get y el compareTo
        }
}; 
public static Comparator<Pelicula> ordenPorDuracionDesc = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula e1, Pelicula e2) { // Le pasamos dos objetos a comparar
            return e1.getDuracion().compareTo(e2.getDuracion()); // Los comparamos usando el get y el compareTo
        }
}; 
public static Comparator<Pelicula> ordenPorTitulo = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula e1, Pelicula e2) { // Le pasamos dos objetos a comparar
            return e1.getTitulo().compareTo(e2.getTitulo()); // Los comparamos usando el get y el compareTo
        }
    };
    
    public static Comparator<Pelicula> ordenPorDirector = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula e1, Pelicula e2) { // Le pasamos dos objetos a comparar
            return e1.getDirector().compareTo(e2.getDirector()); // Los comparamos usando el get y el compareTo
        }
    };
} 

