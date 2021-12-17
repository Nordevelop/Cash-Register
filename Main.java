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
				  cla.input_Id(id);    
			          cla.input_Description(description);                     
			          cla.input_Prize(prize);
			          cla.input_Quantify(quantify);
			          subtotal = prize * quantity;
			          cla.input_Subtotal(subtotal);
			          List.add(cla); // input data into off Array de objects
			            System.out.println("Enter an ID or zero to end: ");
		 		     id=enter.nextInt();
				          total= total +subtotal;
			   for (Registro c:List) //For each
			   System.out.println("ID off product: "+"||"+ c.assign_Id()+"||"+"description off product: " + c.assign_Description()+  "||"+ "price off product: "+ c.assign_Prize()+"$"+"||"+"Quantify: "+c.assign_Qantify()+"||"+"Subtotal:"+c.assign_Subtotal());
		   
		   System.out.println("********************************************************************************************************************************************************************************************************************");
		   System.out.println(" Total a Cash is: "+total+"$");	   

	}
		
   
}
