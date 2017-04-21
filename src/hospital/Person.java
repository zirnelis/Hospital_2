/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author s4_kuzmin_e
 */
public class Person {
    private String name;
    private String surname;
    private int id = 0;
    private short age;


    public Person(String Name, String Surname, short Age)
    {
        this.name = Name;
        this.surname = Surname;
        this.age = Age;
        id++;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    
    public int getID()
    {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(short age) {
        this.age = age;
    }    
}
