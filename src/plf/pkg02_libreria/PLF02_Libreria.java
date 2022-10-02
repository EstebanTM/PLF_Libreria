/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plf.pkg02_libreria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import plf.model.Autor;
import plf.model.Libreria;
import plf.model.Libro;
import plf.model.Genero;

/**
 *
 * @author LMC1
 */
public class PLF02_Libreria {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Libreria libreria = new Libreria("Ocho Libros");
      
      ArrayList<Autor> autores = new ArrayList<>();
      autores.add(new Autor("Craig Larman", 70, Genero.HOMBRE));
      Libro libro = new Libro("UML Y Patrones",autores,"7ma","12345678");
      libreria.agregarLibro(libro);
      
      autores = new ArrayList<>();
      autores.add(new Autor("Jane Auten", 70, Genero.MUJER));
      libro = new Libro("Orgullo y Prejuicio",autores,"1ma","12345678");
      libreria.agregarLibro(libro);
      
       autores = new ArrayList<>();
      autores.add(new Autor("Neil Gaiman", 61, Genero.HOMBRE));
      libro = new Libro("Coraline",autores,"1ma","12345678");
      libreria.agregarLibro(libro);
      
       autores = new ArrayList<>();
      autores.add(new Autor("Jane Auten", 70, Genero.MUJER));
      libro = new Libro("Orgullo y Prejuicio",autores,"2ma","12345678");
      libreria.agregarLibro(libro);
      
       autores = new ArrayList<>();
      autores.add(new Autor("Stephen King", 74, Genero.HOMBRE));
      libro = new Libro("IT",autores,"1ma","12345678");
      libreria.agregarLibro(libro);
      
      
      //Obtener los nombres de los autores
      
       

      List <String> nombresDeLibros = libreria.getTitulosDisponibles();
      System.out.println("Titulo disponibles:"+nombresDeLibros);
      
            List <Autor> nombresDeAutores = libreria.getAutoresMujeres();
      System.out.println("Autores mujeres:"+nombresDeAutores);
      
       nombresDeAutores = libreria.getAutoresHombres();
      System.out.println("Autores hombres:"+nombresDeAutores);
      
         nombresDeAutores = libreria.getAutores(Genero.OTRO);
      System.out.println("Autores:"+nombresDeAutores);
      
//      List <Autor> edadAutores = libreria.getEdad();
//      System.out.println("Autores:"+ edadAutores);
      
        System.out.println("Autores agrupados por genero");
        System.out.println(libreria.ordenarGenero());
      
        int suma = IntStream.range(0, 100)
                .sum();
        System.out.println(suma);
        IntStream.iterate(0, valor->valor +1)
                .limit(100)
                .forEach(valor -> System.out.println(valor));
        
        System.out.println(IntStream.range(0, 100).summaryStatistics());
        
    }
    
}
