package VMachine;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Vending {


	public static void main(String[] args) {
	
//---------MELVIN------------------------------------------------------------------
		
		System.out.println("**************************************************");
	 	System.out.println("*******   WELCOME TO THE VENDING MACHINE   *******");
	 	System.out.println("**************************************************");
	 	System.out.println("==================================================");
	 	
	 	Scanner firstOption = new Scanner(System.in);
			System.out.println(" Do you want to see the products we offer? ");
			String firstSel = firstOption.nextLine();

			if (firstSel.equalsIgnoreCase("yes")|(firstSel.equalsIgnoreCase("Y")) ) { 
		
			 	ItemsVending[] vendingItem;
			 	vendingItem = runMenu();
			   
				System.out.println();
				Scanner myOption = new Scanner(System.in);
				System.out.println("PLEASE SELECT THE OPTION YOU WANT TO BUY? ");
				String option = myOption.nextLine();
				float option1 =0;
				
				for (ItemsVending Bev : vendingItem) {
					if (option.equalsIgnoreCase(Bev.name)|(option.equalsIgnoreCase(Bev.location)) ) { 
						option = Bev.name;
						option1 = Bev.price;
					}	 
				}	
				
				System.out.println();
				Scanner payment = new Scanner(System.in);
				System.out.println("PLEASE ENTER YOUR PAYMENT");
				String paymentGiven = payment.nextLine();
				
				double payEntered = Double.parseDouble(paymentGiven);
//*******************************************************************************BUKOLA ****************************************				
			
				System.out.println("The Item you Selected is: "+option);
				System.out.println("The Price: "+ NumberFormat.getCurrencyInstance(new Locale("en", "US"))
				        .format(option1));
			
				System.out.println("The Payment Amount is : "+ NumberFormat.getCurrencyInstance(new Locale("en", "US"))
		        .format(payEntered));
				if (payEntered <=5) {
				Random rand = new Random();
				float Desc = rand.nextFloat();
						
				float PriceD = (option1*Desc) - (float) 0.50;
			
				System.out.println("Your discount for being a loyal customer is : "+ NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(PriceD));
				
				float finalp=option1-PriceD;
				System.out.println("Your Price with the discount applied is : "+ NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(finalp));
				
			    option1 = option1 - PriceD;
				if (payEntered > option1)		{		
					double qtyReturn = payEntered-option1;
					System.out.println("Here is your change : "+NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(qtyReturn));
				}
				else {
				 System.out.println("There is not enought Credit to buy the item");
				 
				}
				}
				else
					System.out.println("Unfortunaly we can't take bills greater than $ 5.0 USD ");
			 
		}
	 	else 
	 	  if ((firstSel.equalsIgnoreCase("no"))|(firstSel.equalsIgnoreCase("N"))) {
	 		 System.out.println("We appreciate your visit! ");
	 		}		
		
		 	 	
	}
		
	

	public static ItemsVending[] runMenu(){
	 
	 	ItemsVending[] items = {new ItemsVending(),new ItemsVending(),new ItemsVending(), new ItemsVending(),new ItemsVending(),new ItemsVending(),new ItemsVending(), new ItemsVending(),new ItemsVending(),new ItemsVending(),new ItemsVending(), new ItemsVending()};
	 	
	 	items[0].name = "COKE";
	 	items[0].location = "A1";
	 	
	 	items[1].name = "DIET COKE";
	 	items[1].location = "A2";
	 	
	 	items[2].name = "SPRITE";
	  	items[2].location = "A3";
	 	
	 	items[3].name = "WATER";
	  	items[3].location = "A4";
	  	
	  	items[4].name = "CHEETOS";
	 	items[4].location = "B1";
	 	
	 	items[5].name = "FRITOS";
	 	items[5].location = "B2";
	 	
	 	items[6].name = "LAYS";
	  	items[6].location = "B3";
	 	
	 	items[7].name = "DORITOS";
	  	items[7].location = "B4";
	  	
	  	items[8].name = "TRIX";
	 	items[8].location = "C1";
	 	
	 	items[9].name = "GUMMY BEARS";
	 	items[9].location = "C2";
	 	
	 	items[10].name = "SUNNY D";
	  	items[10].location = "C3";
	 	
	 	items[11].name = "M&M";
	  	items[11].location = "C4";
	  	
	  	
	 	
	 	float price = 0;
		String test = "";
		DecimalFormat df = new DecimalFormat("#.##");
				
		for (ItemsVending sodas : items) {
			
			Random rand = new Random();
			price = 1 + (rand.nextFloat()*4);
			test = df.format(price);		
			price = Float.parseFloat(test);
			sodas.price = price;
		}		
		
		
			System.out.println("**************************************************");
		 	System.out.println("*******   WELCOME TO THE VENDING MACHINE   *******");
		 	System.out.println("**************************************************");
		 	System.out.println("==================================================");
		 	System.out.println("|         |             |           |            |");
		 	System.out.println("|  "+items[0].name+"   |  "+items[1].name+"  |   "+items[2].name+"  |    "+items[3].name+"   |");
		 	System.out.println("|  $"+String.format("%.2f", items[0].price)+"  |    $"+String.format("%.2f", items[1].price)+"    |   $"+String.format("%.2f", items[2].price)+"   |    $"+String.format("%.2f", items[3].price)+"   |");
		 	System.out.println("|   "+items[0].location+"    |      "+items[1].location+"     |     "+items[2].location+"    |      "+items[3].location+"    |"); 	
		 	System.out.println("==================================================");
		 	System.out.println("|         |             |           |            |");
		 	System.out.println("| "+items[4].name+" |   "+items[5].name+"    |    "+items[6].name+"   |   "+items[7].name+"  |");
		 	System.out.println("|  $"+String.format("%.2f", items[4].price)+"  |    $"+String.format("%.2f", items[5].price)+"    |   $"+String.format("%.2f", items[6].price)+"   |    $"+String.format("%.2f", items[7].price)+"   |");
		 	System.out.println("|   "+items[4].location+"    |      "+items[5].location+"     |     "+items[6].location+"    |      "+items[7].location+"    |");
		 	System.out.println("==================================================");
		 	System.out.println("|         |             |           |            |");
		 	System.out.println("| "+items[8].name+"    | "+items[9].name+" |  "+items[10].name+"  |    "+items[11].name+"     |");
		 	System.out.println("|  $"+String.format("%.2f", items[8].price)+"  |    $"+String.format("%.2f", items[9].price)+"    |   $"+String.format("%.2f", items[10].price)+"   |    $"+String.format("%.2f", items[11].price)+"   |");
		 	System.out.println("|   "+items[8].location+"    |      "+items[9].location+"     |     "+items[10].location+"    |      "+items[11].location+"    |");
		 	System.out.println("==================================================");
		 	

		return items; 
	
	}
	
	
}
