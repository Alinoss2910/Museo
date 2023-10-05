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
public class Pinturas extends ObraArtistica{
    private int dimensiones;
    private String soporte;

    public Pinturas(int dimensiones, String soporte, String titulo, int nInventario, Artista autor, LocalDate fechaCreacion) {
        super(titulo, nInventario, autor, fechaCreacion);
        this.dimensiones = dimensiones;
        this.soporte = soporte;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Pinturas other = (Pinturas) obj;
        if (!Objects.equals(this.dimensiones, other.dimensiones)) {
            return false;
        }
        return Objects.equals(this.soporte, other.soporte);
    }

    @Override
    public String toString() {
        return "Pintura \n" + "Dimensiones: " + dimensiones + " Soporte: " + soporte + super.toString();
    }
    
    
}
