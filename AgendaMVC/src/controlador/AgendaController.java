package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Agenda;
import modelo.Persona;
import vista.AgendaView;

public class AgendaController {
    protected AgendaView vista;
    protected Agenda a;
    
    public AgendaController(AgendaView v) {
        a = new Agenda();
        vista = v;
        int op = 0;
        do {
            op = v.mostrarMenu();
            switch (op) {
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    buscarPersona();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }
        } while (op != 4);
    }

    private void agregarPersona() {
        List datos = this.vista.leerDatosPersona();
        Persona p = new Persona((String)datos.get(0),
                (String)datos.get(1), 
                (long)datos.get(2));
        try {
            a.agregarPersona(p);
            vista.mostrarMensaje("Persona agendada");
        } catch (Exception ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
    }

    private void buscarPersona() {
        long documento = vista.pedirDocumento();
        try {
            Persona p = a.buscarPersonaPorDocumento(documento);
            List datos = new ArrayList();
            datos.add(p.getNombre());
            datos.add(p.getApellido());
            datos.add(p.getDocumento());
            vista.mostrarPersona(datos);
        } catch (Exception ex) {
            
            vista.mostrarMensaje(ex.getMessage());
        }
        
    }
}
