/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos.milibreria;

/**
 *
 * @author carlos
 */
public class Persona {
    
    private int edad;
    private String nombre;

    /**
     *
     * @param edad
     * @param nombre
     */
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    /**
     *
     * @return la edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad años a establecer
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     *
     * @param numero cantidad a sumar a la edad
     * @return resultado de sumar numero y edad de la persona
     */
    public int sumarEdad (int numero){
        return this.edad + numero;
    }
    
}
