package Mid_fall24;

public class Task03_Tracing {
    public static void main(String[] args) {
        int i=3 , t=3 , sum=0 , j=0 , k=4 ;
        boolean flag=true ;
        while (j<7) {
            i++ ;
            if (flag==true) {
                sum+= t++%i+2-3*k ;
                System.out.println(sum--);
            }
            else {
                sum+= t--%i+3-5*k ;
                System.out.println(sum++);
            }
            flag=!flag ;
            j++ ;
        }
    }
}
