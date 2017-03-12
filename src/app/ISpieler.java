package app;

public interface ISpieler {
	int getID();	
	void go();
	void setPlayersObserver(PlayersObserver playersBeobachter);
	void setFinish(int finish);
}
