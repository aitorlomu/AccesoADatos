package es.discoduroderoer.listasenlazadas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class ListaEnlazadaString{
    /**
     * Clase interna Nodo
     */    
    private class Nodo{
        
        //Atributos
        protected String dato;
        protected Nodo sig;

        /**
         * Constructor por defecto
         */
        public Nodo(){
            sig=null;
            dato = new String();
        }
        
        /**
         * Le pasamos un String
         * @param p Valor del String
         */
        public Nodo(String p){
            sig=null;
            dato = p;
        }
    }

    //*********************************************************
    //*********************************************************
    
    //Atributos
    private Nodo primero;
    
    /**
     * Constructor por defecto
     */
    public ListaEnlazadaString(){
        Lista_Vacia();
    }
    
    /**
     * Vacia la lista
     */
    public void Lista_Vacia(){
        primero = null;
    }
    
    /**
     * Indica si la lista esta vacia o no
     * @return True = esta vacia
     */
    public boolean Esta_Vacia(){
        return primero == null;
    }
    
    /**
     * Inserta un objeto al principio de la lista 
     * @param p Objeto insertado
     */
    public void Insertar_Primero(String p){
        
        Nodo nuevo = new Nodo(p);
        
        if (primero==null) primero=nuevo;
        else {
            nuevo.sig = primero;
            primero = nuevo;
        }

    }
    
    /**
     * Inserta al final de la lista un objeto
     * @param p Objeto insertado 
     */
    public void Insertar_Ultimo(String p){
        
        Nodo aux = new Nodo(p);
        Nodo rec_aux;
     
        if (primero==null) {
            aux.sig = primero;
            primero = aux;
        }else {
            rec_aux = primero;
            while(rec_aux.sig != null)  rec_aux = rec_aux.sig;
               rec_aux.sig = aux;
        }
    }
    
    /**
     * Quita el primer elemento de la lista
     */
    public void Quitar_Primero(){
        
        Nodo aux;
        if (!Esta_Vacia()){
            aux=primero;
            primero = primero.sig;
            aux=null; //Lo marcamos para el recolector de basura   
        }
    }
    
    /**
     * Quita el ultimo elemento de la lista
     */
    public void Quitar_Ultimo(){
        
        Nodo aux=primero;
        if(aux.sig==null) 
           Lista_Vacia();
        if(!Esta_Vacia()) {
            aux=primero;    
            while(aux.sig.sig != null)
                aux=aux.sig;
            aux.sig=null;
        }

    }        
    
    /**
     * Devuelve el último elemento de la lista
     * @return Último elemento
     */
    public String Ultimo(){ 
        
        String elemen = null;
        Nodo aux = null;
        if (!Esta_Vacia()){
            aux = primero;
            while(aux.sig != null)  aux = aux.sig;
                elemen = (String) aux.dato;  
        }
        return elemen;
    }
      
    /**
     * Devuelve el primer elemento de la lista
     * @return Primer elemento
     */
    public String Primero(){
        
        String elemen = null;
        if (!Esta_Vacia()){
            elemen = (String) primero.dato;   
        }
        return  elemen;
    }
    
    /**
     * Devuelve el número de elementos de la lista
     * @return Número de elementos
     */
    public int Cuantos_Elementos(){
        
        Nodo aux=null;
        int i=0;
        aux = primero;
        
        while(aux != null){
            aux = aux.sig;
            i++;
        }
        return i;
  
    }
    
    /**
     * Borra un elemento de la lista
     * @param pos Posición de la lista que queremos borrar 
     */
    public void Borra_Posicion(int pos){
        
        Nodo aux, ant;
        int cont=1;
 
        aux=primero;
        ant=null;
        while(aux!=null){
            if (pos == cont){
                if (ant==null){
                    primero = primero.sig;
                    aux=null;
                }else {
                    ant.sig = aux.sig;
                    aux=null;
                }
            }else{
                ant=aux;
                aux=aux.sig;
                cont++;
            }
        }
    }
    
    /**
     * Devuelve el primer el elemento y lo borra de la lista
     * @return Primer elemento
     */
    public String devYBorrarPrimero(){
        
        String p=Primero();
        
        Quitar_Primero();
        
        return p;
    }
    
    /**
     * Indica la posición de un objeto
     * @param t Objeto buscado
     * @return Posición del objeto buscado
     */
    public int indexOf (String t){

       Nodo aux=primero;
       if (Esta_Vacia()){
            return 0;
       }else{
           int contador=0;
           boolean encontrado=false;
           while(aux!=null && !encontrado){
               if(t.equals(aux.dato)){
                   encontrado=true;
               }
               contador++;
               aux=aux.sig;
           }
           if(encontrado){
                return contador;
           }else{
                return -1;
           }
       }
    }
           
    /**
     * Indica si un objeto existe en la lista
     * @param t Objeto a comprobar
     * @return True = el objeto existe
     */
    public boolean objetoExistente(String t){
		
        boolean existe=false;

        Nodo aux=primero;
        
        while(aux!=null && !existe){

            String stringActual=aux.dato;

            if(t.equals(stringActual)){
                existe=true;
            }
            
            aux=aux.sig;
        }

        return existe;
    }
    
    /**
     * Añade un elemento de forma ordenada
     * @param t Elemento a insertar
     * @return True = operacion realizada con exito
     */
    public boolean addO(String t){
		
        Nodo traduActual = new Nodo(t);
        //caso en que este vacio
        if(Esta_Vacia()){
            Insertar_Primero(t);
            return true;
        }	

        Nodo aux=primero;

        if(Cuantos_Elementos()==1){
            if (t.compareTo(aux.dato)<-1){
                Insertar_Primero(t);
            }else{
                Insertar_Ultimo(t);
            }

            return true;
        }

        //caso en que se tenga que insertar en el primer nodo y haya mas de un elemento

        if(t.compareTo(aux.dato)<-1){

            Insertar_Primero(t);
            return true;
        }
        else{

            //caso en que se tenga que insetar entre medias de los nodos

            Nodo aux2=aux.sig;

            int numero_elementos=Cuantos_Elementos();
            boolean encontrado=false;
            for(int i=1;i<numero_elementos && !encontrado && aux2!=null;i++){

                if(t.compareTo(aux2.dato)<-1){
                    encontrado=true;
                }else{
                    aux2=aux2.sig;
                    aux=aux.sig;
                }

            }

            if(encontrado){

                aux.sig=traduActual;
                traduActual.sig=aux2;

            }else{
                //caso en que se añada al final de la lista
                Insertar_Ultimo(t);
            }
            return true;
        }
    }
}
