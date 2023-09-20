/*
* Title Assessment: Lab02
* Student Name: Andres Camilo Porras Becerra
* Due Date: 24 Sep
* Description: This class count the number of clicks from a Button
* Professor Name: Islam Gomaa
* Course CST8284 Section 331
*/

/**
 * This program prints a table of medal winner counts with row totals.
 * @author Andres Porras
 * @version 1.0
*/
public class Medals
{
	/**
	 * This program prints a table of medal winner counts with row totals.
	 */
   public static void main(String[] args)
   {
	  /*
	   * Variable for saving the number of countries that will be display
	   */
      final int COUNTRIES = 8;
      /*
	   * Variable for saving the number of types of medals that will be display
	   */
      final int MEDALS = 3;
      /*
	   * Array for saving the countries
	   */
      String[] countries =
         {
            "Canada",
            "Italy",
            "Germany",
            "Japan",
            "Kazakhstan",
            "Russia",
            "South Korea",
            "United States"
         };
      /*
   	   * Array for saving the medals for country
   	   */
      int[][] counts =
         {
            { 0, 3, 0 },
            { 0, 0, 1 },
            { 0, 0, 1 },
            { 1, 0, 0 },
            { 0, 0, 1 },
            { 3, 1, 1 },
            { 0, 1, 0 },
            { 1, 0, 1 }
         };
      /*
   	   * Array for saving the total of medals by type
   	   */
      //Extra - To DO: define an array of size 3 to hold the total for each column. 
      int[] totalMedals = new int[MEDALS];
      
      System.out.println("        Country    Gold  Silver  Bronze   Total");
      
      // Print countries, counts, and row totals
      for (int i = 0; i < COUNTRIES; i++)
      {
         // Process the ith row
    	  //TO DO: Use printf() to print country name as a field of 15 bytes as a String value:
         System.out.printf("%15s",countries[i]);

         int total = 0; //Variable for saving the total of medals by country

         // Print each row element and update the row total
         for (int j = 0; j < MEDALS; j++)
         {
            System.out.printf("%8d", counts[i][j]);
            
            //To DO: calculate the total for each row
           total = total + counts[i][j];
           //Here we save in the variable totalMedals the total of medals by type
           totalMedals [j]+=counts[i][j];
         }
         
         // Display the row total and print a new line
         //To Do: use printf() to print  total for each row as a field of size 8 and numeric data type. Include newline after printing each value
          System.out.printf("%8d%n",total);
      }
      
      //Modify the above code to keep total for each medal type, and then use a for loop to print total line below
      System.out.printf("%15s","Total");
      for(int i = 0; i < totalMedals.length;i++)
      {   
    	  System.out.printf("%8d",totalMedals[i]);
      }
   }
}

