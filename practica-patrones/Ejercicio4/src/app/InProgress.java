package app;

public class InProgress extends Estado{

	public InProgress(int tiempo) {
		super(tiempo, "In progress");
	}
	
	@Override
	public Estado start() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado togglePause() {
		return new Paused(tiempo);
	}



	@Override
	public boolean addComment() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Estado finish() {
		// TODO Auto-generated method stub
		return new Finished(tiempo);
	}

}
