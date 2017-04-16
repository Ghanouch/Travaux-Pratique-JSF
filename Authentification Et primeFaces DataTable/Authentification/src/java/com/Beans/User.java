/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Beans;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author l.IsSaM.l
 */

@ManagedBean
public class User {
    
    private String login, passwd;

    public User(String login, String passwd) {
        this.login = login;
        this.passwd = passwd;
    }

    public User() {
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswd() {
        return passwd;
    }
    
    public String getAction()
    {
        String value = "";
        if(getLogin().equals("client") && getPasswd().equals("client"))
            value = "Client";
        else if(login.equals("admin") && passwd.equals("admin"))
            value = "Admin";
        else if(login.equals("manager") && passwd.equals("manager"))
            value = "Manager";
        else
            value = "Error";
        
        return value;
        
            
    }
    
}
