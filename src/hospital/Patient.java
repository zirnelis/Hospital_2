/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import javasem04.activity.Person;

/**
 *
 * @author s4_kuzmin_e
 */
public class Patient extends Person {
    private ArrayList<Appointment> Appointments;
    private String MedicalHistory;
    static int personID;
    
    public Patient(String name, short Age, ArrayList<Appointment> Appointments) 
    {
        super(name, Age, "It`s patient");
        
        personID++;
    }
    
    public void printAllAppointments() 
    {
    
    }
    
    public void subscribeNewAppointment(Appointment newAppointment) 
    {
        
    }
    
    public void deleteExistingAppointment(int AppointmentID)
    {
        
    }
    
    public ArrayList<Appointment> getAppointmentList()
    {
        return this.Appointments;
    }

    @Override
    public int getMyID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
