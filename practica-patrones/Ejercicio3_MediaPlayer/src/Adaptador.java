
public class Adaptador extends Media{
	private VideoStream adaptee;
	
	public Adaptador() {
		adaptee = new VideoStream();
	}

	@Override
	public void play() {
		adaptee.reproduce();
		
	}
	
}
