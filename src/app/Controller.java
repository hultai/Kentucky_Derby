package app;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller {


	  @FXML
	  ImageView horse1, horse2, horse3, horse4, horse5, horse6, 
	  			horse7, horse8, horse9, horse10, horse11, horse12;
	  
	 
	  @FXML
	  Text rankOfHorse1, rankOfHorse2, rankOfHorse3, rankOfHorse4, rankOfHorse5, rankOfHorse6,
	  	   rankOfHorse7, rankOfHorse8, rankOfHorse9, rankOfHorse10, rankOfHorse11, rankOfHorse12;
	  
	  @FXML
	  ChoiceBox<Integer> choiceBoxNumberOfPlayer;
	  
	  IGame game;
	  
	  private double imgViewWidth;
	  
	  private Double startXCoordinate;
	  	  
	  public Controller () {
		  game = new Game();
		  
	  }
	  
	  @FXML
	  public void initialize() {
		  startXCoordinate = horse1.getX();
		  imgViewWidth = horse1.getFitWidth();
		  
		  choiceBoxNumberOfPlayer.setItems(FXCollections.observableArrayList(2,3,4,5,6,7,8,9,10,11,12));
		  choiceBoxNumberOfPlayer.getSelectionModel().select(10);

	  }
	  
	  @FXML
	    private void startRennen() {
		  unbindXProperties();
		  moveToStart();
		  int numberOfPlayers = choiceBoxNumberOfPlayer.getValue();
		  game.prepareGame(numberOfPlayers);
		  bindXProperties();
		  game.startRace();
	  }
	  
	  private void bindXProperties() {
		  horse1.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer1()));
		  horse2.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer2()));
		  horse3.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer3()));
		  horse4.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer4()));
		  horse5.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer5()));
		  horse6.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer6()));
		  horse7.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer7()));
		  horse8.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer8()));
		  horse9.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer9()));
		  horse10.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer10()));
		  horse11.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer11()));
		  horse12.xProperty().bind(Bindings.multiply(imgViewWidth, game.pointsOfPlayer12()));
		  
		  rankOfHorse1.textProperty().bind(game.RankOfPlayer1());
		  rankOfHorse2.textProperty().bind(game.RankOfPlayer2());
		  rankOfHorse3.textProperty().bind(game.RankOfPlayer3());
		  rankOfHorse4.textProperty().bind(game.RankOfPlayer4());
		  rankOfHorse5.textProperty().bind(game.RankOfPlayer5());
		  rankOfHorse6.textProperty().bind(game.RankOfPlayer6());
		  rankOfHorse7.textProperty().bind(game.RankOfPlayer7());
		  rankOfHorse8.textProperty().bind(game.RankOfPlayer8());
		  rankOfHorse9.textProperty().bind(game.RankOfPlayer9());
		  rankOfHorse10.textProperty().bind(game.RankOfPlayer10());
		  rankOfHorse11.textProperty().bind(game.RankOfPlayer11());
		  rankOfHorse12.textProperty().bind(game.RankOfPlayer12());
	  }
	  
	  private void moveToStart() {
		  horse1.setX(startXCoordinate);
		  horse2.setX(startXCoordinate);
		  horse3.setX(startXCoordinate);
		  horse4.setX(startXCoordinate);
		  horse5.setX(startXCoordinate);
		  horse6.setX(startXCoordinate);
		  horse7.setX(startXCoordinate);
		  horse8.setX(startXCoordinate);
		  horse9.setX(startXCoordinate);
		  horse10.setX(startXCoordinate);
		  horse11.setX(startXCoordinate);
		  horse12.setX(startXCoordinate);

	  }
	
	  private void unbindXProperties() {
		  horse1.xProperty().unbind();
		  horse2.xProperty().unbind();
		  horse3.xProperty().unbind();
		  horse4.xProperty().unbind();
		  horse5.xProperty().unbind();
		  horse6.xProperty().unbind();
		  horse7.xProperty().unbind();
		  horse8.xProperty().unbind();
		  horse9.xProperty().unbind();
		  horse10.xProperty().unbind();
		  horse11.xProperty().unbind();
		  horse12.xProperty().unbind();
	  }
}
