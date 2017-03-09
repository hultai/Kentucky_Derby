package app;

import javafx.beans.binding.Bindings;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;

public class Controller {


	  @FXML
	  ImageView pferd1, pferd2, pferd3, pferd4, pferd5, pferd6, 
	  			pferd7, pferd8, pferd9, pferd10, pferd11, pferd12;
	  
	  @FXML
	  ComboBox horseCount;
	  
	  IGame game;
	  
	  private double imgWidth;
	  
	  private Double startXCoordinate;
	  
	  public Controller () {
		  game = new Game();
		  
	  }
	  
	  @FXML
	  public void initialize() {
		  startXCoordinate = pferd1.getX();
		  imgWidth = pferd1.getFitWidth();

	  }
	  
	  @FXML
	    private void startRennen() {
		  // hier noch eine Reaktion auf die Anzahl der Pferde implementieren
		  unbindXProperties();
		  moveToStart();
		  int numberOfPlayers = 12;
		  game.prepareGame(numberOfPlayers);
		  bindXProperties();
		  game.startRace();
	  }
	  
	  private void bindXProperties() {
		  pferd1.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer1()));
		  pferd2.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer2()));
		  pferd3.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer3()));
		  pferd4.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer4()));
		  pferd5.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer5()));
		  pferd6.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer6()));
		  pferd7.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer7()));
		  pferd8.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer8()));
		  pferd9.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer9()));
		  pferd10.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer10()));
		  pferd11.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer11()));
		  pferd12.xProperty().bind(Bindings.multiply(imgWidth, game.pointsOfPlayer12()));
		  
	  }
	  
	  private void moveToStart() {
		  pferd1.setX(startXCoordinate);
		  pferd2.setX(startXCoordinate);
		  pferd3.setX(startXCoordinate);
		  pferd4.setX(startXCoordinate);
		  pferd5.setX(startXCoordinate);
		  pferd6.setX(startXCoordinate);
		  pferd7.setX(startXCoordinate);
		  pferd8.setX(startXCoordinate);
		  pferd9.setX(startXCoordinate);
		  pferd10.setX(startXCoordinate);
		  pferd11.setX(startXCoordinate);
		  pferd12.setX(startXCoordinate);

	  }
	
	  private void unbindXProperties() {
		  pferd1.xProperty().unbind();
		  pferd2.xProperty().unbind();
		  pferd3.xProperty().unbind();
		  pferd4.xProperty().unbind();
		  pferd5.xProperty().unbind();
		  pferd6.xProperty().unbind();
		  pferd7.xProperty().unbind();
		  pferd8.xProperty().unbind();
		  pferd9.xProperty().unbind();
		  pferd10.xProperty().unbind();
		  pferd11.xProperty().unbind();
		  pferd12.xProperty().unbind();

	  }
}
