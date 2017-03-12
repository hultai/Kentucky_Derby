package app;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Game implements PlayersObserver, IGame {
	
	private StringProperty players_Rank [] = new SimpleStringProperty [12];
	private IntegerProperty players_Points [] = new SimpleIntegerProperty [12];
	
	
	private List <ISpieler> players;
	private static final int FINISH = 27;
	private int rank;
	private static final int MAX_NUMBER_OF_PLAYERS = 12;
	
	public Game() {
		for (int i = 0; i< MAX_NUMBER_OF_PLAYERS; i++) {
			players_Rank[i] = new SimpleStringProperty ();
			players_Points[i] = new SimpleIntegerProperty();
		}
	}
	
	
	@Override
	synchronized public void update(int spielerID, int points) {
		if (points > FINISH)  {
			points = FINISH;
		}
		
		
		switch (spielerID) {
			case 0: players_Points[0].setValue(points);
					if(points ==FINISH) {
						players_Rank[0].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
						
					}
					break;
					
			case 1: players_Points[1].setValue(points);
					if(points ==FINISH) {
						players_Rank[1].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 2: players_Points[2].setValue(points);
					if(points ==FINISH) {
						players_Rank[2].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 3: players_Points[3].setValue(points);
					if(points ==FINISH) {
						players_Rank[3].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);	
					}
					break;
				
			case 4: players_Points[4].setValue(points);
					if(points ==FINISH) {
						players_Rank[4].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;

			case 5: players_Points[5].setValue(points);
					if(points ==FINISH) {
						players_Rank[5].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 6:	players_Points[6].setValue(points);
					if(points ==FINISH) {
						players_Rank[6].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
					
			case 7: players_Points[7].setValue(points);
					if(points ==FINISH) {
						players_Rank[7].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 8: players_Points[8].setValue(points);
					if(points ==FINISH) {
						players_Rank[8].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 9: players_Points[9].setValue(points);
					if(points ==FINISH) {
						players_Rank[9].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 10: players_Points[10].setValue(points);
					if(points ==FINISH) {
						players_Rank[10].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 11: players_Points[11].setValue(points);
					if(points ==FINISH) {
						players_Rank[11].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
		}
		
		if (rank==players.size()) {
			for (int i = 0; i<12; i++) {
				System.out.println("Pferd Nr " + i + " ,Platz: " +  players_Rank[i] + ", Punkte: " + players_Points[i]);
			}
		}		
		
	}
	
	
	@Override
	public void startRace() {
		for (ISpieler player : players )  {
			player.go();
		}
	}

	@Override
	public void prepareGame(int numberOfPlayers) {
		for (int i = 0; i<MAX_NUMBER_OF_PLAYERS; i++) {
			players_Rank[i].set("");
			players_Points[i].set(0);
		}
		
		rank = 0;
		
		this.players = new ArrayList<>();
		
		for (int i = 0; i <numberOfPlayers; i++) {
			players.add(new Player(i));
		}
		for (ISpieler player : players )  {
			player.setPlayersObserver(this);
			player.setFinish(FINISH);	
		}
	}

	@Override
	public IntegerProperty pointsOfPlayer1() {

		return players_Points [0];
	}

	@Override
	public IntegerProperty pointsOfPlayer2() {

		return players_Points [1];
	}

	@Override
	public IntegerProperty pointsOfPlayer3() {
		return players_Points [2];
	}

	@Override
	public IntegerProperty pointsOfPlayer4() {
		return players_Points [3];
	}

	@Override
	public IntegerProperty pointsOfPlayer5() {
		return players_Points [4];
	}

	@Override
	public IntegerProperty pointsOfPlayer6() {
		return players_Points [5];
	}

	@Override
	public IntegerProperty pointsOfPlayer7() {
		return players_Points [6];
	}

	@Override
	public IntegerProperty pointsOfPlayer8() {
		return players_Points [7];
	}

	@Override
	public IntegerProperty pointsOfPlayer9() {
		return players_Points [8];
	}

	@Override
	public IntegerProperty pointsOfPlayer10() {
		return players_Points [9];
	}

	@Override
	public IntegerProperty pointsOfPlayer11() {
		return players_Points [10];
	}

	@Override
	public IntegerProperty pointsOfPlayer12() {
		return players_Points [11];
	}

	@Override
	public StringProperty RankOfPlayer1() {
		return players_Rank [0];
	}

	@Override
	public StringProperty RankOfPlayer2() {
		return players_Rank [1];
	}

	@Override
	public StringProperty RankOfPlayer3() {
		return players_Rank [2];
	}

	@Override
	public StringProperty RankOfPlayer4() {
		return players_Rank [3];
	}

	@Override
	public StringProperty RankOfPlayer5() {
		return players_Rank [4];
	}

	@Override
	public StringProperty RankOfPlayer6() {
		return players_Rank [5];
	}

	@Override
	public StringProperty RankOfPlayer7() {
		return players_Rank [6];
	}

	@Override
	public StringProperty RankOfPlayer8() {
		return players_Rank [7];
	}

	@Override
	public StringProperty RankOfPlayer9() {
		return players_Rank [8];
	}

	@Override
	public StringProperty RankOfPlayer10() {
		return players_Rank [9];
	}

	@Override
	public StringProperty RankOfPlayer11() {
		return players_Rank [10];
	}

	@Override
	public StringProperty RankOfPlayer12() {
		return players_Rank [11];
	}	
}