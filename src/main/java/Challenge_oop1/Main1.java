/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Challenge_oop1;
import java.util.Scanner;
/**
 *
 * @author JhayJ
 */
public class Main1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("First name: ");
        String name = scan.next();
        System.out.print("Last name : ");
        String last = scan.next();
        System.out.print("Year level : ");
        int yr = scan.nextInt();
        System.out.print("Course : ");
        String course = scan.next();
        System.out.print("Section : ");
        String section = scan.next();
        System.out.print("Midterm Grade : ");
        float midgradef = scan.nextFloat();
        System.out.print("Final Grade : ");
        float flgradef = scan.nextFloat();
        
        Student pr = new Student(name,last, yr, course, section, midgradef, flgradef);
        pr.introduce(name, last);
        pr.evalgrade(flgradef, midgradef);
    }
}
