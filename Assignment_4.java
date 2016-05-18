import java.util.Scanner;


public class calculator {
	
	int num1,num2;
	
	public int add(int num1,int num2)
	{
		return (num1+num2);
	}
	
	public int sub(int num1,int num2)
	{
		return (num1-num2);
	}
	
	public int mult(int num1,int num2)
	{
		return (num1*num2);
	}
	
	public int div(int num1,int num2)
	{
		return (num1/num2);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the first number : ");
	    int nbr1 = scan.nextInt();
	    
	    System.out.println("Enter the second number : ");
	    int nbr2 = scan.nextInt();
	    
	    calculator obj = new calculator();
	    System.out.println("Enter the choice : ");
	    System.out.println("Enter 1 for Addition");
	    System.out.println("Enter 2 for Subtraction");
	    System.out.println("Enter 3 for Multiplication");
	    System.out.println("Enter 4 for Division");
	    int choice = scan.nextInt();
	    
	    switch (choice) {
		case 1: 
			System.out.println("The Addition of the numbers : "+obj.add(nbr1,nbr2));			
			break;
			
		case 2: 
			System.out.println("The Subtraction of the numbers : "+obj.sub(nbr1,nbr2));			
		    break;
		    
		case 3: 
			System.out.println("The Multiplication of the numbers : "+obj.mult(nbr1,nbr2));	
			break;
		    
		case 4: 
			System.out.println("The Division of the numbers : "+obj.div(nbr1,nbr2));				
		    break;
		    
		default:System.out.println("You have entered a wrong choice.");
			break;
		}
	    
	    
	
	} 	
}
