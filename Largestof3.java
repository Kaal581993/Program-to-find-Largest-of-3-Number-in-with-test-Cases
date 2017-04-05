/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestof3;
import java.io.*;
import static java.lang.System.exit;
import java.util.*;
/**
 *
 * @author Viral
 */
public class Largestof3 {

    /**
     * @param args the command line arguments
     */
    /**/
 public static boolean isNumeric(String str){  
  try{  
    double d = Double.parseDouble(str);  
  }catch(NumberFormatException nfe){  
    return false;  
  }  
  return true;  
}

    
    public boolean FindLargest(String a,String b,String c){
         
        try{  double d1 = Double.parseDouble(a); double d2 = Double.parseDouble(b); double d3 = Double.parseDouble(c);
           
            if(d1==d2 && d1==d3){
                System.out.println("All the No.s are Same");
            }else if(d1==d2 & d1>d3){
                System.out.println("First No. = Secound No. ie"+d1+"is the Largest No.");
            }else if(d1==d3 & d1>d2){
                System.out.println("First No. = Third No. ie"+d1+"is the Largest No.");
            }else if(d2==d3 & d2>d1){
                System.out.println("Second No. = Third No. ie"+d2+"is the Largest No.");
            }else if(d1>d2 && d1>d3){
                System.out.println("The Largest No. is:"+d1);
            }else if(d2>d1 && d2>d3){
                System.out.println("The Largest No. is:"+d2);
            }else if(d3>d2 && d3>d1){
                System.out.println("The Largest No. is:"+d3);
            }
        
        }
        catch(NumberFormatException nfe){  return false;    }  
            return true;  
            
        
        
    }
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String a,b,c;
        
        System.out.println("Enter the First No.");
        BufferedReader br;
        InputStreamReader ir= new InputStreamReader(System.in);
        br = new BufferedReader(ir);
        a= br.readLine();
        if (!a.matches("^[0-9]\\d{0,9}(\\.\\d{1,20})?%?$")) {
                System.out.println("Invalid number");
                exit(1);
        }
        
        System.out.println("Enter the Secound No.");
        br = new BufferedReader(ir);
        b= br.readLine();

        if (!b.matches("^[0-9]\\d{0,9}(\\.\\d{1,20})?%?$")) {
                System.out.println("Invalid number");
                exit(1);
        }

        
        System.out.println("Enter the Third No.");
        br = new BufferedReader(ir);
        c= br.readLine();
        
        if (!c.matches("^[0-9]\\d{0,9}(\\.\\d{1,20})?%?$")) {
                System.out.println("Invalid number");
                exit(1);
        }        
        
        
        System.out.println("The First No. is:"+a);
        System.out.println("The Secound No. is:"+b);
        System.out.println("The Third No. is:"+c);
        
        Largestof3 l = new Largestof3();
        l.FindLargest(a, b, c);

    }
    
}
