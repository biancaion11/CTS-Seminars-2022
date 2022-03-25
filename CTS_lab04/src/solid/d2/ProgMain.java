package solid.d2;

public class ProgMain {

	public static void main(String[] args) {
	
		Calculator c= new Calculator();
		SubstractNumbers substractNumbers=new SubstractNumbers();
		Calculator.calculate(10, 15, substractNumbers);

	}

}
