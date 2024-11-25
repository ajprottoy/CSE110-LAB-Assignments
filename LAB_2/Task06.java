package LAB_2;
import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
    
        if (x < 0){
            System.out.println("Output: " + (2*x));
        }
        else if (x >= 0 && x < 2){
            System.out.println("Output: " + (x+1));
        }
        else if (x >= 2 && x < 5){
            System.out.println("Output: " + (Math.pow(x,2)-1));
        }
        else{
            System.out.println("Output: " + (3*Math.pow(x,2)+2));
        }
    }
    
}
