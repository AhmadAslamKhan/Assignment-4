package application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.StringTokenizer;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class AgeController {

	@FXML
	Button calculate;
	
	@FXML
	Button back;
	
	@FXML
	TextField DOBDisp= new TextField();
	
	@FXML
	TextField YearDisp= new TextField();
	
	@FXML
	TextField MonthDisp= new TextField();
	
	@FXML
	TextField DayDisp= new TextField();
	
	String dd,mm,yy;
	
    @FXML
    private void CalculateAge() throws ParseException {
      
    	String DOB = DOBDisp.getText();
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(DOB);
        
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();

        Period p = Period.between(givenDate, LocalDate.now());
    	 
    	int day = p.getDays();
    	int month = p.getMonths();
    	int year = p.getYears();

    	YearDisp.setText(Integer.toString(p.getYears()));
    	MonthDisp.setText(Integer.toString(p.getMonths()));
    	DayDisp.setText(Integer.toString(p.getDays()));
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
