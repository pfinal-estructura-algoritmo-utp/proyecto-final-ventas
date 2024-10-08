/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.casouso;

import java.util.Scanner;

/**
 *
 * @author Royss
 */
public class MenuCasoUso {
    
    private static int[] opciones  = {1,2,3,4};
    private static int opcion;
    private static boolean exiteOpcion;
    
    public static void visualizarMenu() {
       System.out.println("Bienvenido al sistema de Ventas");
       System.out.println("Seleccione una de las siguientes opciones:");
       System.out.println("1. Registrar Empleado");
       System.out.println("2. Registrar Cliente");
       System.out.println("3. Registrar Pedido");
       System.out.println("4. Reportes");
    }
    
    public static int ingresarRetornarOpcion() {
         do{
           System.out.print("Digite: ");
           opcion = (new Scanner(System.in)).nextInt();
           exiteOpcion = existeValor(opciones, opcion);
           
           if(!exiteOpcion){
               System.out.println("La opcion ingresada no existe. Vuelva a intentarlo");
           }
           
       }while(!exiteOpcion);
       
       return opcion;
    }
    
    private static boolean existeValor(int[] array, int valorBuscar ) {
       for (int i = 0; i < array.length; i++) {
           if(array[i] == valorBuscar)
               return true;
       }
       
       return false;
   }
}
