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
public class Librarian extends Person  {
        private String ID;
        private String email;
	private String address;
	private String city;
	private String contactNo;

	public Librarian(String ID,String name,String password,String email,String address,String city,String contactNo) {
		super(name,password);
                this.ID=ID;
		this.email=email;
		this.address=address;
		this.city=city;
		this.contactNo=contactNo;
	}
        public Librarian(){
            
        }

	public void printLibrarian() {
		System.out.println(name + password + email + address + city + contactNo);
	}


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
}