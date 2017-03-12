package app;
import java.util.Random;

public class Player extends Thread implements ISpieler {
	private int finish;
	private int id;
	PlayersObserver playersBeobachter;
	Random random;
	
	public Player (int id) {
		this.id = id;
		System.out.println("INITIALISIERUNG, ID: " + this.id);
		random = new Random();
	}
	

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
			playersBeobachter.update(this.id, points);
			try {
				sleep(80);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	private int throwDice() {
		return random.nextInt(4);
	}
}
