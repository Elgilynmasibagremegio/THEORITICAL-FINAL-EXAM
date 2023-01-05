import java.util.*; 
  
 public class Main 
 { 
         public static void main(String[] args) 
         { 
                 Customer C; 
                 Customer rc = new RegularCustomer("Elgilyn", 1000); 
             Customer sc = new SeniorCustomer("James", 1000); 
          
                 C = rc; 
                 System.out.println(C.getName() + "(Regular Costumer)"); 
                 System.out.println("Total: $" + C.calculateBill()); 
                  
                 C = sc; 
                 System.out.println(C.getName() + "(Senior Costumer)"); 
                 System.out.println("Total: $" + C.calculateBill()); 
                  
                  
                  
                  
                  
                  
                  
 } 
          
  
 }
