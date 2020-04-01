/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import java.util.Scanner;

/**
 *
 * @author jasnoor
 */
public class PasswordValidator
{
   public static void main(String[] args) 
   {
       Scanner in= new Scanner(System.in); 
       System.out.println("Enter String with 8 characters, 1 uppercase and 1 special character and 1 digit!");
        boolean valid=false;
       do {
       String pass= in.next();
       if(checkLength(pass) && checkUpper(pass) && checkSpecial(pass) )  {
           valid = true;
       }
       }
       while(!valid);
        System.out.println(" valid password " + valid);
      }
    public static boolean checkLength(String pass)
    {
        if(pass.length()>=8)
        {
            return true;
        }
        return false;
    }
    public static boolean checkUpper(String pass){
        for (int i =0 ; i < pass.length() ; i++){
           if(Character.isUpperCase(pass.charAt(i))){
               return true;
           }   
        }
        return false ;
    }
    
    public static boolean checkSpecial(String pass){
          for (int i =0 ; i < pass.length() ; i++){
           if(!Character.isLetterOrDigit(pass.charAt(i))){
               return true;
           }   
        }
        return false ;
        
    }
   

}
