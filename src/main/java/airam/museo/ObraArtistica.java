/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airam.museo;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author dam
 */
public class ObraArtistica {
    private String titulo;
    private int nInventario;
    private Artista autor;
    private LocalDate fechaCreacion;

    public ObraArtistica(String titulo, int nInventario, Artista autor, LocalDate fechaCreacion) {
        this.titulo = titulo;
        this.nInventario = nInventario;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnInventario() {
        return nInventario;
    }

    public void setnInventario(int nInventario) {
        this.nInventario = nInventario;
    }

    public Artista getAutor() {
        return autor;
    }

    public void setAutor(Artista autor) {
        this.autor = autor;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        hash = 89 * hash + this.nInventario;
        hash = 89 * hash + Objects.hashCode(this.autor);
        hash = 89 * hash + Objects.hashCode(this.fechaCreacion);
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
        final ObraArtistica other = (ObraArtistica) obj;
        if (this.nInventario != other.nInventario) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return Objects.equals(this.fechaCreacion, other.fechaCreacion);
    }

    @Override
    public String toString() {
        return " Titulo: " + titulo + "\n" +
                "Número de Inventario: " + nInventario + "\n" +
                "Artista: " + autor + "\n" + 
                "Fecha de Creación: " + fechaCreacion;
    }
    
    
    
}
