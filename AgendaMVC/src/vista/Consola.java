package vista;

import java.util.Scanner;

public class Consola {
    protected Scanner sc;
    
    public Consola() {
        this.sc = new Scanner(System.in);
    }
    
    public String leerTexto(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }
    
    public long leerEntero(String msg) {
        System.out.println(msg);
        long salida = sc.nextLong();
        sc.nextLine();
        return salida;
    }
    
    public double leerReal(String msg) {
        System.out.println(msg);
        double salida = sc.nextDouble();
        sc.nextLine();
        return salida;
    }
}
