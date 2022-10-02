/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plf.model;

//enum Genero{

import java.util.Objects;

//    HOMBRE,
//    MUJER,
//    OTRO
//}
/**
 *
 * @author LMC1
 */
public class Autor {
    private String nombre;
    private int edad;
    private Genero genero;

    public Autor(String nombre, int edad, Genero genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Autor{" +nombre + "," + edad + "," + genero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + this.edad;
        hash = 97 * hash + Objects.hashCode(this.genero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.genero != other.genero) {
            return false;
        }
        return true;
    }
    
    
    
}
