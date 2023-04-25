/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica1.barbechonayeli.fernandezaroon.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Directivo extends Empleado {
    private String categoria;
    private List<Empleado> listaEmpleados;

    public Directivo() {
        this.listaEmpleados = new ArrayList<>();

    }

    public Directivo(String categoria, Double sueldo, String cedula, String nombre, String correo, String direccion) {
        super(sueldo, cedula, nombre, correo, direccion);
        this.categoria = categoria;
        this.listaEmpleados = new ArrayList<>();
    }

  
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void agregarSubordinado(Empleado empleado){
        this.listaEmpleados.add(empleado);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCategoria: " + categoria +"Lista de Empleados: " + listaEmpleados + "\nDirectivo";
    }
    
   
}
    

    
    
