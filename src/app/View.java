package app;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class View {
	@FXML
	private ImageView pferd1, pferd2, pferd3, pferd4, pferd5, pferd6, pferd7, pferd8, pferd9, pferd10, pferd11, pferd12;
	
	
	
	//Punkte der Pferde
	int[]pferdePunkte = new int[12];
	
	
	@FXML
	private void startRennen(){
		//berechne die Positionen der Pferde
		
		for(int i=0; i<pferdePunkte.length; i++ ){
			if(pferdePunkte[i]<27){
				pferdePunkte[i]+=(int)(Math.random() * 3);
			}
			else{
				pferd1.setVisible(false);	
			}
		}
		pferd1.setTranslateX(pferdePunkte[0]*30);
		pferd2.setTranslateX(pferdePunkte[1]*30);
		pferd3.setTranslateX(pferdePunkte[2]*30);
		pferd4.setTranslateX(pferdePunkte[3]*30);
		pferd5.setTranslateX(pferdePunkte[4]*30);
		pferd6.setTranslateX(pferdePunkte[5]*30);
		pferd7.setTranslateX(pferdePunkte[6]*30);
		pferd8.setTranslateX(pferdePunkte[7]*30);
		pferd9.setTranslateX(pferdePunkte[8]*30);
		pferd10.setTranslateX(pferdePunkte[9]*30);
		pferd11.setTranslateX(pferdePunkte[10]*30);
		pferd12.setTranslateX(pferdePunkte[11]*30);
	}


}
