/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Helloworld {
    public static void main(String[] args) {
       Helloworld hw = new Helloworld();
       String x = hw.sayHello("Jiawei");
       System.out.print(x);
    }   
    
    public String sayHello(String name){
        String hello = "Hello "+ name;
        return hello;
    }
}
