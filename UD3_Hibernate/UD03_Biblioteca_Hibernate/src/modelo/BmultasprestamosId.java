package modelo;
// Generated 23-ene-2015 11:13:04 by Hibernate Tools 3.6.0



/**
 * BmultasprestamosId generated by hbm2java
 */
public class BmultasprestamosId  implements java.io.Serializable {


     private int idprestamo;
     private int idmulta;

    public BmultasprestamosId() {
    }

    public BmultasprestamosId(int idprestamo, int idmulta) {
       this.idprestamo = idprestamo;
       this.idmulta = idmulta;
    }
   
    public int getIdprestamo() {
        return this.idprestamo;
    }
    
    public void setIdprestamo(int idprestamo) {
        this.idprestamo = idprestamo;
    }
    public int getIdmulta() {
        return this.idmulta;
    }
    
    public void setIdmulta(int idmulta) {
        this.idmulta = idmulta;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BmultasprestamosId) ) return false;
		 BmultasprestamosId castOther = ( BmultasprestamosId ) other; 
         
		 return (this.getIdprestamo()==castOther.getIdprestamo())
 && (this.getIdmulta()==castOther.getIdmulta());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdprestamo();
         result = 37 * result + this.getIdmulta();
         return result;
   }   


}


