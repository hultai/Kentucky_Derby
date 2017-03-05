import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ISpieler> players = new ArrayList<>();
		
		for (int i = 0; i <12; i++) {
			players.add(new Spieler());
		}
		
		Spiel spiel = new Spiel (players);
		spiel.startRace();
	
	}

}
