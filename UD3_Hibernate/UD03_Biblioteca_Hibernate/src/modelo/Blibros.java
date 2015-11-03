package modelo;
// Generated 23-ene-2015 11:13:04 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Blibros generated by hbm2java
 */
public class Blibros  implements java.io.Serializable {


     private int idlibro;
     private Bmaterias bmaterias;
     private Beditoriales beditoriales;
     private long isbn;
     private String titulo;
     private String autores;
     private Byte nrocopiastot;
     private Byte nrocopiasdisp;
     private Short aniopublic;
     private Integer nropaginas;
     private String traductor;
     private String idioma;
     private Integer estanteria;
     private Integer balda;
     private Integer preciocompra;
     private Boolean eliminado;
     private Set bprestamoses = new HashSet(0);

    public Blibros() {
    }

	
    public Blibros(int idlibro, Beditoriales beditoriales, long isbn, String titulo) {
        this.idlibro = idlibro;
        this.beditoriales = beditoriales;
        this.isbn = isbn;
        this.titulo = titulo;
    }
    public Blibros(int idlibro, Bmaterias bmaterias, Beditoriales beditoriales, long isbn, String titulo, String autores, Byte nrocopiastot, Byte nrocopiasdisp, Short aniopublic, Integer nropaginas, String traductor, String idioma, Integer estanteria, Integer balda, Integer preciocompra, Boolean eliminado, Set bprestamoses) {
       this.idlibro = idlibro;
       this.bmaterias = bmaterias;
       this.beditoriales = beditoriales;
       this.isbn = isbn;
       this.titulo = titulo;
       this.autores = autores;
       this.nrocopiastot = nrocopiastot;
       this.nrocopiasdisp = nrocopiasdisp;
       this.aniopublic = aniopublic;
       this.nropaginas = nropaginas;
       this.traductor = traductor;
       this.idioma = idioma;
       this.estanteria = estanteria;
       this.balda = balda;
       this.preciocompra = preciocompra;
       this.eliminado = eliminado;
       this.bprestamoses = bprestamoses;
    }
   
    public int getIdlibro() {
        return this.idlibro;
    }
    
    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }
    public Bmaterias getBmaterias() {
        return this.bmaterias;
    }
    
    public void setBmaterias(Bmaterias bmaterias) {
        this.bmaterias = bmaterias;
    }
    public Beditoriales getBeditoriales() {
        return this.beditoriales;
    }
    
    public void setBeditoriales(Beditoriales beditoriales) {
        this.beditoriales = beditoriales;
    }
    public long getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutores() {
        return this.autores;
    }
    
    public void setAutores(String autores) {
        this.autores = autores;
    }
    public Byte getNrocopiastot() {
        return this.nrocopiastot;
    }
    
    public void setNrocopiastot(Byte nrocopiastot) {
        this.nrocopiastot = nrocopiastot;
    }
    public Byte getNrocopiasdisp() {
        return this.nrocopiasdisp;
    }
    
    public void setNrocopiasdisp(Byte nrocopiasdisp) {
        this.nrocopiasdisp = nrocopiasdisp;
    }
    public Short getAniopublic() {
        return this.aniopublic;
    }
    
    public void setAniopublic(Short aniopublic) {
        this.aniopublic = aniopublic;
    }
    public Integer getNropaginas() {
        return this.nropaginas;
    }
    
    public void setNropaginas(Integer nropaginas) {
        this.nropaginas = nropaginas;
    }
    public String getTraductor() {
        return this.traductor;
    }
    
    public void setTraductor(String traductor) {
        this.traductor = traductor;
    }
    public String getIdioma() {
        return this.idioma;
    }
    
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public Integer getEstanteria() {
        return this.estanteria;
    }
    
    public void setEstanteria(Integer estanteria) {
        this.estanteria = estanteria;
    }
    public Integer getBalda() {
        return this.balda;
    }
    
    public void setBalda(Integer balda) {
        this.balda = balda;
    }
    public Integer getPreciocompra() {
        return this.preciocompra;
    }
    
    public void setPreciocompra(Integer preciocompra) {
        this.preciocompra = preciocompra;
    }
    public Boolean getEliminado() {
        return this.eliminado;
    }
    
    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
    public Set getBprestamoses() {
        return this.bprestamoses;
    }
    
    public void setBprestamoses(Set bprestamoses) {
        this.bprestamoses = bprestamoses;
    }




}


