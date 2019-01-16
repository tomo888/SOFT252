/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tjotoole
 */
public class Person {
    protected int ID;
    protected String forename;
    protected String surname;
    protected int age;
    protected String address; 
    protected String city;
    protected String postcode;
    
    public Person(String id, String fname, String sname, String sAge, String caddress, String ccity, String cpostcode) //Constructor
    {
        this.ID = Integer.parseInt(id);
        this.forename = fname;
        this.surname = sname;
        this.age = Integer.parseInt(sAge);
        this.address = caddress;
        this.city = ccity;
        this.postcode = cpostcode;
    }

    
}
