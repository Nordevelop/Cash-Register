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
	public void input_Id(int e)
	{
		this.id=e;
	}
	public void input_Description(String f)
	{
		this.descripcion=f;
	}
	public void input_Prize(int g)
	{
		this.precio=g;
	}
	public void input_Quantity(int h)
	{
		this.quantity=h;
	}
	public void input_Subtotal(int m)
	{
		this.subtotal=m;
	
	public Deliver (int e, String f, int g, int h, int m) //Builder Clas
	{ 
		/*objects  with allowed access i Class Main()
		*
		*/
		this.id=e;
		this.descripcion=f;
		this.precio=g;
		this.cantidad=h;
		this.subtotal=m;
	}// End Builder Class
}
		
