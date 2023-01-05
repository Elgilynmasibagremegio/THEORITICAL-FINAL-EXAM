public class Main { 
         public static void main(String[] args) { 
                 Customer customer; 
                 RegularCustomer regularCustomer = new RegularCustomer("Jennefer", 1500); 
                 SeniorCustomer seniorCustomer = new SeniorCustomer("Aica", 1500); 
  
                 customer = regularCustomer; 
                 System.out.println(customer.getName()+" " +customer.calculateBill()); 
  
                 customer = seniorCustomer; 
                 System.out.println(customer.getName()+" "+customer.calculateBill()); 
         } 
 }
