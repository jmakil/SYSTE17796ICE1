
package averagegrade;

/**
 *
 * Jacob Makil
 */
public class AverageGrade {


    public static void main(String[] args) {
  
    //The grades being placed in an Array called grade
    int [] grade = new int[10];
    grade[0] = 56;
    grade[1] = 82;
    grade[3] = 79;
    grade[4] = 36;
    grade[5] = 93;
    grade[7] = 78;
    grade[8] = 90;
    grade[9] = 74;
       
    String error = "Cannot be Calculated!!!";
    //This code invoke the calcAvg() method to get the average grade and store it in averageGrade
    int averageGrade = calcAvg(grade);
    //This code invoke the calMax() method to get the highest grade in the array and store it into highestGrade
    int highestGrade = calcMax(grade);
 
    //Using if statement to display the output of average.
    if (averageGrade == 101){
    System.out.println("There should be no negative grade");
    System.out.println("The average grade is: " + error);
    }else {
    System.out.println("The Average Grade is: " + averageGrade + "%");
        }
    //This code will display the highest grade in the Array
    System.out.println("The Maximum Grade Is: " + highestGrade + "%");
        
    }
  
    
    //Here is the calcAvg method. This method will calculate the average of all the grades in the array and return the average.
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
    
    // This method method figures out the maximum grade in the array and returns it. 
    public static int calcMax(int[] y){
    int highestGrade = 0;
    int mark = 0;
    for (int i = 0; i < y.length; i++){
        if (y[i] > mark) {
            mark = y[i];
            highestGrade = mark;
        }
    }
     return highestGrade;
    }
    
    
    
    
    
    
    
    
}
        
   
    
    
    

