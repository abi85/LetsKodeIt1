
public class ClassDemo {

	public static void main(String[] args) {

		ClassDemo d1 = new ClassDemo();

		String str1 = "Hello Java";
		System.out.println(str1);

		// for(int i= 0; i < args.length; i++){
		// System.out.println(args[i]);
		System.out.println("*****************************");
		CarClass c1 = new CarClass();
		CarClass c2 = new CarClass();
		// c1.year= 2015;
		c2.model = "Saloon";

		System.out.println(c1.year);
		System.out.println(c2.model);
		System.out.println(c1.getYear());
		System.out.println(c1.getModel());

	}
}

// }

class CarClass {
	int year = 2000;
	String model;

	public int getYear() {
		return this.year;
	}

	public String getModel() {
		return this.model;

	}
}