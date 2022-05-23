/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author melda_000
 */
public class Validation {
    public static boolean isEmailValid(String s) //To check email validity
        {
             int atIndex=-1;
             int dotIndex=-1;
             int spcIndex=-1;
             int i;
             int atFlag=0;
            int a=s.length();
            if(a<7) 
             return false; 
            //the email is at least 7 characters

            for(i=0; i<a; i++)
            {
                if(s.charAt(i)=='@')
                {
                    atIndex=i;
                    atFlag++;
                }
                if(s.charAt(i)=='.')
                {
                    dotIndex=i;
                }
                if(s.charAt(i)==' ')
                {
                    spcIndex=i;
                }

            }
            //it will return zero if there is no @ or begins with @ or no dots or there is space or more than @ or two consecutive dots or last char is dot
            if(atIndex==-1||atIndex==0||dotIndex==-1||spcIndex!=-1||atFlag!=1||s.contains("..") || s.charAt(a-1)=='.')
                return false;
            int d=dotIndex-atIndex; //The difference between @ and dot index should be more than 1
            if(d>1)
                return true;
            else
                return false;
         }
     public static boolean isDigit(String s)
    {
       int c=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) 
            {
                c++;
            }
        }
         if(c==s.length())
             return true;
         else
             return false;
    }
     public static boolean isOneDigit(String s)
    {
       boolean c=false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) 
            {
               c = true;
            }
        }
         if(c)
             return true;
         else
             return false;
    }
}
