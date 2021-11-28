import java.util.*;

public class Deliver {
    /*
    *objects of class Deliver emcapsulated.with Access Denied in class Main()
    *@Author Nordevelop
    *Cash Register
    */ 
     	private int id;              
	private String description;
	private int prize;
	private int quantity;
	private int subtotal;
  //private String nombre_cliente;
        public int assign_Id()
	{
		return this.id;
	}
	public String assign_Description()  //metodo 
	{
		return this.description;
	}
	public int assign_Prize()
	{
		return this.prize;
		
	}
	public int assign_Quantity()
	{
		return this.quantity;
	}
	public int assign_Subtotal()
	{
		return this.subtotal;
	}
}
