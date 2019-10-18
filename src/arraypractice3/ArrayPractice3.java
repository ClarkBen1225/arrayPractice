/**
 * Ben.C 
 * Oct 18 2019
 * Calculates the already entered marks average
 */

package arraypractice3;
import java.util.Scanner;

public class ArrayPractice3 {

    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        //Declares our array name and what numbers are in the array
        //Also declares variables 
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2,65.8, 44.8, 88.6};
        double total=0;
        double average;
        
        System.out.println("These are the marks:");
        for (int i = 0; i<=8; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        
        for (int i = 0; i<=8; i= i + 1)
        {
            total = total + marks[i];
        }
        //Calculates the average of the 9 marks
        average = total/9;
        
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
