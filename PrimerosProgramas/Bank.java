
package bank;

public class Bank {
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;
  private CheckingAccount accountThree;
  private CheckingAccount accountFour;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100);
    accountTwo = new CheckingAccount("Hades", 200);
    accountThree = new CheckingAccount("Afrodita", 300);
    accountFour = new CheckingAccount("Poseidon", 400);

  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.name);
    System.out.println(bankOfGods.accountOne.balance);
    System.out.println(bankOfGods.accountTwo.name);
    System.out.println(bankOfGods.accountTwo.balance);
  }
}
 

