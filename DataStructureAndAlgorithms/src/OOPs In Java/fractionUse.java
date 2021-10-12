


public class fractionUse {

	public static void main(String[] args) {
		fraction f1 = new fraction(50, 40);
		fraction f2 = new fraction(30, 20);
		fraction f3 = new fraction(8, 6);
		f1.print();
		f2.print();
		f3.print();
		
		System.out.println(f1.getNumerator());
		System.out.println(f1.getDenominator());
		
		f2.setNumerator(1);
		f2.setDenominator(2);
		f2.print();
		
		f1.add(f2);
		
		f1.print();
		
		f2.multiply(f3);
		f2.print();
		
		f3 = fraction.add(f1,f2);
		
		f3.print();

	}

}
