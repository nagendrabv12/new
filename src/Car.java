
public class Car {
	private Iengine eng;
	
	public Car(Iengine eng) {
		this.eng=eng;
	}
	
	public void drive() {
		int status=eng.start();
		if(status>=1) {
			System.out.print("jouney started");
		}
	}

}
