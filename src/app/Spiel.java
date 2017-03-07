package app;
import java.util.List;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Spiel implements PlayersObserver {

//	private StringProperty horse1_Points = new SimpleStringProperty();
//	private StringProperty horse2_Points = new SimpleStringProperty();
//	private StringProperty horse3_Points = new SimpleStringProperty();
//	private StringProperty horse4_Points = new SimpleStringProperty();
//	private StringProperty horse5_Points = new SimpleStringProperty();
//	private StringProperty horse6_Points = new SimpleStringProperty();
//	private StringProperty horse7_Points = new SimpleStringProperty();
//	private StringProperty horse8_Points = new SimpleStringProperty();
//	private StringProperty horse9_Points = new SimpleStringProperty();
//	private StringProperty horse10_Points = new SimpleStringProperty();
//	private StringProperty horse11_Points = new SimpleStringProperty();
//	private StringProperty horse12_Points = new SimpleStringProperty();
//	
//	private StringProperty horse1_Rank = new SimpleStringProperty();
//	private StringProperty horse2_Rank = new SimpleStringProperty();
//	private StringProperty horse3_Rank = new SimpleStringProperty();
//	private StringProperty horse4_Rank = new SimpleStringProperty();
//	private StringProperty horse5_Rank = new SimpleStringProperty();
//	private StringProperty horse6_Rank = new SimpleStringProperty();
//	private StringProperty horse7_Rank = new SimpleStringProperty();
//	private StringProperty horse8_Rank = new SimpleStringProperty();
//	private StringProperty horse9_Rank = new SimpleStringProperty();
//	private StringProperty horse10_Rank = new SimpleStringProperty();
//	private StringProperty horse11_Rank = new SimpleStringProperty();
//	private StringProperty horse12_Rank = new SimpleStringProperty();
	
	private StringProperty horses_Rank [] = new SimpleStringProperty [12];
	private IntegerProperty horses_Points [] = new SimpleIntegerProperty [12];
	
	
	private List <ISpieler> players;
	private static final int FINISH = 27;
	private int rank;
	
	public Spiel(List <ISpieler> players) {
		for (int i = 0; i<12; i++) {
			horses_Rank[i] = new SimpleStringProperty ();
			horses_Points[i] = new SimpleIntegerProperty();
		}
		
		
		rank = 0;
		this.players = players;
		for (ISpieler player : players )  {
			player.setPlayersObserver(this);
			player.setFinish(FINISH);	
		}
	}
	
	
	@Override
	synchronized public void update(int spielerID, int points) {
		// System.out.println("update(), SpielerID: " + spielerID + " Punkte " + points);
		if (points > FINISH)  {
			points = FINISH;
		}
		
		
		switch (spielerID) {
			case 0: horses_Points[0].setValue(points);
					if(points ==FINISH) {
						horses_Rank[0].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
						
					}
					break;
					
			case 1: horses_Points[1].setValue(points);
					if(points ==FINISH) {
						horses_Rank[1].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 2: horses_Points[2].setValue(points);
					if(points ==FINISH) {
						horses_Rank[2].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 3: horses_Points[3].setValue(points);
					if(points ==FINISH) {
						horses_Rank[3].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);	
					}
					break;
				
			case 4: horses_Points[4].setValue(points);
					if(points ==FINISH) {
						horses_Rank[4].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;

			case 5: horses_Points[5].setValue(points);
					if(points ==FINISH) {
						horses_Rank[5].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 6:	horses_Points[6].setValue(points);
					if(points ==FINISH) {
						horses_Rank[6].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
					
			case 7: horses_Points[7].setValue(points);
					if(points ==FINISH) {
						horses_Rank[7].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 8: horses_Points[8].setValue(points);
					if(points ==FINISH) {
						horses_Rank[8].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 9: horses_Points[9].setValue(points);
					if(points ==FINISH) {
						horses_Rank[9].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 10: horses_Points[10].setValue(points);
					if(points ==FINISH) {
						horses_Rank[10].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
					
			case 11: horses_Points[11].setValue(points);
					if(points ==FINISH) {
						horses_Rank[11].setValue(String.valueOf(++rank));
						System.out.println("FINISH!!, ID: " + spielerID + " RANK: " + rank);
					}
					break;
		}
		
		// TEST AM ENDE
		if (rank==12) {
			for (int i = 0; i<12; i++) {
				System.out.println("Pferd Nr " + i + " ,Platz: " +  horses_Rank[i] + ", Punkte: " + horses_Points[i]);
			}
		}
		
//		switch (spielerID) {
//			case 1: horse1_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse1_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//					
//			case 2: horse2_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse2_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//			
//			case 3: horse3_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse3_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//					
//			case 4: horse4_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse4_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//			
//			case 5: horse5_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse5_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//			
//			case 6: horse6_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse6_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//
//			case 7: horse7_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse7_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//				
//			case 8: horse8_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse8_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//				
//			case 9: horse9_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse9_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//				
//			case 10: horse10_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse10_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//				
//			case 11: horse11_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse11_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//				
//			case 12: horse12_Points.setValue(String.valueOf(points));
//					if(points ==FINISH) {
//						horse12_Rank.setValue(String.valueOf(++rank)); 	
//					}
//					break;
//		}
		
		
	}
	
	
	// @Override in interface IModel
	public void startRace() {
		for (ISpieler player : players )  {
			player.go();
		}
	}
	
	

}
