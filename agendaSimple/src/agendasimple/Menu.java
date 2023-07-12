package agendasimple;

public class Menu {
    private consola c;
    private persona Personas[];
    private int Contador;
    
    public Menu(){
        this.c = new consola();
        this.Personas = new persona[3];
        this.Contador = 0;
    }
    
    public void MostrarMenu(){
        
        int ciclo;
        
        do{
            System.out.println("1 - ingresar persona");
            System.out.println("2 - buscar persona por documento");
            System.out.println("3 - listar personas ingresadas");
            System.out.println("0 - salir");
            
            ciclo = c.LeerInt("ingrese opcion: ");
        
            switch(ciclo){
                case 0:
                    System.out.println("fin del programa");
                break;
                case 1: 
                    
                    String Nom = c.LeerString("ingresar nombre: ");
                    
                    String Ape = c.LeerString("ingresar apellido: ");
                    int dni = c.LeerInt("ingrese dni");
                    int fechaNacimiento = c.LeerInt("ingrese fecha de nacimiento: ");
                    
                    this.Personas[this.Contador] = new persona(Nom,Ape,dni,fechaNacimiento);
                    //lo de abajo es redundante
                    /*this.Personas[this.Contador].setNombre(Nom);
                    this.Personas[this.Contador].setApellido(Ape);
                    this.Personas[this.Contador].setDni(dni);
                    this.Personas[this.Contador].setAnoNacimiento(fechaNacimiento);*/
                    
                    this.Contador++;
                break;
                case 2:
                    System.out.println("ingresar dni a escanear");
                    int dni_aux = c.LeerInt("ingrese valor: ");
                    
                    for(int i=0;i<Contador;i++){
                        System.out.println(this.Personas[i].getNombre());
                        System.out.println(this.Personas[i].getApellido());
                        System.out.println(this.Personas[i].getDni());
                        System.out.println(this.Personas[i].getAnoNacimiento());
                    }
                break;
                case 3:
                    for(int i=0;i<this.Contador;i++){
                        System.out.println(this.Personas[i].getNombre());
                        System.out.println(this.Personas[i].getApellido());
                        System.out.println(this.Personas[i].getDni());
                        System.out.println(this.Personas[i].getAnoNacimiento());
                    }
                break;
            }
        }while(ciclo != 0);
    }
}
