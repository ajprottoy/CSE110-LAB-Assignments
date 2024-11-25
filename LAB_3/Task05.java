package LAB_3;

public class Task05 {
    public static void main(String[] args) {
        int sum= 0;
        for (int i=1; i<=600; i++) {
            if (i%7==0 && i%9==0) {
                sum+=0;
            }         
            else if (i%7==0 || i%9==0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
} 
/*  alternative way of solving this problem :
public class Task05{
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<=600; i++){
            if ((i%7==0 || i%9==0) && !(i%7==0 && i%9==0)) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
    */