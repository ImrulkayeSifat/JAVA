/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj_type_castin;

/**
 *
 * @author imrul
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Teacher();
        p.display();
        
        Teacher t = (Teacher)new Person();
        t.display(); 
    }
}
