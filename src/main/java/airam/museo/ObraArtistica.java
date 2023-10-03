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
public class ObraArtistica {
    private String titulo;
    private int nInventario;
    private Artista autor;
    private Date fechaCreacion;

    public ObraArtistica(String titulo, int nInventario, Artista autor, Date fechaCreacion) {
        this.titulo = titulo;
        this.nInventario = nInventario;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
    }
    
    
    
}
