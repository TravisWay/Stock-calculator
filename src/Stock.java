import java.util.Scanner;
public class Stock {
		
	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to the T$ Stock Calculator" + "\n");
			
			
							
					int shares = 908;
							
					double avg = .8089;
		
					System.out.println("What is the stock selling for at this time?");
		
					double now = userInput.nextDouble();
				
					double gains = (shares * now) - (shares * avg);
					
										
					System.out.println("Your return at this time is " + gains);
		
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}

