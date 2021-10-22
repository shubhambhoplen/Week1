package Day3;

interface Car {

	public void assemble();
}

class BasicCar implements Car {

	public void assemble() {
		System.out.print("Basic Car.");
	}

}

class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car c){
		this.car=c;
	}
	
	public void assemble() {
		this.car.assemble();
	}

}

class ABSCar extends CarDecorator {
	
	public ABSCar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of ABS feature Car.");
	}
}

class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
}

class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}
}


public class Assignment1 {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		
		System.out.println("\n*****");
		
		Car sportsCar2 = new SportsCar(new ABSCar(new BasicCar()));
		sportsCar2.assemble();
		
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
		
		System.out.println("\n*****");
		
		Car sportsLuxuryCar2 = new SportsCar(new LuxuryCar(new ABSCar(new BasicCar())));
		sportsLuxuryCar2.assemble();
	}

}
