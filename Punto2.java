package Punto2;
import java.util.Scanner;
public class Punto2 {
    
    public static void main(String[] args) {   
       Scanner entrada = new Scanner(System.in);
       
       int i=0, j, pos=0, contador1=0, contador2=0;
       String frase;
       System.out.println("Igrese una frase Para saber si es un palíndromo: ");
       frase = entrada.nextLine();
       j=(frase.length()-1);
       
         while (i<frase.length() & j>=0)
           if (!Character.isLetter(frase.charAt(i)))
                i++;
             else
               if (!Character.isLetter(frase.charAt(j)))
                    j--;
                 else
                   if (frase.charAt(i) == frase.charAt(j)){
                        contador1++;
                        i++;
                        j--;
                    }
                   else{
                        i++;
                        j--;
                    }
        while (pos <= (frase.length()-1))
            if (Character.isLetter(frase.charAt(pos))){
                contador2++;
                pos++;
            }
            else
                pos++;
        if (contador1 == contador2)
            System.out.println("Si es un palíndromo");
        else
            System.out.println("No es un palíndromo");
    }
}