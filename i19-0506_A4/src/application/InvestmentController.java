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

public class InvestmentController {
	
	@FXML
	Button back;

	@FXML
	Button calculate;
	
	@FXML
	TextField TotDisp= new TextField();
	
	@FXML
	TextField IntDisp= new TextField();
	
	@FXML
	TextField YeaDisp= new TextField();
	
	@FXML
	TextField InvDisp= new TextField();

	double investment=0;
	
    @FXML
    private void CalculateInvestment() {
      
    	String amount = TotDisp.getText();
        String interest = IntDisp.getText();
        String year = YeaDisp.getText();

    	double acal=Double.parseDouble(amount);
    	double ical=Double.parseDouble(interest);
    	double ycal=Double.parseDouble(year);
    	
    	investment = (acal * ical) / 100;
    	investment *= ycal;
    	investment += acal;
    	
    	InvDisp.setText(Double.toString(investment));
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