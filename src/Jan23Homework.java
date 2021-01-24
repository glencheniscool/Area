import java.util.Scanner;

public class Jan23Homework {

	public static void main(String[] args) {
		// This is the power calculator
		System.out.println("Welcome to the power calculator!\nEnter a base to continue.");
		Scanner s = new Scanner(System.in);
		double base = s.nextDouble();
		
		System.out.println("Now enter a power: ");
		Scanner z = new Scanner(System.in);
		double power = s.nextDouble();
		
		System.out.println(base + " to the power of " + power + " is equal to " + Math.pow(base, power));
		
		
		// This is the kilogram to pound converter
		System.out.println("Welcome to the kilogram to pound converter!\nEnter a value (in kilograms) to continue.");
		Scanner x = new Scanner(System.in);
		double kilo = x.nextDouble();
		
		System.out.println(kilo + " kilograms is " + kilo * 2.20462 + " pounds."); 
		
		
		// This is the division calculator
		System.out.println("Welcome to the division calculator.\nEnter the first number: ");
		Scanner y = new Scanner(System.in);
		double dividend = y.nextDouble();
		
		System.out.println("Now the second number: ");
		Scanner q = new Scanner(System.in);
		double divisor = q.nextDouble();
		
		int ynor = (int)dividend;
		int qnor = (int)divisor;
				
		
		System.out.println(dividend + " divided by " + divisor + " is equal to " + 	dividend / divisor + ".\n" + "Also, the division of " + dividend + " over " + divisor + " with remainders is equal to " + ynor / qnor + " with a remainder of " + dividend % divisor);
		
		// This is the coin value calculator
		
		System.out.println("How many toonies (two dollars coins) do you have? ");
		Scanner ton = new Scanner(System.in);
		double toony = ton.nextDouble();
		
		System.out.println("How many loonies (one dollar coins) do you have? ");
		Scanner lon = new Scanner(System.in);
		double loony = lon.nextDouble();
		
		System.out.println("How many quarters (25 cent coins) do you have?");
		Scanner quar = new Scanner(System.in);
		double quarter = quar.nextDouble();
		
		System.out.println("How many dimes (ten cent coins) do you have?");
		Scanner dim = new Scanner(System.in);
		double dime = dim.nextDouble();
		
		System.out.println("How many nickels (five cent coins) do you have?");
		Scanner nick = new Scanner(System.in);
		double nickel = nick.nextDouble();
		
		double totalmoney = toony*2 + loony + dime/10 + nickel/20 + quarter/4;
		
		System.out.println("This is how much money you have, in total: $" + totalmoney + ".");
		
		// This is the digit adder
		
		System.out.println("Enter a four (to one)-digit number: ");
		Scanner num = new Scanner(System.in);
		int num1 = num.nextInt();
		
		int thousand = num1/1000%10;
		int hundred = num1/100%10;
		int ten = num1/10%10;
		int one = num1%10;
		
		System.out.println("The total of your digits is\n " + (thousand+hundred+ten+one));
		
		
		s.close();
		z.close();
		y.close();
		x.close();
		q.close();
		ton.close();
		lon.close();
		dim.close();
		nick.close();
		quar.close();
		num.close();
		
		
		
	}

}
