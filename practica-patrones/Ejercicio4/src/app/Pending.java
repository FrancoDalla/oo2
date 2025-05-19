package app;

public class Pending extends Estado{

	public Pending() {
		super(0, "Pending");
	}
	
	@Override
	public Estado start() {
		return new InProgress(tiempo);
	}

	@Override
	public Estado togglePause() {
		return null;
	}

	@Override
	public boolean addComment() {
		return true;
	}

	@Override
	public Estado finish() {
		// TODO Auto-generated method stub
		return null;
	}

}
