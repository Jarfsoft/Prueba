/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlabprogra1;
import java.util.Scanner;
/**
 *
 * @author JuanAndrés
 */
public class ExamenLabProgra1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int Ejercicio=0;
        int Ejercicio1=0,Ejercicio2=0,Ejercicio3=0;
        System.out.println("Ingresar numero del ejercicio:\n1. La mayor String\n2. La lavanderia\n3. Palindromo \n4. Salir");
        Ejercicio=leer.nextInt();
        do{
            if(Ejercicio==1)
            {
                Ejercicio1++;
                int Cantidad=0;
                int Longitud=0;
                String Palabra="";
                String PalabraMayor="";
                int Mayor=0;
                System.out.print("\n\nCuantas? ");
                Cantidad=leer.nextInt();
                for(int c=1;c<=Cantidad;c++)
                {
                    System.out.print("\nPalabra "+c+": ");
                    Palabra=leer.next();
                    for(int i=0;i<Palabra.length();i++)
                    {
                        Longitud++;
                    }
                    if(Longitud>Mayor)
                    {
                        Mayor=Longitud;
                        PalabraMayor=Palabra;
                    }
                    Longitud=0;
                }
                System.out.println("\nLa palabra mas larga fue: "+PalabraMayor);
                System.out.println("\n\nIngresar numero del ejercicio:\n1. La mayor String\n2. La lavanderia\n3. Palindromo \n4. Salir");
                Ejercicio=leer.nextInt();
            }else if(Ejercicio==2)
            {
                Ejercicio2++;
                String Nombre="";
                String Tipo="";
                String Continuar="";
                String TipoLavado="";
                String Suavizante="";
                int Formal=0,Casual=0,Colcha=0,Subtotal=0;
                boolean si=true;
                System.out.print("Ingrese nombre del cliente: ");
                Nombre=leer.next();
                do
                {
                    si=true;
                    do{
                        System.out.print("Ingrese Tipo de Prenda (Formal/Casual/Colcha): ");
                        Tipo=leer.next();
                        Tipo=Tipo.toLowerCase();
                        switch (Tipo) {
                            case "formal":
                                si=false;
                                break;
                            case "casual":
                                si=false;
                                break;
                            case "colcha":
                                si=false;
                                break;
                        }
                    }while(si!=false);
                    si=true;
                    do{
                        System.out.print("Normal/Dryclean: ");
                        TipoLavado=leer.next();
                        TipoLavado=TipoLavado.toLowerCase();
                        switch (TipoLavado) {
                            case "normal":
                                si=false;
                                break;
                            case "dryclean":
                                si=false;
                                break;
                        }
                    }while(si!=false);
                    si=true;
                    switch (Tipo) {
                        case "formal":
                            Formal++;
                            switch (TipoLavado){
                                case "dryclean":
                                    Subtotal+=100;
                                    break;
                                case "normal":
                                    Subtotal+=50;
                                    break;
                            }
                            break;
                        case "casual":
                            Casual++;
                            switch (TipoLavado){
                                case "dryclean":
                                    Subtotal+=70;
                                    break;
                                case "normal":
                                    Subtotal+=20;
                                    break;
                            }
                            break;
                        case "colcha":
                            Colcha++;
                            switch (TipoLavado){
                                case "dryclean":
                                    Subtotal+=150;
                                    break;
                                case "normal":
                                    Subtotal+=100;
                                    break;
                            }
                            break;
                    }
                    do{
                        System.out.print("Desea ingresar otra prenda? (Si/No): ");
                        Continuar=leer.next();
                        Continuar=Continuar.toLowerCase();
                        switch (Continuar){
                            case "si":
                                si=false;
                                break;
                            case "no":
                                si=false;
                                break;
                        }
                    }while(si!=false);
                    
                }while("si".equals(Continuar));
                do{
                    System.out.print("Usar suavizante? (Si/No): ");
                    Suavizante=leer.next();
                    Suavizante=Suavizante.toLowerCase();
                    switch (Suavizante){
                        case "si":
                            si=false;
                            break;
                        case "no":
                            si=false;
                            break;
                    }
                            
                    
                }while(si!=false);
                si=true;
                if("si".equals(Suavizante))
                {
                    Subtotal+=200;
                }
                System.out.println("\n\nNumero de prendas formales: "+Formal);
                System.out.println("Numero de prendas casuales: "+Casual);
                System.out.println("Numero de colchas "+Colcha);
                System.out.println("Subtotal: "+Subtotal);
                System.out.println("Impuesto: "+Subtotal*0.15);
                System.out.println("Total: "+(Subtotal+(Subtotal*0.15)));
                System.out.println("\n\nIngresar numero del ejercicio:\n1. La mayor String\n2. La lavanderia\n3. Palindromo \n4. Salir");
                Ejercicio=leer.nextInt();
            }else if(Ejercicio==3)
            {
                Ejercicio3++;
                int i=0;
                int Correcto=0;
                String Palabra="";
                System.out.print("\n\nIngresar una palabra: ");
                Palabra=leer.next();
                for(int c=Palabra.length();c>0;c--)
                {
                    if(Palabra.charAt(c-1)==Palabra.charAt(i))
                    {
                        Correcto++;
                    }
                    i++;
                }
                if(Palabra.length()==Correcto)
                {
                    System.out.println("\nLa palabra es palindromo.");
                }else
                {
                    System.out.println("\nLa palabra no es palindromo.");
                }
                System.out.println("\n\nIngresar numero del ejercicio:\n1. La mayor String\n2. La lavanderia\n3. Palindromo \n4. Salir");
                Ejercicio=leer.nextInt();
            }else if(Ejercicio==4)
            {
                System.out.println("\n\nLa String Mayor se eligio "+Ejercicio1+" veces.");
                System.out.println("\n\nLa Lavanderia se eligio "+Ejercicio2+" veces.");
                System.out.println("\n\nPalindromo se eligio "+Ejercicio3+" veces.");
                Ejercicio=5;
            }
            
            
        }while(Ejercicio>0 && Ejercicio<5);
    }
    
}
