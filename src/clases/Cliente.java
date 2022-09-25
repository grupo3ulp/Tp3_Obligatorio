package clases;


import java.util.Objects;

import static main.Main.sc;

public class Cliente implements Comparable<Cliente>{
    private String dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String domicilio;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String apellido, String ciudad, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.domicilio = domicilio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "DNI: " + dni + "\n" +                              
                "Ciudad: " + ciudad + "\n" +
                "Domicilio: " + domicilio + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return dni.equals(cliente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
    
     @Override
    public int compareTo(Cliente t) {
        long dni1=Integer.parseInt(this.dni);
        long dni2=Integer.parseInt(t.dni);
                
     if(dni1==dni2){
     
         return 0;
     }else if(dni1<dni2){
     
         return -1;
         
     }else {
     
         return 1;
     }
    }
}


