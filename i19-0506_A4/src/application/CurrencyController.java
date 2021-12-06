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

public class CurrencyController {
	
	@FXML
	Button back;

	@FXML
	Button convert;

	@FXML
	Button Dollar;

	@FXML
	Button Rupee;

	@FXML
	Button Pound;

	@FXML
	Button Euro;
	
	@FXML
	TextField CurrencyDisp= new TextField();
	
	@FXML
	TextField ConvertDisp= new TextField();

	@FXML
	Label CurrDisp= new Label();

	@FXML
	Label ConDisp= new Label();
	
	int count=0;
	int befcount=0;
    int aftcount=0;
	
    @FXML
    private void Rupees() {
    	
    	if (count == 0) {
    		CurrDisp.setText("Rupees:");
    		count++;
    		befcount=1;
    	}
    	else if (count == 1){
    		ConDisp.setText("Rupees:");
    		count++;
    		aftcount=1;
    	}
    }
    
	
    @FXML
    private void Euro() {
    	
    	if (count == 0) {
    		CurrDisp.setText("Euro:");
    		count++;
    		befcount=2;
    	}
    	else if (count == 1){
    		ConDisp.setText("Euro:");
    		count++;
    		aftcount=2;
    	}
    }

	
    @FXML
    private void Pound() {
    	
    	if (count == 0) {
    		CurrDisp.setText("Pound:");
    		count++;
    		befcount=3;
    	}
    	else if (count == 1){
    		ConDisp.setText("Pound:");
    		count++;
    		aftcount=3;
    	}
    }

	
    @FXML
    private void Dollar() {
    	
    	if (count == 0) {
    		CurrDisp.setText("Dollar:");
    		count++;
    		befcount=4;
    	}
    	else if (count == 1){
    		ConDisp.setText("Dollar:");
    		count++;
    		aftcount=4;
    	}
    }
	
	
    @FXML
    private void Calculate() {
      
    	String currency = CurrencyDisp.getText();
    	
    	double conv;
    	
    	if (befcount==1) {
    		if (aftcount==1) {
    			ConvertDisp.setText(currency);
    		}
    		else if (aftcount==2) {
    			conv = Double.parseDouble(currency);
    			conv = conv/200;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    		else if (aftcount==3) {
    			conv = Double.parseDouble(currency);
    			conv = conv/233;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    		else if (aftcount==4) {
    			conv = Double.parseDouble(currency);
    			conv = conv/176;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    	}
    	else if (befcount==2) {
    		if (aftcount==1) {
    			conv = Double.parseDouble(currency);
    			conv = conv*200;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    		else if (aftcount==2) {
    			ConvertDisp.setText(currency);
    		}
    		else if (aftcount==3) {
    			conv = Double.parseDouble(currency);
    			conv = conv*0.85;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    		else if (aftcount==4) {
    			conv = Double.parseDouble(currency);
    			conv = conv*1.13;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    	}
    	else if (befcount==3) {
    		if (aftcount==1) {
    			conv = Double.parseDouble(currency);
    			conv = conv*233;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    		else if (aftcount==2) {
    			conv = Double.parseDouble(currency);
    			conv = conv/0.85;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    		else if (aftcount==3) {
    			ConvertDisp.setText(currency);
    		}
    		else if (aftcount==4) {
    			conv = Double.parseDouble(currency);
    			conv = conv*1.32;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    	}
    	else if (befcount==4) {
    		if (aftcount==1) {
    			conv = Double.parseDouble(currency);
    			conv = conv*176;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    		else if (aftcount==2) {
    			conv = Double.parseDouble(currency);
    			conv = conv/1.13;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    		else if (aftcount==3) {
    			conv = Double.parseDouble(currency);
    			conv = conv/1.32;
    			
    			ConvertDisp.setText(Double.toString(conv));
    		}
    		else if (aftcount==4) {
    			ConvertDisp.setText(currency);
    		}
    	}
    	
    	
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
