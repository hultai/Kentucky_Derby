package app;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ISpieler> players = new ArrayList<>();
		
		for (int i = 0; i <12; i++) {
			players.add(new Spieler());
		}
		
		Spiel spiel = new Spiel (players);
		spiel.startRace();
		launch(args);
	
	}
	
	@Override
    public void start(Stage window) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Spielfeld.fxml"));
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

}
