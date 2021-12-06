package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CalculatorController implements Initializable {
    
    @FXML
    private TextField Ansfield;
    
    @FXML
    private TextField Entryfield;
	
	@FXML
	Button back;

    @FXML
    private Button zero;

    @FXML
    private Button one;
    
    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button equals;

    @FXML
    private Button clear;

    @FXML
    private Button plus;

    @FXML
    private Button mult;

    @FXML
    private Button minus;
    
    @FXML
    private Button div;
    
    private int operator ;
    double a,b,result ;
    String prevStr="";
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String str = ((Labeled)event.getSource()).getText();
        Ansfield.setText(Ansfield.getText()+str);
        Entryfield.setText(prevStr+str);
        prevStr = Entryfield.getText();
    }
    
    @FXML
    private void add(){
        try{
              a = Double.parseDouble(Ansfield.getText());
              operator = 1 ;
              Entryfield.setText(prevStr+"+");
              prevStr = Entryfield.getText();
          }catch(NumberFormatException e){
              System.out.println("Enter value First");
          }finally{
              Ansfield.setText("");
          }
    }
    
    @FXML
    private void substract(){
          try{
              a = Double.parseDouble(Ansfield.getText());
              operator = 2 ;
              Entryfield.setText(prevStr+"-");
              prevStr = Entryfield.getText();
          }catch(NumberFormatException e){
              System.out.println("Enter value First");
          }finally{
              Ansfield.setText("");
          }
    }
    
    @FXML
    private void multiply(){
      try{
            a = Double.parseDouble(Ansfield.getText());
            operator = 3 ;
            Entryfield.setText(prevStr+"*");
            prevStr = Entryfield.getText();
          }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
             Ansfield.setText("");
        }
    }
    
    @FXML
    private void divide(){
         try{
            a = Double.parseDouble(Ansfield.getText());
            operator = 4 ;
            Entryfield.setText(prevStr+"/");
            prevStr = Entryfield.getText();
        }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
            Ansfield.setText("");
        }
    }
    
    @FXML
    private void clearText(){
        Ansfield.setText("");
        Entryfield.setText("");
        prevStr="";
    }
    
    @FXML
    private void equals(){
	    try{
	              b = Double.parseDouble(Ansfield.getText());
	              
	              switch(operator){
		              case 1 : 
		            	  	result = a + b ; 
		            	  	Ansfield.setText(""+result);  
		            	  break;
		              case 2 : 
		            	  	result = a - b ; 
		            	  	Ansfield.setText(""+result);  
		            	  break;
		              case 3 : 
		            	  	result = a * b ; 
		            	  	Ansfield.setText(""+result);  
		            	  break;
		              case 4 : 
		            	  try{
		                     result = a/b ;
		                     Ansfield.setText(""+result);
		                        
		            	  }
		            	  catch(Exception e){
		            		  Ansfield.setText("Error");
		            	  }
	             }
	             Entryfield.setText(prevStr);
	             
	                
	      }
	    catch(NumberFormatException e){
	          System.out.println("Select values First");
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}