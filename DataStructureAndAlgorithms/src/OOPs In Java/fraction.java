

public class fraction {
	private int numerator;
    private	int denominator;
	
    public fraction(int numerator, int denominator) {
    	this.numerator = numerator; 
//    	if(denominator == 0 )
//    		// error out 
    	this.denominator  = denominator;
    	
    	simplify();
    }
    
    public void setNumerator(int numerator){
    	this.numerator = numerator;
    	simplify();
    }
	
    public void setDenominator(int denominator) {
//    	if(denominator == 0)
//    		// error out 
    	this.denominator = denominator;
    	simplify();
    }
    
    public int getNumerator() {
    	return numerator;
    }
    
    public int getDenominator() {
    	return denominator;
    }
    
    private void simplify() {
    	int gcd = 1;
    	
    	int smaller = Math.min(numerator, denominator);
    	for(int i=2; i<=smaller; i++) {
    		if((numerator%i == 0) && (denominator%i == 0))
   			 gcd = i;
    	}
    	numerator = numerator/gcd;
    	denominator = denominator/gcd ;
    }
    
    public void print() {
    	simplify();
    	if(denominator == 1)
    		 System.out.println(numerator);
    	else
    		System.out.println(numerator + "/" + denominator);
    }
    
    public void add(fraction f) {
    	this.numerator = this.numerator*f.denominator + this.denominator*f.numerator;
    	this.denominator = this.denominator*f.denominator;
    	simplify();
    }
    
    public void multiply(fraction f) {
    	this.numerator *= f.numerator;
    	this.denominator *= f.denominator;
    	simplify();
    }
    
    public static fraction add(fraction f1, fraction f2) {
    	int a = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
    	int b = f1.denominator*f2.denominator;
    	fraction f = new fraction(a,b);
    	return f;
    }
	
}
