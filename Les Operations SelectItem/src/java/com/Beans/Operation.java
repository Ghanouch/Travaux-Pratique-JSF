package com.Beans;


import java.io.Serializable;
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
public class Operation implements Serializable{
     
    private int val1 , val2 ,res;
    int operande;
    
    public Operation() {
    }

    public int getOperande() {
        System.out.println(operande);
        return operande;
    }

    public void setOperande(int operande) {
        this.operande = operande;
    }
    
   
    
    

    public int getVal1() {
        return val1;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public int getRes() {
        switch(operande)
        {
            case 1 :         res =  val1 + val2 ; break;
            case 2 :         res =  val1 - val2 ; break;
            case 3 :         res =  val1 * val2 ; break;
            case 4 :         res =  val1 / val2 ; break;
      
        }
        return res;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal1(int val1) {
               System.out.println("--------setValue1");

        this.val1 = val1;
    }

    public void setVal2(int val2) {
       System.out.println("--------setValue2");

        this.val2 = val2;
    }
    
    
    
}
