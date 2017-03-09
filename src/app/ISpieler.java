package app;
// // // test
public interface ISpieler {

	int getID();
	// void setSpielerBeobachter(); Beobachter im Konstruktor setzen
	
	void go();
	
	void setPlayersObserver(PlayersObserver playersBeobachter);
	
	void setFinish(int finish);

}
