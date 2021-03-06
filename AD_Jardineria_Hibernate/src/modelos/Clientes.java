package modelos;
// Generated 24-feb-2014 18:09:26 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private BigDecimal codigocliente;
     private Empleados empleados;
     private String nombrecliente;
     private String nombrecontacto;
     private String apellidocontacto;
     private String telefono;
     private String fax;
     private String lineadireccion1;
     private String lineadireccion2;
     private String ciudad;
     private String region;
     private String pais;
     private String codigopostal;
     private BigDecimal limitecredito;
     private Set pagoses = new HashSet(0);
     private Set pedidoses = new HashSet(0);

    public Clientes() {
    }

	
    public Clientes(BigDecimal codigocliente, String nombrecliente, String telefono, String fax, String lineadireccion1, String ciudad) {
        this.codigocliente = codigocliente;
        this.nombrecliente = nombrecliente;
        this.telefono = telefono;
        this.fax = fax;
        this.lineadireccion1 = lineadireccion1;
        this.ciudad = ciudad;
    }
    public Clientes(BigDecimal codigocliente, Empleados empleados, String nombrecliente, String nombrecontacto, String apellidocontacto, String telefono, String fax, String lineadireccion1, String lineadireccion2, String ciudad, String region, String pais, String codigopostal, BigDecimal limitecredito, Set pagoses, Set pedidoses) {
       this.codigocliente = codigocliente;
       this.empleados = empleados;
       this.nombrecliente = nombrecliente;
       this.nombrecontacto = nombrecontacto;
       this.apellidocontacto = apellidocontacto;
       this.telefono = telefono;
       this.fax = fax;
       this.lineadireccion1 = lineadireccion1;
       this.lineadireccion2 = lineadireccion2;
       this.ciudad = ciudad;
       this.region = region;
       this.pais = pais;
       this.codigopostal = codigopostal;
       this.limitecredito = limitecredito;
       this.pagoses = pagoses;
       this.pedidoses = pedidoses;
    }
   
    public BigDecimal getCodigocliente() {
        return this.codigocliente;
    }
    
    public void setCodigocliente(BigDecimal codigocliente) {
        this.codigocliente = codigocliente;
    }
    public Empleados getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }
    public String getNombrecliente() {
        return this.nombrecliente;
    }
    
    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }
    public String getNombrecontacto() {
        return this.nombrecontacto;
    }
    
    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }
    public String getApellidocontacto() {
        return this.apellidocontacto;
    }
    
    public void setApellidocontacto(String apellidocontacto) {
        this.apellidocontacto = apellidocontacto;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getLineadireccion1() {
        return this.lineadireccion1;
    }
    
    public void setLineadireccion1(String lineadireccion1) {
        this.lineadireccion1 = lineadireccion1;
    }
    public String getLineadireccion2() {
        return this.lineadireccion2;
    }
    
    public void setLineadireccion2(String lineadireccion2) {
        this.lineadireccion2 = lineadireccion2;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getCodigopostal() {
        return this.codigopostal;
    }
    
    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }
    public BigDecimal getLimitecredito() {
        return this.limitecredito;
    }
    
    public void setLimitecredito(BigDecimal limitecredito) {
        this.limitecredito = limitecredito;
    }
    public Set getPagoses() {
        return this.pagoses;
    }
    
    public void setPagoses(Set pagoses) {
        this.pagoses = pagoses;
    }
    public Set getPedidoses() {
        return this.pedidoses;
    }
    
    public void setPedidoses(Set pedidoses) {
        this.pedidoses = pedidoses;
    }




}


