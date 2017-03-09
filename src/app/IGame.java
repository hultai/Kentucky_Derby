package app;

import java.util.List;

import javafx.beans.property.IntegerProperty;

public interface IGame {
	void prepareGame(int numberOfPlayers);
	void startRace();
	IntegerProperty pointsOfPlayer1 ();
	IntegerProperty pointsOfPlayer2 ();
	IntegerProperty pointsOfPlayer3 ();
	IntegerProperty pointsOfPlayer4 ();
	IntegerProperty pointsOfPlayer5 ();
	IntegerProperty pointsOfPlayer6 ();
	IntegerProperty pointsOfPlayer7 ();
	IntegerProperty pointsOfPlayer8 ();
	IntegerProperty pointsOfPlayer9 ();
	IntegerProperty pointsOfPlayer10 ();
	IntegerProperty pointsOfPlayer11 ();
	IntegerProperty pointsOfPlayer12 ();
	
}
