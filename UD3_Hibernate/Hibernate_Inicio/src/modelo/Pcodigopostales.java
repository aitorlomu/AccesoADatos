package modelo;
// Generated 09-ene-2015 13:35:19 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Pcodigopostales generated by hbm2java
 */
public class Pcodigopostales  implements java.io.Serializable {


     private BigDecimal idcodPostal;
     private String codPostal;
     private Set pcodPobls = new HashSet(0);

    public Pcodigopostales() {
    }

	
    public Pcodigopostales(BigDecimal idcodPostal, String codPostal) {
        this.idcodPostal = idcodPostal;
        this.codPostal = codPostal;
    }
    public Pcodigopostales(BigDecimal idcodPostal, String codPostal, Set pcodPobls) {
       this.idcodPostal = idcodPostal;
       this.codPostal = codPostal;
       this.pcodPobls = pcodPobls;
    }
   
    public BigDecimal getIdcodPostal() {
        return this.idcodPostal;
    }
    
    public void setIdcodPostal(BigDecimal idcodPostal) {
        this.idcodPostal = idcodPostal;
    }
    public String getCodPostal() {
        return this.codPostal;
    }
    
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }
    public Set getPcodPobls() {
        return this.pcodPobls;
    }
    
    public void setPcodPobls(Set pcodPobls) {
        this.pcodPobls = pcodPobls;
    }




}


