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
public class Admin {
	
        private static String name = "admin";
        private static String password = "admin";
        public Admin(String name,String password) {
		this.name=name;
                this.password=password;
	}
        public  Admin(){
            
        }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Admin.name = name;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Admin.password = password;
    }
	
        
}