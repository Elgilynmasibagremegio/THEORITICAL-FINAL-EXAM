public class Student extends Quiz { 
         public int totalScore = 120; 
         public int maxScore = 60; 
          
         public void divide (int totalScore, int maxScore) { 
                 grade = totalScore / maxScore; 
         } 
  
         public Student(String name, double grade) { 
                 super(name, grade); 
         } 
  
         @Override 
         public double calculateGrade() { 
                 return (totalScore / maxScore); 
         } 
 }
