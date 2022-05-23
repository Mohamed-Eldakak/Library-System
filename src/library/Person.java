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
public	class Person {
		protected String name;
		protected String password;
		public String getName() {
			return name;
		}
                public Person(){
                    
                }
		public String getPassword() {
			return password;
		}
		public Person(String name,String password) {
			this.name=name;
			this.password=password;
		}
		
	}