package Main;

import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

public class Operacion {

    Scanner sc = new Scanner(System.in);
    int i=0, j=0, k=0,l=0, m=1;

    public void primos(int cant){
        //código basado de http://lineadecodigo.com/java/numeros-primos-en-java/
        for (i=1;i<=cant;i++) {
            k=0;
            l=(int)sqrt(i);
            for (j=1;j<=l;j++) {
                if (i%j==0)
                    k++;
            }
            if (k<=1)
                System.out.println (i + " es numero primo" );
        }

    }


    public void fibonacci(int cant){
        //código basado de https://byspel.com/serie-fibonacci-en-java-explicacion-codigo/
        for (i = 1; i <= cant; i++) {
            j = k;
            k = m + k;
            m = j;
            System.out.println(m);
        }
    }
}



