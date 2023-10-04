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
    
    private final List<ObraArtistica> obra;
    
    public Catalogo() {
        this.obra = new ArrayList<>();
    }

    public void setObra(ObraArtistica obra) {
        this.obra.add(obra);
    }
    
    public List<ObraArtistica> getObra() {
        return obra;
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
        return Objects.equals(this.obra, other.obra);
    }

    @Override
    public String toString() {
        return "Catalogo{" + "obra=" + obra + '}';
    }
    
    

    
    

    

    

    
    
    public void superficie() {
    
    }
    
    public void masAlta() {
        
    }
}
