/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.espag112;

/**
 *
 * @author stefa
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t1=new thread("Brontolo");
        Thread t2=new thread("Cucciolo");
        Thread t3=new thread("Dotto");
        Thread t4=new thread("Eolo");
        Thread t5=new thread("Gongolo");
        Thread t6=new thread("Mammolo");
        Thread t7=new thread("Pisolo");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
    
}
