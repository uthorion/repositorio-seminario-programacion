package agendasimple;

import java.util.Scanner;

public class consola {
    private Scanner sc;
    
    public consola(){
        this.sc = new Scanner(System.in);
    }
    
    public String LeerString(String msg){
        System.out.println(msg);
        return this.sc.next();
    }
    
    public int LeerInt(String msg){
        System.out.println(msg);
        return this.sc.nextInt();
    }
}
