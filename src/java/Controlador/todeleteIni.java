/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Contrasenha;
import Modelo.Usuario;
import java.util.LinkedList;

/**
 * con esta clase inicio los usuarios y su contraseña.
 * @author esmeralda
 */
public class todeleteIni {
    
    public static LinkedList<Usuario> users(){
        LinkedList<Usuario> users = new LinkedList<>();
        int id = 0;
        Usuario u1,u2;
        u1 = new Usuario(id++, "cthulu4president@gmail.com", "kthulu", null);
        u2 = new Usuario(id++, "Zephir22@gmail.com", "zephiroth", null);
        users.add(u1);
        users.add(u2);
        return users;
    }
    
    public static LinkedList<Contrasenha> pass(){
        LinkedList<Usuario> users = users();
        LinkedList<Contrasenha> pass = new LinkedList<>();
        Contrasenha c;
        int id = 0;
        String s;
        for(Usuario u: users){
            s = u.getSnombreusuario() + "pass";
            c = new Contrasenha(id++, u, s);
        }
        return pass;
    }
    
}
