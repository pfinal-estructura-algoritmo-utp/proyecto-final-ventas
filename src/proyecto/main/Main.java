/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.main;

import java.util.ArrayList;
import java.util.Scanner;
import proyecto.casouso.EmpleadoCasoUso;
import proyecto.casouso.MenuCasoUso;
import proyecto.entidades.Empleado;
import proyecto.entidades.Pedido;

/**
 *
 * @author Royss
 */
public class Main {

    public static void main(String[] args) {
        MenuCasoUso.bienvenido();
        int opcion;
        do {
            MenuCasoUso.visualizarMenu();
            opcion = MenuCasoUso.ingresarRetornarOpcion();
           
            if (opcion == 1) {
                Empleado empleado = EmpleadoCasoUso.solicitarDatos();
                EmpleadoCasoUso.guardarEmpleado(empleado);
                EmpleadoCasoUso.listarEmpleados();
            }

        } while (!MenuCasoUso.quiereSalir());
        MenuCasoUso.despedida();
    }

}
