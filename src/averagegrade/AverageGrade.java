
package averagegrade;

/**
 *
 * Jacob Makil
 */
public class AverageGrade {


    public static void main(String[] args) {
  
    int [] grade = new int[10];
    grade[0] = 56;
    grade[1] = 82;
    grade[3] = 79;
    grade[4] = 36;
    grade[5] = 93;
    grade[7] = 78;
    grade[8] = 60;
    grade[9] = 94;
       
    String error = "Cannot be Calculated!!!";
    int averageGrade = calcAvg(grade);
   
    if (averageGrade == 101){
    System.out.println("There should be no negative grade");
    System.out.println("The average grade is: " + error);
    }else {
      System.out.println("The Average Grade is: " + averageGrade + "%");
        }
    }
  
    
    public static int calcAvg(int[] y){
    int total = 0;
    int number = 0;
    int averageGrade = 0;
    for (int i = 0; i < y.length; i++){
       if (y[i] >= 0){
         number++;
         total = y[i] + total;
         averageGrade = (total/number);
       } 
       else {
        return averageGrade = 101;
       }
    }
       return averageGrade;
    }
}
        
   
    
    
    

