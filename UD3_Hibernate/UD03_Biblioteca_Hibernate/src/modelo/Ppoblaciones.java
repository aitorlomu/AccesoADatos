package modelo;
// Generated 23-ene-2015 11:13:04 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Ppoblaciones generated by hbm2java
 */
public class Ppoblaciones  implements java.io.Serializable {


     private int idpoblacion;
     private String poblacion;
     private Set pcodPobls = new HashSet(0);

    public Ppoblaciones() {
    }

	
    public Ppoblaciones(int idpoblacion) {
        this.idpoblacion = idpoblacion;
    }
    public Ppoblaciones(int idpoblacion, String poblacion, Set pcodPobls) {
       this.idpoblacion = idpoblacion;
       this.poblacion = poblacion;
       this.pcodPobls = pcodPobls;
    }
   
    public int getIdpoblacion() {
        return this.idpoblacion;
    }
    
    public void setIdpoblacion(int idpoblacion) {
        this.idpoblacion = idpoblacion;
    }
    public String getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public Set getPcodPobls() {
        return this.pcodPobls;
    }
    
    public void setPcodPobls(Set pcodPobls) {
        this.pcodPobls = pcodPobls;
    }
     @Override
    public String toString(){
        return poblacion;
    }




}


