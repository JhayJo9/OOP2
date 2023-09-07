/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package itec30.java_oop_maven3;
import java.util.Scanner;
/**
 *
 * @author JhayJ 
 */
public class Java_oop_maven3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World!");
         Mc bida1 = new Mc("Yohan", "CEO", "male", 18, 14);
         bida1.pakilala();
         Mc bida2 = new Mc("Gwang bi", "Warroir", "Male", 23, 3);
         bida2.Attack("Yohan");
         
         System.out.print("Enter name to attack : ");
         String enemy = scan.next();
         
         Userinput1 up = new Userinput1(enemy);
         
    }
}
