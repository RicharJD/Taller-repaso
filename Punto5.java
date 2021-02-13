import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto5 {

    public static void main(String[] args) throws IOException {
        BufferedReader ct = new BufferedReader(new InputStreamReader(System.in));
        int n, factorial = 1;
        System.out.println("Ingrese el número para recibir el factorial: ");
        n = Integer.parseInt(ct.readLine());
        for (int i =2; i <=n; i++){
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
  
        }
        
    }
        
  