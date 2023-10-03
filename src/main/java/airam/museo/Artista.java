/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airam.museo;

import java.util.Date;

/**
 *
 * @author dam
 */
public class Artista {
    private String nombre;
    private String lugarNacimiento;
    private Date fechaNac;
    private Date fechaMuerte;

    public Artista(String nombre, String lugarNacimiento, Date fechaNac, Date fechaMuerte) {
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.fechaNac = fechaNac;
        this.fechaMuerte = fechaMuerte;
    }
    
    
}
