package LAB_3;

public class demoTask02 {
    public static void main(String[] args) {
        int start = 18; // First value of the sequence
        int sign = 1;   // Alternating sign starts positive

        for (int i = 0; i < 6; i++) { 
            if (start!=63) {
                System.out.print(sign * start + ", ");
            }
            else {
                System.out.println(sign*start);
            }

            start += 9;  // Increment by 9 for each term
            sign *= -1;  // Alternate the sign
        }
    }
}

