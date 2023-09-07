/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itec30.java_oop_maven3;

/**
 *
 * @author JhayJ
 */
public class Mc {
    
    String name, work, gender;
    int age, birthday, attk, defense;
    Mc(String name, String work, String gender, int age,int birthday){
        this.name = name;
        this.work = work;
        this.gender = gender;
        this.birthday = birthday;
        this.age = age;
        this.attk = attk;
   
    }
    void pakilala(){
        System.out.println("I am " + this.name);
        System.out.println("My work is " + this.work);
        System.out.println("Sex "+ this.gender);
        System.out.println("Age "+this.age);
    }
    void Attack(String mcName){
        System.out.println(name + " attack " + mcName);
    }
    
}
