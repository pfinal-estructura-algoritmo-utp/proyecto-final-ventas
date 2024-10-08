/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.entidades;

/**
 *
 * @author Royss
 */
public class Cliente extends Persona {

    private int clienteId;
    private int edad;

    public Cliente(int id, String nom, String ape) {
        super(nom, ape);
        this.clienteId = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

}
