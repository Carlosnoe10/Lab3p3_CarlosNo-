
package lab3_carlos_noé;

import java.util.Scanner;

public class Lab3_Carlos_Noé {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido");
        
        System.out.println("Ingrese la opcion 1. para ingresar al programa ('Cadena repetida')."); 
        
        System.out.println("Ingrese la opcion 2 para ingresar al programa ('Sumatoria')");
        
        System.out.println("Ingrese la opcion 3 para ingresar al programa ('Reloj')");
        
        System.out.println("la salida es la opcion 4");

        int menu=scanner.nextInt();
        
        switch (menu){
            case 1: 
                System.out.println("Ingrese una cadena:");
                
                String cadena=scanner.next();
                
                String nuevaPalabra=cadena.replace('.','1');
                
                System.out.println(nuevaPalabra);
                /*
                detalles. no mirar el problema por tododo aprte por parte
                ver patrones
                no ver solo el problema lineas y columnas 
                */
                
                
                
            case 2:
                    System.out.println("Ingrese el numero entero");
                    int k=scanner.nextInt();
                    String resultado= "";
                    double nk2, kn;
                    for(int n=1; n >= k; n++ ){
                    int k1= (2*n)+1 ;
                    
                    int n1= (n*n)+3;
                    
                    kn= n1/k1;
               
                    nk2=n;
                    
                    for (int nk =1; nk < k; nk++){
                        nk2 = (nk2 * k);
                                 }
                    resultado = (resultado + (kn * nk2)) + " ";
                    }
                    System.out.println("Resultado ="+resultado);
     
        case 3:
            
            System.out.println("Ingrese el valor de n");
            int j=scanner.nextInt();
            int j2=j;
            int j4=0;
                for( int i=0; i<=(j2*2)-1 ;i++){
                    if((i%2==0)&&(j4%2==0)){
                        System.out.print("*");
                                }else{
                    System.out.print(" ");
                    }
                    if((j4>0)&&(j4%2!=0)){
                     System.out.print("*");
                                }else{
                    System.out.print(" ");
                    }
                    for(j4; j4<=(j2*2)-1 ; j4++){
                    if((j4!=0)&&(j4%2!=0)){
                    System.out.println("*");
                                }else{
                    System.out.println(" ");
                    }
                    
                }
                }
            case 4: 
                break;
}
                        }

            
}
            
            
                               
