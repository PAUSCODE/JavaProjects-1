/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multanddivideexample;

/**
 *
 * @author Estudiantes
 */
public class MultAndDivideExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double subtotal = 30;
    double tax = 0.0875;
    double total = subtotal + (subtotal*tax);
    double perPerson = total/4;

    System.out.println(total);
    System.out.println(perPerson);
    }
    
}
