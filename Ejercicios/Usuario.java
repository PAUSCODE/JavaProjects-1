import java.util.Scanner;

public class Usuario {
    Public Usuario ()
        System.out.println("Soy el constructor de Usuario")
    
    public int pedirNumero(){
        Scanner s=new Scanner (System.in);
        System.out.println("Digite un valor ");
        return s.nextInt();
    
    }
    
}
