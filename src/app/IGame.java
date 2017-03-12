package app;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

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
	
	StringProperty RankOfPlayer1 ();
	StringProperty RankOfPlayer2 ();
	StringProperty RankOfPlayer3 ();
	StringProperty RankOfPlayer4 ();
	StringProperty RankOfPlayer5 ();
	StringProperty RankOfPlayer6 ();
	StringProperty RankOfPlayer7 ();
	StringProperty RankOfPlayer8 ();
	StringProperty RankOfPlayer9 ();
	StringProperty RankOfPlayer10 ();
	StringProperty RankOfPlayer11 ();
	StringProperty RankOfPlayer12 ();
}
