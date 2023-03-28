/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_singleton_2023;

/**
 *
 * @author nando
 */
public class Singleton {
    private static Singleton instance;
    private int value;
    
    private Singleton(){
        this.value = 0;
    }
    
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return(instance);
        
    }
    
    public int getValue(){
        return(this.value);
    }
    
    public void setValue(int value){
        this.value = value;
    }
}
