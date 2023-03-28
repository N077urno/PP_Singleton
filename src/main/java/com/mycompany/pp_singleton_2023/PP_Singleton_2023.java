/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_singleton_2023;

/**
 *
 * @author nando
 */
public class PP_Singleton_2023 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        singleton1.setValue(25);
        
        System.out.println("O valor de Singleton1 eh..: "+singleton1.getValue());
        System.out.println("O valor de Singleton2 eh..: "+singleton2.getValue());
    }
}
