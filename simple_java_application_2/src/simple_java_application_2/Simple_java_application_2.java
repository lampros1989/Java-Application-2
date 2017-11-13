/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_java_application_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Simple_java_application_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        person.getFName(sc.next());
        person.getLName(sc.next());
        person.getFSName(sc.next());
        person.getDOB(sc.next());
        System.out.println(person.getFName());
        System.out.println(person.getLName());
        System.out.println(person.getFSName());
        System.out.println(person.getDOB());
        String line = null;
        BufferedReader in = new BufferedReader(new FileReader("lastname.firstname.txt"));
        while ((line = br.readLine())!= null)
            System.out.println(line);
        br.close();
        String a = getLName()+", "+getFName()+", "+getFSName();
        WriteString(1,a);
        String b = getDOB();
        WriteString(2,b);
        
    }

    private static String getLName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String getFName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String getFSName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void WriteString(int i, String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String getDOB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
