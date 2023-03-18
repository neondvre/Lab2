/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miaunet;

/**
 *
 * @author valentina lara
 */
import java.util.Scanner;

public class Miaunet {

    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del a
       String op1;
       int op2;
       int op3;
       PlanNormal miau = new PlanNormal(120,0,op1);
       PlanPreferencial miau2 = new PlanPreferencial(80,0, op2);
        
       while(!salir){
            
           System.out.println("1.- monto total por cliente");
           System.out.println("2. mostrar la cantidad por tipo de plan");
           System.out.println("3. salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("""
                                      Cual tipo de plan prefiere, preferencial
                                      o normal? (N/P)
                                      """);
                   op1 = sn.nextLine();
                   if (op1=="P"){
                       System.out.println("Ingrese minutos deseados!!");
                       op2 = sn.nextInt();
                       if (op2==)
                       
                       PlanNormal miau = new PlanNormal(120,op2,op1);
                       miau
                   }
                   if(op1=="N") {
                       System.out.println("Ingrese minutos deseados!!");
                       op2 = sn.nextInt();
                       PlanPreferencial miau2 = new PlanPreferencial(80, op2, op1);
              
                   }
                   
                   
                   break;


               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   break;
                case 3:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 3");
           }
            
       }
        
    }
}
    

