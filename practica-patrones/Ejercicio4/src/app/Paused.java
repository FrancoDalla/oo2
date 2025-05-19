package app;

public class Paused extends Estado{
	public Paused(int tiempo) {
		super(tiempo, "Paused");
		
	}

	@Override
	public Estado start() {	
		return null;
	}

	@Override
	public Estado togglePause() {
		return new InProgress(tiempo);
	}

	@Override
	public boolean addComment() {
		return true;
		
	}

	@Override
	public Estado finish() {
		// TODO Auto-generated method stub
		return new Finished(tiempo);
	}
}
