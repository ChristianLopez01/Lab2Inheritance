package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		if(!firstvaluetest)
		
			throw new IllegalStateException("First value hasnt been called.");
		
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
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = this.firstValue() + (n-1)* commonDifference;
		return value; 
	}
}
