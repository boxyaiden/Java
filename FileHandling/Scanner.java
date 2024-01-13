import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        
    System.out.println("Type your name: ");
        
    Scanner scan = new Scanner(System.in); 
    String inputScan = scan.nextLine(); 
    
    if(inputScan.equals("Aiden")) System.out.println("Welcome " + inputScan +"!");
    // Do not use => if(inputScan == "Aiden"); 
    }
}