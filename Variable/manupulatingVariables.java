ublic class manupulatingVariable {
	public static void main(String[] args) {   
// We covered:

// Addition and subtraction, using + and -
// Multiplication and division, using * and /
// The modulo operator for finding remainders, %
// Compound assignment operators +=, -=, *=, /=, and %=.
// The order of operations: parentheses -> exponents -> multiplication, division, modulo -> addition, subtraction
// Greater than, >, and less than, <
// Equal to, ==, and not equal to, !=
// Greater than or equal to, >=, and less than or equal to, <=
// equals() for comparing Strings and other objects
// Using + to concatenate Strings
// The final keyword which makes variables unchangeable
// Practice some of these concepts here, to make sure you have a solid foundation for learning more complicated and exciting Java concepts!


	}
}

//bank app
public class BankAccount {
  	public static void main(String[] args){
      double balance = 1000.75;
      double amountToWithdraw = 250;
      double updatedBalance = balance - amountToWithdraw;
      double amountForEachFriend = updatedBalance /3;
      boolean canPurchaseTicket = amountForEachFriend >= 250;
      System.out.println(canPurchaseTicket);
      System.out.println("I gave each friend " + amountForEachFriend+ "...");
      
    }       
}