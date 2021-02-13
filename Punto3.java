import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto3 {
    public static BufferedReader ct = new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n,m,acum = 0,cont = 0;

        System.out.println("Ingrese el primer numero de la multiplicación:");
        n = Integer.parseInt(ct.readLine());

        System.out.println("Ingrese el segundo numero de la multiplicación:");
        m = Integer.parseInt(ct.readLine());

        do{
            acum = acum + n;
            cont++;
        } while(cont<m);
        System.out.println("La multiplicaciòn Da: " + acum);

    }
}
