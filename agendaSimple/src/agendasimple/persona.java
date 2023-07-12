package agendasimple;

public class persona {
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected int anoNacimiento;
    
    public persona(String nombre, String apellido, int dni, int fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.anoNacimiento = fechaNacimiento;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getDni(){
        return this.dni;
    }
    
    public int getAnoNacimiento(){
        return this.anoNacimiento;
    }
    
    public void setNombre(String Nom){
        this.nombre = Nom;
    }
    
    public void setApellido(String Ape){
        this.apellido = Ape;
    }
    
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public void setAnoNacimiento(int Ano){
        this.anoNacimiento = Ano;
    }
}
