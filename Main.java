import java.util.InputMismatchException; 
/*
 *  exception to add numbers as char
 */

import java.util.*;


public class Main {

	public static void main(String[] args) {
		/*
		 * author Nordevelop
		 * program Cash register
		 * class Main, deliver,admin
		 */
		Scanner enter = new Scanner (System.in); //capture buffer of keyboard
		Deliver cla= null; //Class Deliver
    		int id;
		String description;
		int prize=0;
		int quantity = 0;
		int subtotal=0;
		int total=0;
  		  ArrayList<Deliver> List = new ArrayList<Deliver>();
   		   System.out.println("Enter an ID or zero to end: ");
		      id=enter.nextInt();
		   ArrayList<Registro> List = null;
		 while (id !=0)
		   {
			   System.out.println("Input Description off Product: ");
			     description = enter.next();
			     
			     cla= new Deliver(id,description,prize,quantity,subtotal); 
			     System.out.println("input Prize off product: ");
			          prize= enter.nextInt();
			      System.out.println("input Quantities to carry: ");    
			          quantity=enter.nextInt();
			 	   /*Add values entered x keyboard.- 
				   *-in their respective objects of the class
				   */
				  cla.Input_Id(id);    
			          cla.Input_Description(description);                     
			          cla.Input_Prize(prize);
			          cla.Input_Quantify(quantify);
			          subtotal = prize * quantity;
			          cla.ponerSubtotal(subtotal);
			          List.add(cla); // input data into off Array de objects
			            System.out.println("Enter an ID or zero to end: ");
		 		     id=enter.nextInt();
				          total= total +subtotal;
			   for (Registro c:Lista) //For each
			   System.out.println("ID off product: "+"||"+ c.Assign_Id()+"||"+"description off product: " + c.Assign_Description()+  "||"+ "price off product: "+ c.Assign_Prize()+"$"+"||"+"Quantify: "+c.Assign_Qantify()+"||"+"Subtotal:"+c.Assign_Subtotal());
		   
		   System.out.println("********************************************************************************************************************************************************************************************************************");
		   System.out.println(" Total a Cash is: "+total+"$");	   

	}
		
   
}
