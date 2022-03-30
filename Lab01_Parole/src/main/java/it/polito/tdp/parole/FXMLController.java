package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.TreeMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;
    
    @FXML
    private Button btnCancella;


    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTempi;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	
    	txtResult.clear();
    	String p=txtParola.getText();
    	elenco.addParola(p);
    	
    	for(String s:elenco.getElenco())
    		
    		{txtResult.appendText(s+"\n");}
    	//long tempo=System.nanoTime();
    	txtTempi.appendText(""+System.nanoTime()+"\n");
    	txtParola.clear();
    	// TODO
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	
    	String p=txtResult.getSelectedText();
    	elenco.removeParola(p);
    	txtResult.clear();
    	
    	for(String s:elenco.getElenco())
    		
		{txtResult.appendText(s+"\n");}
    	txtTempi.appendText(""+System.nanoTime()+"\n");
	txtParola.clear();
	// TODO
    }

    @FXML
    void doReset(ActionEvent event) {
    	
    	elenco.reset();
    	txtResult.clear();
    	txtTempi.clear();
    	
    	// TODO
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempi != null : "fx:id=\"txtTempi\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}


