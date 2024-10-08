/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.main;

import java.util.ArrayList;
import java.util.Scanner;
import proyecto.casouso.MenuCasoUso;
import proyecto.entidades.Pedido;

/**
 *
 * @author Royss
 */
public class Main {
    
   public static void main(String[] args) {
       MenuCasoUso.visualizarMenu();
       int opcion = MenuCasoUso.ingresarRetornarOpcion();
       System.out.println(opcion);
   }
   
  
}
