/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author esmeralda
 */
public class beanLogIn {

    private String active;
    
    private String user;
    private String pass;

    /**
     * Creates a new instance of beanLogIn
     */
    public beanLogIn() {
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String LogIn(){
        ControladorLogIn controladorLogIn = new ControladorLogIn();
        if(controladorLogIn.LogIn(user, pass)){
            active = user;
            return "y";
        }
        return "n";
    }
    
    public String exit(){
        return "exit";
    }
    
    public String next(){
        return "next";
    }

    public String getActive() {
        return active;
    }
    
}
