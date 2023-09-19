public class Multiplicacion {
    Usuario objUsuario=new Usuario();

    Public Multiplicacion (){
        System.out.println("Soy el constructor de Multiplicacion")
}
    public void setMultiplicacion (int pMultiplicacion){
        this.pMultiplicacion = pMultiplicacion;
        return objUsuario.pedirNumero()*objUsuario.pedirNumero();
    }
    
    public void mostrar (int x){
        System.out.println("La multiplicacion es "+ x);
    }
}

