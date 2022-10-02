/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plf.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

/**
 *
 * @author LMC1
 */
public class Libreria {

    private List<Libro> libros;
    private String nombre;

    public Libreria(String nombre) {
        libros = new ArrayList<>();
        this.nombre = nombre;
    }

    public boolean agregarLibro(Libro l){
        libros.add(l);
        return true;

    }

  //obtiene todos los libros que existen
    public List<String> getTitulosDisponibles() {
//       List<String> nombreDeLibros = libros.stream()
           return libros.stream()
//                .map(libro -> libro.getTitulo())
               .map(Libro::getTitulo)
               .distinct()
               .collect(Collectors.toList());
    }  
    //obtiene todos los autores de todos los libros por genero
    public List<Autor> getAutoresMujeres() {
      return libros.stream()
                .map(libro -> libro.getAutores())
                .flatMap(autores -> autores.stream())
                .filter(autor -> autor.getGenero() == Genero.MUJER)
                .distinct()
                .collect(Collectors.toList());
    }
    //obtiene todos los autores de todos los libros por genero
    public List<Autor> getAutoresHombres() {
      return libros.stream()
                .map(libro -> libro.getAutores())
                .flatMap(autores -> autores.stream())
                .filter(autor -> autor.getGenero() == Genero.HOMBRE)
                .distinct()
                .collect(Collectors.toList());
    }
    
    public List<Autor> getAutores(Genero genero) {
      return libros.stream()
                .map(libro -> libro.getAutores())
                .flatMap(autores -> autores.stream())
                .filter(autor -> autor.getGenero() == genero)
                .distinct()
                .collect(Collectors.toList());
    }
    
//    public List<Autor> getAutoresEn50S() {
//      return libros.stream()
//                .map(libro -> libro.getAutores())
//                .flatMap(autores -> autores.stream())
//                .filter(autor -> autor.getEdad() == 50)
//                .distinct()
//                .collect(Collectors.toList());
//    }
    
    //Obtiene la suma de edades de todos los autores de libros
    public int obtenerSumaDeEdadesAutores(){
        return libros.stream()
                .map(libro ->libro.getAutores()) 
//                .flatMap(autores -> autores.stream())
                .peek(autor -> System.out.println("salida del flatmap:" + autor))
                .flatMap(List<Autor>::stream)
                  .peek(autor -> System.out.println("salida del flatmap:" + autor))
                .distinct()
//                .map(autor -> autor.getEdad())
                 .map(Autor::getEdad)
                .reduce(0,(base, edad) -> base + edad);
        
//        return libros.stream()
//                .map(libro ->libro.getAutores()) 
//                .flatMap(List<Autor>::stream)
//                .distinct()
//                .mapToInt(Autor::getEdad)
//                .sum();
        
    }
    // grouping by
    public Map<Genero, List<Autor>> ordenarGenero(){
        return libros.parallelStream()
                .map(Libro::getAutores)
                .flatMap(List<Autor>::parallelStream)
                .collect(Collectors.groupingBy(Autor::getGenero));
                
    }
}

