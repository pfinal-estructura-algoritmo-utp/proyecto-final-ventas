/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.casouso;

/**
 *
 * @author Royss
 */
public abstract class PersonaCasoUso {
    
    public static boolean validarNumeroDocumento(String numeroDocumento){
        return !(numeroDocumento == null || numeroDocumento.trim().equals("") || numeroDocumento.trim().length() != 8);  
    }
    
     public static boolean validarVacio(String valor){
        return !(valor == null || valor.trim().equals(""));
    }
}
