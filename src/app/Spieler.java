package app;
import java.util.Random;

public class Spieler extends Thread implements ISpieler {
	private int finish = 27;
	private static int lfdnr = 0;
	private int id;
	PlayersObserver playersBeobachter;
	Random random;
	
	public Spieler () {
		this.id = lfdnr++;
		System.out.println("INITIALISIERUNG, ID: " + this.id);
		random = new Random();
	}
	
//	public Spieler (PlayersObserver playersBeobachter) {
//		this.playersBeobachter = playersBeobachter;
//	}
	
	@Override
	public void setPlayersObserver(PlayersObserver playersBeobachter) {
		this.playersBeobachter = playersBeobachter;
		
	}
	
	@Override
	public void setFinish(int finish) {
		this.finish = finish;
	}
	
	
	@Override
	public int getID() {
		return this.id;
	}

	@Override
	public void go() {
		this.start();
	}
	
	@Override
	public void run() {
		int points = 0;
		while (points<finish) {
			points+= throwDice();
			// System.out.println("Test, run(), myID " + this.id + "points " + points);
			playersBeobachter.update(this.id, points);
			yield();
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	
	private int throwDice() {
		return random.nextInt(4);
	}


	
	

}
