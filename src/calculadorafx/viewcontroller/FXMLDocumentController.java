/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafx.viewcontroller;

import calculadorafx.model.Calculadora;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Aisem
 */
public class FXMLDocumentController implements Initializable {
    Calculadora calc;
    
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btnMas;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btn1;
    @FXML
    private Button btn0;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btnPor;
    @FXML
    private Button btnAC;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnDividir;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calc = new Calculadora();
        
    }    

    @FXML
    private void operando(javafx.scene.input.MouseEvent event) {
        Button btn=(Button)event.getSource();
        int operando=Integer.parseInt(btn.getText());
        calc.cargarNumero(operando);
        txtResultado.setText(calc.getResultado());
    }

    @FXML
    private void operador(javafx.scene.input.MouseEvent event) {
        Button btn=(Button)event.getSource();
        String op = btn.getText();
        calc.operar(op);
        txtResultado.setText(calc.getResultado());
    }

    @FXML
    private void igual(javafx.scene.input.MouseEvent event) {
        Button btn=(Button)event.getSource();
        String op = btn.getText();
        calc.operar(op);
        txtResultado.setText(calc.getResultado());
    }
    
    @FXML
    private void limpiar(javafx.scene.input.MouseEvent event) {
        calc.limpiar();
        txtResultado.setText(calc.getResultado());
    }
    
}
