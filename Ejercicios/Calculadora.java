
public class Calculadora {
    private Suma objSuma= new Suma();
    private Resta objResta= new Resta();
    private Multiplicacion objMultiplicacion= new Multiplicacion();
    private Usuario objUsuario = new Usuario();
    
    public void operaciones(){
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("Digite su opcion ");
        int opcion = objUsuario.pedirNumero();
        if (opcion == 1){
            objSuma.mostrar(objSuma.sumar());
        }else if (opcion == 2){
            objResta.mostrar(objResta.restar());
        }else if (opcion == 3){
            objMultiplicacion.mostrar(objMultiplicacion.multiplicar());
        }else{
           System.out.println("Gracias por usar el programa");
    }
   }
    }    
        
        
    

