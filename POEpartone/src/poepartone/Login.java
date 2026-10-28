/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepartone;

/**
 *
 * @author Student
 */
public class Login extends Registration{
   
    public boolean LoginUser(String name, String password){
            if(name.equals(userName) && password.equals(passWord)){
               return true; 
            }else{
                return false ;
            }
    } 
        public String returnloginStatus(boolean loginStatus){
            if(loginStatus){
                return "login success";
                
            }else{ 
                return "Login failed";
            }
                        
        }
    
}

