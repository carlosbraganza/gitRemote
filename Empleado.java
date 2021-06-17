/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypquete;

import java.time.LocalDate;

/**
 *
 * @author CarlosBraganza
 */
public class Empleado extends Persona {

    private int sueldo;
    private String[] DiasTrabajo = {"lunes"};
    private int CodidoT;

    //________________________________________________Creacion de Costructores _______________________________________________________//
    //________________________________________________Constructor por defecto_________________________________________________________//
    public Empleado() {
    }

   
    
    
    public Empleado(int CodidoT, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int codigo, boolean sexo, int edad, String profesion, int sueldo, String[] DiasTrabajo) {
        super(nombre, apellido1, apellido2, fechaNacimiento, codigo, sexo, edad, profesion);
        this.sueldo = sueldo;
        this.DiasTrabajo = DiasTrabajo;
        this.CodidoT = CodidoT;
    }

    
    public void dimeDiasTrabajo (){
        for (int i = 0; i < DiasTrabajo.length; i++) {
            System.out.println("Trabaja los dias: " + DiasTrabajo[i]);
        }
        
    }
    
    
    
    @Override
    public String toString() {

        return super.toString() + " con sueldo de: " + sueldo +  ", DiasTrabajo=" + DiasTrabajo.length + "\n" +", Codido de Trabajador = " + CodidoT + '}';
    }

    
    @Override
    public void comer(){
        System.out.println( super.getNombre() + "la persona come carne");
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String[] getDiasTrabajo() {
        return DiasTrabajo;
    }

    public void setDiasTrabajo(String[] DiasTrabajo) {
        this.DiasTrabajo = DiasTrabajo;
    }

    public int getCodidoT() {
        return CodidoT;
    }

    public void setCodidoT(int CodidoT) {
        this.CodidoT = CodidoT;
    }

    void setDiasTrabajo(String diasT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
    
    
}
