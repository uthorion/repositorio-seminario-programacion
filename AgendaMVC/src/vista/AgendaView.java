package vista;

import java.util.ArrayList;
import java.util.List;

public class AgendaView extends Consola {
    public AgendaView() {
        super();
    }
    
    public int mostrarMenu() {
        int salida = 0;
        mostrarOpcionesMenu();
        salida = leerOpcionMenu();
        return salida;
    }
    
    public List leerDatosPersona() {
        List salida = new ArrayList();
        String nombre = leerTexto("Ingrese el nombre");
        String apellido = leerTexto("Ingrese el apellido");
        long documento = leerEntero("Ingrese el documento");
        salida.add(nombre);
        salida.add(apellido);
        salida.add(documento);
        return salida;
    }

    private void mostrarOpcionesMenu() {
        System.out.println("1) Agregar persona");
        System.out.println("2) Buscar por document");
        System.out.println("3) Listar todas las personas");
        System.out.println("4) Salir");
    }

    private int leerOpcionMenu() {
        return (int) leerEntero("Ingrese la opcion");
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public long pedirDocumento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void mostrarPersona(List datos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
