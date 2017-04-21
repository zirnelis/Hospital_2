/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author s4_kuzmin_e
 */
public class Procedures extends Doctor {
    private int ProcedureID;
    private String Description;
    private ArrayList<Doctor> Doctors;
    
   
 //   Doctor d1 = new Doctor(001, "surgeon", 001);
            
    public Procedures() {
        this.ProcedureID = 0;
        this.Description = "none";
        //this.Doctors.add(Doctor a);
    }
    
    public Procedures(String Description, ArrayList<Doctor> Doctors) {
        this.Description = Description;
        this.Doctors = Doctors;
    
    }
    
    
    
    
}

    
