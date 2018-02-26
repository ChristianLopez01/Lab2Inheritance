package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		current = current + commonDifference; 
		return current;
	}
	@Override
	public String toString(){
		
		int e = (int) this.firstValue();
		int s = (int) this.commonDifference;
		String r = "Arith" +'('+ e +','+ s +')';
		return r;
		
	}
}
