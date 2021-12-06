package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BMIController {

	@FXML
	Button button1;
	
	@FXML
	Button back;
	
	@FXML
	TextField WDisp= new TextField();
	
	@FXML
	TextField HDisp= new TextField();
	
	@FXML
	TextField BMIDisp= new TextField();

	double bmical=0;
	
    @FXML
    private void Calculate() {
      
    	String weight = WDisp.getText();
        String height = HDisp.getText();

    	double hcal=Double.parseDouble(height);
    	double wcal=Double.parseDouble(weight);
    	
    	hcal*=hcal;
    	bmical = wcal/hcal;
    	
    	BMIDisp.setText(Double.toString(bmical));
    }
	
    @FXML
    private void Menu() throws IOException {

		Stage stage = (Stage) back.getScene().getWindow();
		stage.close();
		    
		Scene cal = new Scene(FXMLLoader.load(getClass().
		getResource("Menu.fxml")));
		Stage primaryStage1 = new Stage();
		primaryStage1.setScene(cal);
		primaryStage1.show();
    }
	
}
