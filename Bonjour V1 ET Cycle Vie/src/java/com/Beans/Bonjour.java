package com.Beans;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l.IsSaM.l
 */

@ManagedBean
public class Bonjour {
    
    public String message = " Hello World";

    public Bonjour() {
    }

    public String getMessage() {    
              return message;  
    }

    public void setMessage(String message)
    {
        System.out.println(" :  "+message.toUpperCase());
        this.message = message;
    }
    
    public String getArrayList()
    {
        String str = "";
        for ( int i = 0 ; i < 10 ; i++ )
            str += i+ " Hello World";
        
        return str;
    }
    
    
}
