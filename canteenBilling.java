/*****
program no:7
program name: canteen billing.java
Author:Asif
DAte:8-7-2025
********/


import java.util.Scanner;
public class CanteenBilling
{
   //instance variable
   double customerBill = 0;
   static double totalSales=0;
   //Programs actual logic to calculate each cutomer's bill and total sales 
   public void processBill()
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of items:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
             System.out.print("enter the item name "+ i + ":");
             String item_name=sc.next();
             System.out.print("Enter The item price "+ i +":");
             double item_price=sc.nextDouble();
             
             double discount = 0;
             if(item_price > 500)
             {
                 discount = item_price*0.05;

             }  double final_price=item_price - discount;
		customerBill += final_price;
		System.out.println("Final price of" +item_name+" :"+final_price);

          }
           System.out.println("The Total customer BIll of the day is"+customerBill);
           totalSales+= customerBill;
}

   public static void main(String args[])
   {
       Scanner console=new Scanner(System.in);
       CanteenBilling customer=new CanteenBilling();
       String choice;
       do
       {
             System.out.println("Next customer(Yes/No)");
             choice=console.next();
             customer.processBill();
       }while(choice.equalsIgnoreCase("No"));
       System.out.println("Total sales for the day Rs:"+totalSales);
    }
}