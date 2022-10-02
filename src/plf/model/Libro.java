/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plf.model;

import java.util.List;

/**
 *
 * @author LMC1
 */
public class Libro {
    private String titulo;
    private List<Autor> autores;
    private String edicion;
    private String isbn;

    public Libro(String titulo, List<Autor> autores, String edicion, String isbn) {
        this.titulo = titulo;
        this.autores = autores;
        this.edicion = edicion;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
    
}
