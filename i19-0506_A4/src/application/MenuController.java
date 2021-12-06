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

public class MenuController {

	@FXML
	Button Simple_Calculator;

	@FXML
	Button Age_Calculator;

	@FXML
	Button Discount_Calculator;

	@FXML
	Button Investment_Calculator;

	@FXML
	Button Bmi_Calculator;

	@FXML
	Button Currency_Calculator;
	
	
    @FXML
    private void Calculator() throws IOException {
	
		Stage stage = (Stage) Simple_Calculator.getScene().getWindow();
		stage.close();
		    
		Scene cal = new Scene(FXMLLoader.load(getClass().
		getResource("Calculator.fxml")));
		Stage primaryStage1 = new Stage();
		primaryStage1.setScene(cal);
		primaryStage1.show();
    	
    }
	
    @FXML
    private void Age() throws IOException {
	
		Stage stage = (Stage) Age_Calculator.getScene().getWindow();
		stage.close();
		    
		Scene cal = new Scene(FXMLLoader.load(getClass().
		getResource("Age.fxml")));
		Stage primaryStage1 = new Stage();
		primaryStage1.setScene(cal);
		primaryStage1.show();
    	
    }
	
    @FXML
    private void Discount() throws IOException {
	
		Stage stage = (Stage) Discount_Calculator.getScene().getWindow();
		stage.close();
		    
		Scene cal = new Scene(FXMLLoader.load(getClass().
		getResource("Discount.fxml")));
		Stage primaryStage1 = new Stage();
		primaryStage1.setScene(cal);
		primaryStage1.show();
    	
    }
	
    @FXML
    private void Investment() throws IOException {
	
		Stage stage = (Stage) Investment_Calculator.getScene().getWindow();
		stage.close();
		    
		Scene cal = new Scene(FXMLLoader.load(getClass().
		getResource("Investment.fxml")));
		Stage primaryStage1 = new Stage();
		primaryStage1.setScene(cal);
		primaryStage1.show();
    	
    }
	
    @FXML
    private void Bmi() throws IOException {
	
		Stage stage = (Stage) Bmi_Calculator.getScene().getWindow();
		stage.close();
		    
		Scene cal = new Scene(FXMLLoader.load(getClass().
		getResource("BMI.fxml")));
		Stage primaryStage1 = new Stage();
		primaryStage1.setScene(cal);
		primaryStage1.show();
    	
    }
	
    @FXML
    private void Currency() throws IOException {
	
		Stage stage = (Stage) Currency_Calculator.getScene().getWindow();
		stage.close();
		    
		Scene cal = new Scene(FXMLLoader.load(getClass().
		getResource("Currency.fxml")));
		Stage primaryStage1 = new Stage();
		primaryStage1.setScene(cal);
		primaryStage1.show();
    	
    }
	
}
