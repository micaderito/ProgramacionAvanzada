package piratasSaludables;

public class Saludable implements Estado {
	
	private int cantGrog;
	
	public Saludable() {
		cantGrog = 0;
	}

	@Override
	public Estado beberGrog(Pirata jack) {
		
		return null;
	}

	@Override
	public Estado beberJugo(Pirata jack) {
		cantGrog = 0;
		//if(jack.verEstado() == )
		return null;
	}

	@Override
	public int atacar(Pirata jack, Pirata will) {
		// TODO Auto-generated method stub
		return 0;
	}

}
