/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.casouso;

import java.util.Scanner;
import proyecto.TAD.ListaEnlazada;
import proyecto.TAD.Nodo;
import proyecto.entidades.Empleado;

/**
 *
 * @author Royss
 */
public class EmpleadoCasoUso extends PersonaCasoUso {

    //Inicializamos un objeto creando una direccion en memoria 
    //de tipo ListaEnlazada que guardara datos de tipo Empleado.
    private static ListaEnlazada empleados = new ListaEnlazada<Empleado>();

    public static Empleado solicitarDatos() {

        String nombres;
        String apellidos;
        String documento;

      
        System.out.print("Ingrese Nombres: ");
        nombres = (new Scanner(System.in)).next();

        System.out.print("Ingrese Apellidos: ");
        apellidos = (new Scanner(System.in)).next();
        
        do {
            System.out.print("Ingrese Nro Documento: ");
            documento = (new Scanner(System.in)).next();
            
            if(!PersonaCasoUso.validarNumeroDocumento(documento))
                System.out.println("El documento debe tener 8 digitos");
            
        } while (!PersonaCasoUso.validarNumeroDocumento(documento));
        
        

        Empleado empleado = new Empleado("EMP" + 1, nombres, apellidos);
        empleado.setNumeroDocumento(documento);
        return empleado;
    }

    public static void guardarEmpleado(Empleado empleado) {
        if (obtenerEmpleadoPorNumeroDocumento(empleado.getNumeroDocumento()) != null) {
            System.out.println("El empleado con numero documento " + empleado.getNumeroDocumento() + " ya existe.");
            return;
        }

        empleados.insertarAlFinal(empleado);
    }

    public static void listarEmpleados() {
        if (empleados.estaVacia()) {
            System.out.println("Ningun dato de empleado");
            return;
        }

        int orden = 0;
        Nodo<Empleado> nodoEmpleado = empleados.obtenerValor();
        System.out.println("----------------------------------------------------");
        System.out.println("LISTA DE EMPLEADOS");
        System.out.println("Orden\t\t|Nombres\t\t|Apellidos\t\t|Documento\t\t");

        do {
            orden++;
            Empleado empleado = nodoEmpleado.getDato();
            System.out.println(orden + "\t\t|" + empleado.getNombre() + "\t\t\t|" + empleado.getApellido() + "\t\t\t|" + empleado.getNumeroDocumento());
            nodoEmpleado = nodoEmpleado.getSiguiente();
        } while (nodoEmpleado != null);

        System.out.println("----------------------------------------------------");
    }

    public static Empleado obtenerEmpleadoPorNumeroDocumento(String numeroDocumento) {
        if (empleados.estaVacia()) {
            System.out.println("Ningun dato de empleado");
            return null;
        }

        Nodo<Empleado> nodoEmpleado = empleados.obtenerValor();

        do {
            Empleado empleado = nodoEmpleado.getDato();
            if (empleado.getNumeroDocumento().equals(numeroDocumento)) {
                return empleado;
            }

            nodoEmpleado = nodoEmpleado.getSiguiente();
        } while (nodoEmpleado != null);

        return null;
    }

}
