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
public class Artista {
    private String nombre;
    private String lugarNacimiento;
    private LocalDate fechaNac;
    private LocalDate fechaMuerte;

    public Artista(String nombre, String lugarNacimiento, LocalDate fechaNac, LocalDate fechaMuerte) {
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.fechaNac = fechaNac;
        this.fechaMuerte = fechaMuerte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public LocalDate getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(LocalDate fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
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
        final Artista other = (Artista) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.lugarNacimiento, other.lugarNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.fechaNac, other.fechaNac)) {
            return false;
        }
        return Objects.equals(this.fechaMuerte, other.fechaMuerte);
    }

    @Override
    public String toString() {
        return nombre + " Nacido en: " + lugarNacimiento;
    }
    
    
}
