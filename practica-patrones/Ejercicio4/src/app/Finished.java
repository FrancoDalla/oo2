package app;

public class Finished extends Estado{

	public Finished(int tiempo) {
		super(tiempo, "Finished");
	}
	@Override
	public Estado start() {
		return null;
	}

	@Override
	public Estado togglePause() {
		return null;
	}

	@Override
	public boolean addComment() {
		return false;		
	}
	
	@Override
	public Estado finish() {
		return null;
	}
	
}
