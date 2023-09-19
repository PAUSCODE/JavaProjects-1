public class Resta {
    Usuario objUsuario=new Usuario();

    Public Resta ()
        System.out.println("Soy el constructor de Resta")
    
    public int restar(){
        return objUsuario.pedirNumero()-objUsuario.pedirNumero();
    }
    
    public void mostrar (int x){
        System.out.println("La resta es "+ x);
    }
}
