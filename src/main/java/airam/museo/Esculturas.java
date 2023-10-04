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
public class Esculturas extends ObraArtistica{
    private String material;
    private Double altura;

    public Esculturas(String material, Double altura, String titulo, int nInventario, Artista autor, LocalDate fechaCreacion) {
        super(titulo, nInventario, autor, fechaCreacion);
        this.material = material;
        this.altura = altura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Esculturas other = (Esculturas) obj;
        if (!Objects.equals(this.material, other.material)) {
            return false;
        }
        return Objects.equals(this.altura, other.altura);
    }

    @Override
    public String toString() {
        return "Esculturas{" + "material=" + material + ", altura=" + altura + '}';
    }
    
    
}
