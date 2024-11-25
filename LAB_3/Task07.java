package LAB_3;

public class Task07 {
    public static void main(String[] args) {
        int num= 6;
        int count= 0;
        for (int i=1; i<=num; i++) {
            if (num%i==0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
