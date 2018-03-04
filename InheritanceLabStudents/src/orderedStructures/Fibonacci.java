package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
		if(!firstvaluetest)
		
			throw new IllegalStateException("First value hasnt been called.");
		
			double temporal = current;
			current = prev + current;
			prev = temporal;
        // add the necessary code here
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}
	@Override
	public boolean equals(Progression o) {
		if(this.toString().equals(o.toString())) {
			return true;
		}
		return false;
	}
}
