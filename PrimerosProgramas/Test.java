
package test;

public class Test {
    
    public static void main(String[] args) {
        Person Bob = new Person();
        Bob.setName("Bob");
        Bob.setFavColor("Purple");
        Bob.setAge(16);
        
        System.out.println("Hi my name is " + Bob.getName());
        System.out.println("My favorite color is " + Bob.getFavColor());
        System.out.println("I am " + Bob.getAge() + " years old");
    }
    
}
