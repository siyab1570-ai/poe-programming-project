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
    
           messages msg = new messages();
      
           
       
    //   msg.numMessageSent =8;
  int option;
  do{
      System.out.println("\n===== Select any of the option below======");
      System.out.print("1. send message");
      System.out.print("2. coming soon");
      System.out.print("3. Exit");
      
      option = scan.nextInt();
      
      switch(option){
          case 1 ->msg.sendingMessage();
           case 2 -> System.out.println("coming soon");
           case 3 -> System.out.println("Good bye!!");
           default -> System.out.println("invalid option");
      }
      
  }while(option !=3);
   }
    
}
