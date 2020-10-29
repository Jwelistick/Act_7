package Main;
import java.util.Scanner;

public class Act_7 {
    public static void main(String[] args) {
        Operacion op = new Operacion();
        Scanner sc = new Scanner(System.in);
        int decision, con;

        System.out.println("Quieres quisieras mostrar?\n" +
                "1-números primos\n" +
                "2-serie de fibonacci");
        decision = Integer.parseInt(sc.next());
        System.out.println("Cuántos números quieres repetir en el programa / serie?");
        con = Integer.parseInt(sc.next());

        //código de los números primos
        if (decision == 1) {
            op.primos(con);
        }

        //código de fibonacci
        else if (decision == 2){
            op.fibonacci(con);
        }

        //default
        else{
            System.out.println("Escribe un número válido");
        }
    }
}
