/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
    public String test;
    
  
    
    public Main(String name){
        test = name;
    }
    public static void main(String[] args ){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your name");
       String name = scan.nextLine();
       if(name.equals("Alice")){
           System.out.println("Hello Alice");
        }
        else if(name.equals("Bob")){
        System.out.println("Hello Bob");
        }
        
       else 
       System.out.println("You are not worth my time");
       
       
    }
   
    
    
    }

