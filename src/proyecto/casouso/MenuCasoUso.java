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

    private static int[] opciones = {1, 2, 3, 4, 99}; //inicializamos con valores por defecto un atributo vector de tipo entero
    private static int opcion; //reservamos en memoria un espacio para el atributo de tipo entero
    private static boolean exiteOpcion; //reservamos en memoria un espacio para el atributo de tipo booleano

    public static void bienvenido() {
        System.out.println("Bienvenido al sistema de Ventas");
        System.out.println("Seleccione una de las siguientes opciones:");
    }

    public static void despedida() {
        System.out.println("Ha salido de la aplicación. Vuelva pronto");
    }

    //Esta funcion estatica imprimira en consola el contenido con las opciones del menu.
    public static void visualizarMenu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Registrar Empleado");
        System.out.println("2. Registrar Cliente");
        System.out.println("3. Registrar Pedido");
        System.out.println("4. Reportes");
        System.out.println("99. Salir");
    }

    //Esta funcion solicitara el ingreso de un valor por consola
    //y retornara el valor ingresado si es que se encuentra dentro de las opciones disponibles.
    public static int ingresarRetornarOpcion() {
        do {
            System.out.print("Digite opción: ");
            opcion = (new Scanner(System.in)).nextInt(); //Solicita digitar por consola una opcion
            exiteOpcion = existeValor(opciones, opcion);//Valida si existe la opcion ingresada

            if (!exiteOpcion) {
                System.out.println("La opcion ingresada no existe. Vuelva a intentarlo");
            }

        } while (!exiteOpcion);

        return opcion;
    }

    public static boolean quiereSalir() {
        return opcion == 99;
    }

    //Esta funcion recibe como parametros, un arreglo de enteros y un valor a buscar dentro del arreglo
    private static boolean existeValor(int[] array, int valorBuscar) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorBuscar) //Valida si el valor de la posicion en memoria es igual al valor a buscar.
            {
                return true;
            }
        }

        return false;
    }
}
