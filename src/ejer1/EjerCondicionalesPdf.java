/*1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales.
Si no existen, debe indicarlo.
*/
package ejer1;

import java.util.Scanner;

public class EjerCondicionalesPdf {

    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int a,b,c,d,x1,x2;
        int cuad,raiz;
        System.out.println("Digite el 1er numero: ");
        a=entrada.nextInt();
        System.out.println("Digite el 1er numero: ");
        b=entrada.nextInt();
        System.out.println("Digite el 1er numero: ");
        c=entrada.nextInt();
        
        cuad=(int)(Math.pow(b, 2));
        d=cuad-(4*a*c);
        raiz=(int)(Math.sqrt(d));
        
        x1=(-cuad+raiz)/2*a;
        x2=(+cuad+raiz)/2*a;
        
       
        if(d>0){
            System.out.println("Si existe:\n"
                    + "solucion 1 es: "+x1+"\n"
                    + "solucion 2 es: "+x2+"\n");
            
        }else{
            System.out.println("No existe: ");
        }
            
        
        
        
        
        
        
    }
    
}
