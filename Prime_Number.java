package Devam2;
/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.


 */

public class Prime_Number {
    public static void main(String[] args) {
        int i;
        int j;


        for( i=2; i<=100; i++) {
            int counter=0;

            for( j=1; j<=i; j++ ) {

                if (i%j == 0) {
                    counter++;

                }

            } if (counter <=2) {
                System.out.println(i);
            }
        }
    }
}
