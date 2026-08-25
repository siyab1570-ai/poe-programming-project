/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepartone;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class POEpartone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Login register = new Login ();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n===== Register =====");
        
        System.out.println("please enter username ");
        String name = scan.nextLine();
       
        
        
    System.out.println("Enter password");
    String password = scan.nextLine();
    
     System.out.println("Enter cellphone");
    String cellphone = scan.nextLine();
    
    System.out.println(register.registerUser(name, password, cellphone));
    
    if(!register.registerStatus(name, password, cellphone)){
        return;
    }
    
    System.out.println("\n===== Log In=====");
    System.out.println("please enter the username");
    String userName = scan.nextLine();
    
    System.out.println("Enter password");
    String passWord = scan.nextLine();
    System.out.println(register.LoginUser(userName, passWord));
   }
    
}
