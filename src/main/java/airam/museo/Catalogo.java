/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airam.museo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author dam
 */
public class Catalogo {
    
    private List<ObraArtistica> catalogo;
    
    public Catalogo() {
        this.catalogo = new ArrayList<>();
    }

    public void setObra(ObraArtistica obra) {
        this.catalogo.add(obra);
    }
    
    public List<ObraArtistica> getCatalogo() {
        return catalogo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Catalogo other = (Catalogo) obj;
        return Objects.equals(this.catalogo, other.catalogo);
    }

    @Override
    public String toString() {
        return "Catalogo{" + "obra=" + catalogo + '}';
    }
    
    public void añadeObra(ObraArtistica ob) {
        for(ObraArtistica obra : catalogo) {
            if(ob == obra) {
                System.out.println("El registro ya esta en el catalogo.");
                break;
            }
        }
        this.setObra(ob);
        System.out.println(catalogo);
        
    }
    
    public void eliminarObra(int nI) {
        catalogo.removeIf(obra -> obra.getnInventario() == nI);
        System.out.println(catalogo);
    }
    
    public void buscarObra(int nI) {
        for(ObraArtistica obra : catalogo){
            if (obra.getnInventario() == nI) {
                System.out.println("Obra encontrada:");
                System.out.println("Título: " + obra.getTitulo());
                System.out.println("Número de inventario: " + obra.getnInventario());
                System.out.println("Autor: " + obra.getAutor().getNombre());
                System.out.println("Fecha de creación: " + obra.getFechaCreacion());
            }
        }
    }
    
    public void superficie() {
        int superficieTotal = 0;
        for(ObraArtistica obra : catalogo) {
            if(obra instanceof Pinturas pinturas) {
                superficieTotal += pinturas.getDimensiones();
            }
        }
        System.out.println("El total de la superficie es: " + superficieTotal);
    }
    
    public void masAlta() {
        ObraArtistica mA = null;
        for(ObraArtistica obra : catalogo) {
            if(obra instanceof Esculturas escultura) {
                int alturaMax = 0;
                if(escultura.getAltura() > alturaMax) {
                    mA = escultura;
                }
            }
        }
        System.out.println(mA.toString());
    }
}
