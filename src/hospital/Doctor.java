/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import javasem04.activity.Person;

/**
 *
 * @author s4_kuzmin_e
 */
public class Doctor extends Person {

    private String Speciality;
    private short OfficeNum;
    
    public Doctor() {
        super("none", 1, "It`s doctor!");
        Speciality = "none";
        OfficeNum = 0;
    }
    
    public Doctor(String Name, int Age, String Speciality, short OfficeNumber) {
        super(Name, Age, "It`s doctor!");
        this.Speciality = Speciality;
        this.OfficeNum = OfficeNumber;
    }


    public String getSpeciality() {
        return Speciality;
    }

    public short getOfficeNumber() {
        return OfficeNum;
    }

    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
    }

    public void setOfficeNumber(short OfficeNumber) {
        this.OfficeNum= OfficeNumber;
    }

    @Override
    public int getMyID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
