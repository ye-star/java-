import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
       int i = 0;
       int j = 1;
       int sum1=0;
       int sum2=0;
        while(i<=100){
            sum2 += i;
            i +=2 ;
        }
        while (j<=100){
            sum1 += j;
            j += 2;
        }
    System.out.println("100以内的奇数和是："+sum1);
        System.out.println("100以内的偶数和是："+sum2);

    }
}


