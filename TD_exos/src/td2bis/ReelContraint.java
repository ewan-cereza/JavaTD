package td2bis;

public class ReelContraint 
{
	
	public ReelContraint(double min, double max, double val) 
	{
		
		if (min<=max) 
		{
			this.min=min;
			this.max=max;
		}
		
		else 
		{
			this.max=min;
			this.min=max;
			//System.out.println("Valeurs min et max inversees !");
		}
		
		if(val>this.max) 
		{
			this.val = this.max;
			//System.out.println("Valeur mise à la borne max");
		}
		
		else if(val<this.min)
		{
			this.val=this.min;
			//System.out.println("Valeur mise à la borne min");
		}
		
		else
			this.val=val;
	}
	
	public ReelContraint(double min, double max)
	{
		if (min<=max) 
		{
			this.min=min;
			this.max=max;
		}
		
		else 
		{
			this.max=min;
			this.min=max;
			//System.out.println("Valeurs min et max inversees !");
		}
	}

	public double getVal() {return val ; }
	public double getMin() {return min ; }
	public double getMax() {return max ; }
	
	public void setVal(double newVal)
	{
		if(newVal >= min && newVal <= max) val = newVal;
		else
			System.out.println("Valeur" +newVal+ "pas dans l'intervalle ["+min+";"+max+"]");
	}
	
	private final double min, max;
	private double val;
	
}
