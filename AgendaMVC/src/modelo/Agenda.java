package modelo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    protected List<Persona> gente;
    
    public Agenda() {
        this.gente = new ArrayList();
    }
    
    public void agregarPersona(Persona p) throws Exception {
        existePersona(p);
        gente.add(p);
    }

    private void existePersona(Persona p) throws Exception {
        for (int x = 0; x < gente.size(); x++) {
            if (gente.get(x).getDocumento() == p.getDocumento()) {
                throw new Exception("YA EXISTE UNA PERSONA CON ESE DOCUMENTO");
            }
        }
    }

    public Persona buscarPersonaPorDocumento(long documento) throws Exception {
        for (int x = 0; x < gente.size(); x++) {
            if ( gente.get(x).getDocumento() == documento) {
                return gente.get(x);
            }
        }
        throw new Exception("NO EXISTE PERSONA CON ESE DOCUMENTO");
    }

}
