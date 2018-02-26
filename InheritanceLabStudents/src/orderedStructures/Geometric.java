package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		current = current * commonFactor; 
		return current;
	}

	@Override
	public String toString(){
		
		int e = (int) this.firstValue();
		int s = (int) this.commonFactor;
		String r = "Geom" +'('+ e +','+ s +')';
		return r;
		
	
	}
}