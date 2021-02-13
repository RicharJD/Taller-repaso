
import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num, num2, num3;
        
        System.out.print("Ingrese el primer numero ");
        num = sc.nextInt();
        System.out.print("Ingrese el segundo numero ");
        num2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero");
        num3 = sc.nextInt();
        
        if (num > num2) {
            if (num > num3) {
                
                System.out.println("El mayor es: " + num);
            } else {
                
                System.out.println("El mayor es: " + num3);
            }
        } else if (num2 > num3) {
            
            System.out.println("El mayor es: " + num2);
            
        } else {
            System.out.println("El mayor es: " + num3);
            
        }
    }
}