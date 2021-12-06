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

public class DiscountController {
	
	@FXML
	Button back;

	@FXML
	Button calculate;
	
	@FXML
	TextField OrigDisp= new TextField();
	
	@FXML
	TextField PerDisp= new TextField();
	
	@FXML
	TextField DisDisp= new TextField();

	double Discount=0;
	
    @FXML
    private void CalculateDiscount() {
      
    	String origional = OrigDisp.getText();
        String percentage = PerDisp.getText();

    	double origcal=Double.parseDouble(origional);
    	double percal=Double.parseDouble(percentage);
    	
    	Discount = (origcal*percal)/100;
    	Discount = origcal - Discount;
    	
    	DisDisp.setText(Double.toString(Discount));
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
