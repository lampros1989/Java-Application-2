/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_java_application_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Person {
    String LName;
    String FName;
    String DOB;
    String FSName;
    private String s;
    
    public String getFName(){
        return this.FName;
    }
    
    public String getLName(){
        return this.LName;
    }
    
    public String getDOB(){
        return this.DOB;
    }
    
    public String getFSName(){
        return this.FSName;
    }
    
    public void setFName(String FName){
        this.FName = FName;        
    }
    
    public void setLName(String LName){
        this.LName = LName;        
    }
    
    public void setDOB(String DOB){
        this.DOB = DOB;        
    }
    
    private void setFSName(String FSName){
        this.FSName = FSName;        
    }
    
    private Date DateOfBirth(){
        Scanner scanner = new Scanner(System.in);
        String str[] = {"day", "month", "year" };
        
        for(int i=0; i<3; i++) {
            System.out.println("Enter " + str[i] + ": ");
            DOB = DOB + scanner.next() + "/";
        }
            DOB = DOB.substring(0, DOB.length()-1);
            System.out.println("date: "+ DOB); 

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = null;

        try {
            parsedDate = dateFormat.parse(DOB);
        } catch (ParseException e) {
                e.printStackTrace();
        }
        return parsedDate;
        }
    
    public void WriteString(int x, String s){
        for (x = 0; x < 3; x++){
            System.out.println("Line " + x + ":" + this.s);
        }
    }

    void getFName(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getLName(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getFSName(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getDOB(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
