package agendamvc;

import controlador.AgendaController;
import vista.AgendaView;

public class Programa {

    public static void main(String[] args) {
        new AgendaController(new AgendaView());
    }
    
}
