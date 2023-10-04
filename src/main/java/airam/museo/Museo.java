/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package airam.museo;

import java.time.LocalDate;

/**
 *
 * @author dam
 */
public class Museo {
    
    public static Catalogo catalogo = new Catalogo();

    public static void main(String[] args) {
        
        Artista artista1 = new Artista("Airam", "Jerez", LocalDate.MIN, LocalDate.MAX);
        Artista artista2 = new Artista("Alvaro", "Jerez", LocalDate.MIN, LocalDate.MAX);
        Artista artista3 = new Artista("Juan", "Jerez", LocalDate.MIN, LocalDate.MAX);
        
        Pinturas pintura1 = new Pinturas(2, "Lienzo", "Blanca Navidad", 1, artista1, LocalDate.MIN);
        Pinturas pintura2 = new Pinturas(3, "Lienzo", "Azur", 2, artista2, LocalDate.MIN);
        Pinturas pintura3 = new Pinturas(4, "Lienzo", "Kyros", 3, artista3, LocalDate.MIN);
        
        Esculturas escultura1 = new Esculturas("Piedra", 2.18, "Pensador", 4, artista1, LocalDate.MIN);
        Esculturas escultura2 = new Esculturas("Marmol", 3.18, "Boleador", 5, artista1, LocalDate.MIN);
        Esculturas escultura3 = new Esculturas("Caliza", 4.18, "Cansado", 6, artista1, LocalDate.MIN);
        
        catalogo.añadeObra(pintura1);
        catalogo.añadeObra(pintura2);
        catalogo.añadeObra(pintura3);
        catalogo.eliminarObra(3);
        catalogo.añadeObra(escultura1);
        catalogo.añadeObra(escultura2);
        catalogo.añadeObra(escultura3);
        catalogo.añadeObra(escultura3);
        catalogo.buscarObra(6);
        
        catalogo.masAlta();
        catalogo.superficie();
    }
    
    
    
    
}
