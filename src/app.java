
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 1. What do each of the following Boolean expressions evaluate to?
System.out.println("Question 1.");	

	System.out.println(true && false);
	System.out.println(true || false);
	System.out.println(false && false);
	System.out.println(true && (false || true));
	System.out.println(false || (true && false));
	System.out.println(false || 1 < 5);
	System.out.println(5 >= 4 && 1 > 3);
	System.out.println(10 < 4 || 1 > 4);
	System.out.println(12 >= 2 && 1 < 24);
	System.out.println("Hello".charAt(0) == 'h');
	
// 2. Boolean Variables

boolean isHotOutside = true;
boolean isWeekday = false;
boolean hasMoneyInPocket = true;

// 3. Other Variables

double costOfMilk = 2.49;
double moneyInWallet = 18.99;
int thirstLevel = 4;

// 4. Variables and Boolean Operators
System.out.println("Question 4.");

//a.
    boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
    System.out.println(shouldBuyIceCream);
	
//b.
    boolean willGoSwimming = isHotOutside && isWeekday;
	System.out.println (willGoSwimming);
	
//c.
	boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekday;
	System.out.println(isAGoodDay);
	
//d.
	boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= 2*costOfMilk);
	System.out.println(willBuyMilk);
	
	
	}

}
