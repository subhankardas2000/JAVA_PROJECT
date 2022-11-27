import java.util.Scanner;
public class coffeeshop {
	public static int Espresso;
	int cappuccino;
	int latte;
	int choice;
	int choices;
	int milk;
	int cream;
	int addon;
	int quantity =1;
	static int price;
	int total = 30;
	String again;
		
	Scanner sc = new Scanner(System.in);	
	// creat method for displaing menu
	public void displayMenu() {
		
		System.out.println("****************** Welcome To Our Cafe ********************");
		System.out.println("===========================================================");
		System.out.println("               1. Espresso          ");
		System.out.println("               2. cappuccino        ");
		System.out.println("               3. latte             ");
		System.out.println("===========================================================");
		System.out.println("               What Do You Want To Order??	             ");
		}
	// method to generate bill
	public void generateBill() {
		System.out.println();
		System.out.println("****************** ThankYou for ordering ********************");
		System.out.println("****************** Your bill is: "+ total+"******************");
	}
	// creat method to order item form menu
	public void order() 
	{
		while(true){ 
						System.out.println("enter your choice");
						choice = sc.nextInt();
						switch(choice) {				
									case 1: //Espresso													
										System.out.println("you have selected Espresso");
										
										System.out.println("1. Milk.....60rs");
										System.out.println("2. Cream....75rs");
										System.out.println("3. Latte....100rs");
										System.out.println("enter the Product/Add-on :");
										addon = sc.nextInt();
										switch(addon) {
											case 1: milk = 60;
											total = 60 ;												
												break;
											case 2: cream = 75;
											total = 75;
												break;
											case 3: latte = 100;
											total = 100 ;
												break;
										}
										System.out.println("enter the desiered Quantity :");
										quantity = sc.nextInt();
										total = total * quantity;
										break;															
									case 2: // cappuccino
										System.out.println("you have selected cappuccino");
										System.out.println("1. Milk.....80rs");
										System.out.println("2. Cream....90rs");
										System.out.println("3. Latte....125rs");
										System.out.println("enter the Product/Add-on :");
										addon = sc.nextInt();
										switch(addon) {
											case 1: milk = 80;
											total =80;
												break;
											case 2: cream = 90;
											total =90;
												break;
											case 3: latte = 125;
											total =125 ;
												break;
										}
										System.out.println("enter the desiered Quantity :");
										quantity = sc.nextInt();
										total = total * quantity;
										break;
																							
									case 3: //latte
										System.out.println("you have selected latte");
										System.out.println("1. Milk.....100rs");
										System.out.println("2. Cream....125rs");
										System.out.println("3. Latte....150rs");
										System.out.println("enter the Product/Add-on :");
										addon = sc.nextInt();
										switch(addon) {
										case 1: milk = 100;
										total =100 ;
											break;
										case 2: cream = 125;
										total =125 ;
											break;
										case 3: latte = 150;
										total =150 ;
											break;
										}
										System.out.println("enter the desiered Quantity :");
										quantity = sc.nextInt();
										total = total * quantity;
										break;
									case 4:
										System.exit(1);
										break;
																							
									default:
										break;
									}

						System.out.println("");
						System.out.println("Do you want to order anything else (Y/N)");
						again = sc.next();
						if(again.equalsIgnoreCase("Y")) {
							order();
						}else if (again.equalsIgnoreCase("N")) {
							generateBill();
							System.exit(1); 
						}else {
							System.out.println("Invalid Choice");
						}
								
					}
	}
	  public static void main(String args[]) 
	    { 
		  coffeeshop co = new coffeeshop();
		  co.displayMenu();
		  co.order();
	    }
}