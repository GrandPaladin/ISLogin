/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.LinkedList;

/**
 * Representa la interfaz de Data Access Object, la cual sirve como medio de acceso
 * y modificacion a los datos de una lista.
 * @author esmeralda
 * @param <E> tipo con el cual se trabaja.
 */
public abstract class DAOObject<E>{
    
    /**
     * Lista donde se guardan los datos de tipo E.
     */
    LinkedList<E> list;
    
    public LinkedList<E > getAll(){
        return list;
    }
    
    /**
     * Actualiza los datos de un objecto E, la comprobacion se hace mediante un id.
     * @param obj Objeto el cual modificara la instancia actual del mismo.
     * @return - True si logro actualizar el objeto, False en otro caso.
     */
    public abstract boolean update(E obj);
    
   /**
    * Agrega un objeto E a la lista de datos, no permite repetidos.
    * @param obj - Objeto nuevo.
    * @return - False si el objeto ya estaba dentro de la lista, True en otro caso.
    */
    public abstract boolean add(E obj);
    
    /**
     * Elimina unobjeto E de la lista, hace la comprobacion por un id.
     * @param obj - Objeto a borrar.
     * @return - False si el objeto no se encontraba en la lista, True en otro caso.
     */
    public abstract boolean delete(E obj);
    
    
}
