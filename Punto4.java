import java.util.*;
public class Punto4{
        
public static void  main(String[] args){
Scanner input = new Scanner(System.in);
    int b,p,s=0,r=0;
    System.out.println("Ingrese la base: ");
    b = input.nextInt();     
    System.out.println("Ingrese el exponente: ");
    p = input.nextInt();
    r = potencia(b,p);
    System.out.println("El resultado es: "+ r);            
 }          
public static int potencia(int b,int p){
 int r = 1;
 for(int i=0;i<p;i++ ){
   r = multiplicacion(r,b);
}
   return r;
}
 public static int multiplicacion(int r, int b){  
 int s=0;
 for(int i=0;i<r;i++){
  s = s + b;
}
   return s;
}
}