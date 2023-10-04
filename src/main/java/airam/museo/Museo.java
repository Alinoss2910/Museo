/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package airam.museo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author dam
 */
public class Museo {
    
    public Catalogo catalogo = new Catalogo();

    public void main(String[] args) {
        
        Artista artista1 = new Artista("Airam", "Jerez", LocalDate.MIN, LocalDate.MAX);
        Artista artista2 = new Artista("Alvaro", "Jerez", LocalDate.MIN, LocalDate.MAX);
        Artista artista3 = new Artista("Juan", "Jerez", LocalDate.MIN, LocalDate.MAX);
        
        Pinturas pintura1 = new Pinturas("2x2", "Lienzo", "Blanca Navidad", 1, artista1, LocalDate.MIN);
        Pinturas pintura2 = new Pinturas("3x2", "Lienzo", "Azur", 2, artista2, LocalDate.MIN);
        Pinturas pintura3 = new Pinturas("4x2", "Lienzo", "Kyros", 3, artista3, LocalDate.MIN);
        
        Esculturas escultura1 = new Esculturas("Piedra", 2.18, "Pensador", 4, artista1, LocalDate.MIN);
        Esculturas escultura2 = new Esculturas("Marmol", 3.18, "Boleador", 5, artista1, LocalDate.MIN);
        Esculturas escultura3 = new Esculturas("Caliza", 4.18, "Cansado", 6, artista1, LocalDate.MIN);
        
        añadeObra(pintura3);
    }
    
    
    
    public void añadeObra(ObraArtistica ob) {
        
        catalogo.setObra(ob);
        System.out.println(catalogo);
        
    }
    
    public void eliminarObra(int nI) {
        List cat = catalogo.getObra();
        for(int i = 0; i <= cat.size(); i++) {
            for(int j = 0; j <= cat(i);j++) {
                
            }
        }
        
    }
    
    public void buscarObra(int nI) {
        
    }
}
