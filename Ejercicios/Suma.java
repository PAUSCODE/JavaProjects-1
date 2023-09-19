
public class Suma {
    Usuario objUsuario=new Usuario();

    public Suma (){
        System.out.println("Soy el constructor de Suma");
    }
    public void setSuma (int pSuma){
        this.pSuma = pSuma;
        return objUsuario.pedirNumero()+objUsuario.pedirNumero();
    }
    
    public void mostrar (int x){
        System.out.println("La suma es "+ x);
    }
}
