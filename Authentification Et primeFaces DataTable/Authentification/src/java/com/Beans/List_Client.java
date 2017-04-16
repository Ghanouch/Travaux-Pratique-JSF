/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Beans;

import java.util.LinkedList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author l.IsSaM.l
 */
@ManagedBean
public class List_Client {
    
    private int id ;
    private String nom , prenom ;
    private LinkedList<List_Client> li =  new LinkedList<List_Client>();
    public List_Client() {
        
        li.add(new List_Client(1,"Ghanouch","Issam"));
        li.add(new List_Client(2,"Zguindou","Abdel"));
        li.add(new List_Client(3,"Fadel","Soufian"));
        li.add(new List_Client(4,"Benchr","Reda"));
         
    }
    
    public String addClient()
    {
        li.add(new List_Client(id,nom,prenom));
        return "Manager";      
    }

    public LinkedList<List_Client> getLi() {
        return li;
    }

    public void setLi(LinkedList<List_Client> li) {
        this.li = li;
    }
    
    
    
    public LinkedList<List_Client> getList_Client()
    {        
        
    
        return li;
        
    }

    public List_Client(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    
    
}
