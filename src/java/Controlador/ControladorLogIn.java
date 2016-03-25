/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Contrasenha;
import Modelo.Usuario;

/**
 *
 * @author esmeralda
 */
public class ControladorLogIn {
    
    public boolean LogIn(String user,String pass){
         DAOUsuario<Usuario> daoUser = new DAOUsuario(); 
         DAOContrasenha<Contrasenha> daoPass = new DAOContrasenha();
         
         for(Usuario u: daoUser.getAll() ){
             if(u.getSnombreusuario().equals(user)){
                 for(Contrasenha c: daoPass.getAll()){
                     if(c.getUsuario().equals(u)){
                         return c.getScontrasenha().equals(pass);
                     }
                 }
             }
         }
         return false;
    }
    
}
