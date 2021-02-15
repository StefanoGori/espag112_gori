/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import com.mycompany.espag112.main.*;
/**
 *
 * @author stefa
 */
public class Run implements Runnable{
    private String name;
    public Run(String name){
        this.name=name;
    }
    
    @Override
    public void run(){

            System.out.println(name);
    }
}
