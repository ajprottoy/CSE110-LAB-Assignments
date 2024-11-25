package LAB_3;

public class Task06 {
    public static void main(String[] args) {
        int y= 0;
        int n=20;
        for (int i=1; i<=n; i++) {
            if (i%2==0) {
                y-=i*i;
            }
            else {
                y+=i*i;
            }
        }
        System.out.println(y);
    }
}
