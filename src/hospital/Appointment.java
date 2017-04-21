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
public class Appointment {
    private int AppointmentID;
    private String Date;
    private ArrayList<Doctor> Doctors;
    private String Description;

    
    public Appointment() {
        this.AppointmentID = 0;
        this.Date = "00.00.00";
        this.Doctors = new ArrayList<Doctor>();
    }
    
    public Appointment(int AppointmentID, String Date, ArrayList<Doctor> Doctors, String Description)
    {
        
    }

    public int getAppointmentID() {
        return AppointmentID;
    }

    public String getDate() {
        return Date;
    }

    public ArrayList<Doctor> getDoctors() {
        return Doctors;
    }

    public ArrayList<Doctor> getProcedures() {
        return Doctors;
    }

    public void setAppointmentID(int AppointmentID) {
        this.AppointmentID = AppointmentID;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setProcedures(ArrayList<Doctor> Procedures) {
        this.Doctors = Procedures;
    }
    
    public void setDoctors(ArrayList<Doctor> Doctors) {
        this.Doctors = Doctors;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }
    
    public void printInvolvedDoctors()
    {
    
    }
    
    public void addNewDoctor(Doctor newDoctor)
    {
        
    }
    
    public void removeExistingDoctor(int id)
    {
    
    }
}
