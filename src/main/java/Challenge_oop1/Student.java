/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Challenge_oop1;

/**
 *
 * @author JhayJ
 */
public class Student {
    String firstname,surname , course, section;
    float flgradef, midgradef;
    int yr;
    Student(String firstname,String surname,int yr, String course, String section, float flgradef, float midgradef){
        this.firstname = firstname;
        this.surname = surname;
        this.yr = yr;
        this.course = course;
        this.section = section;
        this.flgradef = flgradef;
        this.midgradef = midgradef;
        
    }
    void introduce(String firstname, String surname){
        System.out.println("My name is " + firstname+ " " + surname);
    }
    void evalgrade(float flgradef, float midgradef)
    {
        float val = midgradef + flgradef;
        float ave = val / 2;
        if(ave > 100)
        {
            System.out.print("Invalid Grade");
        }
        else if( ave <= 100 || ave >= 98)
        {
            System.out.print("With highest honors");
        }
        else if (ave >= 95 || ave <= 97.99)
        {
            System.out.print("With Highest Honors");
        }
        else if (ave >= 90 || ave <= 94.99 )
        {
            System.out.print("With Honors");
        }
        else if (ave >= 75 || ave <= 89.99)
        {
            System.out.print("Passed");
        }
        else
        {
            System.out.print("FAILED");
        }
        System.out.println("\nYour Averange " + ave);
    
    }
}
