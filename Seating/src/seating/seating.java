

import java.util.Scanner;

public class seating {

	public static void main(String[] args) {

	       
		Scanner pam = new Scanner(System.in);

		//Variable declaration
		int[][] seats = {
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },  
				{20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
				{30, 40, 50, 50, 50, 50, 50, 50, 40, 30 },
		               };
		int prices = 0 ;
		
		String choose ;
		
		int row = 0 ;

        int col = 0 ;
        
        
        //method to print seats
        printSeats(seats);

        
        //Prompts user to enter price, location, print, or quit
	       System.out.println("Purchase by (P)rice or (L)ocation, P(R)INT, (Q)uit");
	       choose=pam.nextLine();


        //starting is true till proven otherwise
        boolean starting = true;
		while (starting )
        {

	       
	       
	       //Switch to see which method to use when the user picks which option to use
	       switch (choose)
           {
              case"L":case"l"://location method
              { sellSeatByNumber(seats, row, col);
                  break; }
               case"R":case"r"://print method
              { printSeats(seats);
                  break; }
              case"P":case"p"://price method
              { sellSeatByPrice(seats, prices);
                  break; }
              case"Q":case"q"://terminates
              { System.out.print("See you next time!");
                  return; }
              default:
              { System.out.println("Error: Invalid character."); }//If the user picks anything else besides what is given
           }

           
	       System.out.println();//Blank

	       System.out.println("Purchase by (P)rice or (L)ocation, P(R)INT, (Q)uit");//Keeps asking till the user terminates the program
	       choose=pam.nextLine();
	       }
	       System.out.print("See you next time!");//See ya later ;)
        
        
        }
				
	


	

	
	

		
		
		
		//method that uses for loops to print the seats
		public static void printSeats(int[][] seats)
		{
			//for loop to search the row
			 for (int i = 0; i < seats.length; i++) {
					//for loop to search the column

	             for (int j = 0; j < seats[i].length; j++)
	             {//prints the arrays
	                 System.out.printf("%5d",seats[i][j] );
	             }
	             System.out.println();//blank
			 }
			 	
             System.out.println();//blank


			 
			 
			 
			 
		}

		
		
		
		
		
		
		//method that marks seats based on a given row and seat number from input

		
		public static void sellSeatByPrice(int[][] seats, int prices)

		{
			
			Scanner pam = new Scanner(System.in);
			//do-while that keeps asking for the price till the user enters a valid price
			do {
				//prompts user to enter a price
				  System.out.print("Enter Price (10,20,30,40,50):");
		          prices=pam.nextInt();
		          //if price is not equal to the following numbers then it false
		          if(rightnumber(prices)==false)
		          {
		        	  System.out.println("Error: Price is not listed");//tells them they are wrong
		          }
			}
          while(rightnumber(prices)==false);
            
			boolean chair = false;
			//for loop that looks for the first available price
            for (int i = 0; i < seats.length; i++) {
                if (chair == false) {
                    for (int j = 0; j < seats[i].length; j++) {
                    	//If-Once it finds the price it sets it to zero
                        if (seats[i][j] == prices) {
                            seats[i][j] = 0;
                            chair=true;
                            //Output 
                            //yay they bought a ticket
 	                       System.out.println("Congratulations, you purchased a ticket for $" + prices);

                            break;
                        }

                    }
                
                }
            }
            //method that prints the seats which also displays a zero where the user bought a ticket
            printSeats(seats);

		}

              
		
		
		
			


		 
       
		                  

			//---------------------------------------------------
						

			       //Location method      
		public static void sellSeatByNumber(int[][] seats, int row, int col) {
			
			Scanner pam = new Scanner(System.in);
		//prompts user to enter a row and column
			System.out.println("Please enter the row number of seat (1-10):");
            row = pam.nextInt() - 1;//subtract 1 because arrays start at zero
            System.out.println("Please enter the column number of seat (1-10):");
            col = pam.nextInt() - 1;
            
          

        
			
            boolean chair = false;
            //for loop that search the array for the row and column
            for (int i = 0; i < seats.length; i++) {
                if (chair == false) {
                    for (int j = 0; j < seats[i].length; j++) {
                        if (i == row && j == col && seats[i][j] != 0) {
                            seats[i][j] = 0;
                            chair=true;
                            //output
	                           System.out.println("Congratulations, you purchased a ticket for at: " + row + ", " + col);

                            break;
                        }
	                        

	                           }

                       
                        
                        
	                      
	                        	   
                        }
                }
            //method that prints the seats which also displays a zero where the user bought a ticket

            printSeats(seats);

            }

            	//method that helps see if user is choosing the correct numbers

			public static boolean rightnumber (int prices)
			{

					if(prices==10 || prices==20 || prices==30 || prices==40 || prices==50)
	 
						return true;
	 
					else
	  
						return false;
			
		}


}
