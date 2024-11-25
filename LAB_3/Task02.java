package LAB_3;

public class Task02 {
    public static void main(String[] args) {
        for (int i=18;i<=63;i+=9) {
            if (i%2!=0) {
                int temp=i*-1;
                if (i == 63) {
                    System.out.print(temp*-1);
                }
                else {
                    System.out.print(temp+", ");
                }
            }
            else {
                System.out.print(i+", ");
            }
        }
    }
}
