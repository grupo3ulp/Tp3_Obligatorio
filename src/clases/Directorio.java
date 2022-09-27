package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import main.Main;

public class Directorio {

    final HashMap<String, Cliente> DIRECTORIO = new HashMap();

    public Directorio() {
    }

    public HashMap<String, Cliente> getDIRECTORIO() {
        return DIRECTORIO;
    }

    public boolean agregarCliente(String nroTel, String dni, String nombre,
            String apellido, String ciudad, String domicilio) {
        Cliente aux = new Cliente(dni, nombre, apellido, ciudad, domicilio);
        if (!DIRECTORIO.containsKey(nroTel)) {
            DIRECTORIO.put(nroTel, aux);
            return true;
        } else {
            return false;
        }
    }

    public Cliente buscarCliente() {
        String nroTelefono = JOptionPane.showInputDialog("Ingrese el numero "
                + "telefonico del cliente que quieremostrar");
        if (DIRECTORIO.containsKey(nroTelefono)) {
            return DIRECTORIO.get(nroTelefono);
        } else {
            return null;
        }
    }

    public ArrayList<String> buscarTelefono() {
        ArrayList<String> listaTelefonos = new ArrayList<>();
        boolean flag = false;
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido "
                + "del cual quiere mostrar los numeros telefonicos");
        for (Map.Entry<String, Cliente> aux : DIRECTORIO.entrySet()) {
            if (aux.getValue().getApellido().equalsIgnoreCase(apellido)) {
                listaTelefonos.add(aux.getKey());
                flag = true;
            }
        }
        return listaTelefonos;
    }

    public TreeSet<Cliente> buscarClientes() {
        TreeSet<Cliente> clientes = new TreeSet<>();
        String ciudad = JOptionPane.showInputDialog("Ingrese la ciudad "
                + "de la cual quiere mostrar los clientes");
        for (Map.Entry<String, Cliente> aux : DIRECTORIO.entrySet()) {
            if (aux.getValue().getCiudad().equalsIgnoreCase(ciudad)) {
                clientes.add(aux.getValue());
            }
        }
        return clientes;
    }

    public boolean borrarCliente() {
        String nroTelefono = JOptionPane.showInputDialog("Ingrese el numero "
                + "de telefono del cliente que quiere borrar");
        if (DIRECTORIO.containsKey(nroTelefono)) {
            String auxNombre=DIRECTORIO.get(nroTelefono).getNombre()+" "
                    +DIRECTORIO.get(nroTelefono).getApellido();
            DIRECTORIO.remove(nroTelefono);        
            JOptionPane.showMessageDialog(null, "El cliente "
                    + auxNombre
                    +" se ha borrado correctamente");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro un cliente con ese "
                    + "numero telefonico");
            return false;
        } 
    }

    public String mostrarCliente() {
        String mostrar="";
         for (Map.Entry<String, Cliente> entry : Main.getDir().getDIRECTORIO().entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            mostrar += value + "Tel: " + key + "\n" + "------------------------" + "\n";
        }   
         return mostrar;
    }
}
