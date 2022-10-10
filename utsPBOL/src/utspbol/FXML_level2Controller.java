/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package utspbol;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXML_level2Controller implements Initializable {

    @FXML
    private TableView<?> tbvsoal2;
    @FXML
    private TextField txtisi;
    @FXML
    private TextField txtisi2;
    @FXML
    private TextField txtisi3;
    @FXML
    private TextField txtisi4;
    @FXML
    private TextField txtisi5;
    @FXML
    private TextField txtisi21;
    @FXML
    private TextField txtisi7;
    @FXML
    private TextField txtisi19;
    @FXML
    private TextField txtisi20;
    @FXML
    private TextField txtisi18;
    @FXML
    private TextField txtisi6;
    @FXML
    private TextField txtisi8;
    @FXML
    private TextField txtisi22;
    @FXML
    private TextField txtisi23;
    @FXML
    private TextField txtisi11;
    @FXML
    private TextField txtisi12;
    @FXML
    private TextField txtisi10;
    @FXML
    private TextField txtisi9;
    @FXML
    private TextField txtisi13;
    @FXML
    private TextField txtisi25;
    @FXML
    private TextField txtisi24;
    @FXML
    private TextField txtisi17;
    @FXML
    private TextField txtisi16;
    @FXML
    private TextField txtisi15;
    @FXML
    private TextField txtisi14;
    @FXML
    private TextField txtmendatar;
    @FXML
    private TextField txtmenurun;
    @FXML
    private Button btncek;
    @FXML
    private Button btncek2;
    @FXML
    private Button btnclear;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void mendatarklik(ActionEvent event) {
        if (txtmendatar.getText().trim().toLowerCase().equals("gudeg")) {
            txtisi.setText("G");
            txtisi2.setText("U");
            txtisi3.setText("D");
            txtisi4.setText("E");
            txtisi5.setText("G");
            txtmendatar.setText("");
        } else if (txtmendatar.getText().trim().toLowerCase().equals("rendang")) {
            txtisi6.setText("R");
            txtisi7.setText("E");
            txtisi8.setText("N");
            txtisi9.setText("D");
            txtisi10.setText("A");
            txtisi11.setText("N");
            txtisi12.setText("G");
            txtmendatar.setText("");
        } else if (txtmendatar.getText().trim().toLowerCase().equals("bubur")) {
            txtisi13.setText("B");
            txtisi14.setText("U");
            txtisi15.setText("B");
            txtisi16.setText("U");
            txtisi17.setText("R");
            txtmendatar.setText("");
        } else if (txtmendatar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Masukkan jawaban Anda");
        } else {
            JOptionPane.showMessageDialog(null, "Jawaban Anda salah");
            txtmendatar.setText("");
        }
    }

    @FXML
    private void menurunklik(ActionEvent event) {
        if (txtmenurun.getText().trim().toLowerCase().equals("pempek")) {
            txtisi18.setText("P");
            txtisi7.setText("E");
            txtisi19.setText("M");
            txtisi20.setText("P");
            txtisi4.setText("E");
            txtisi21.setText("K");
            txtmenurun.setText("");
        } else if (txtmenurun.getText().trim().toLowerCase().equals("sambal")) {
            txtisi22.setText("S");
            txtisi10.setText("A");
            txtisi23.setText("M");
            txtisi13.setText("B");
            txtisi24.setText("A");
            txtisi25.setText("L");
            txtmenurun.setText("");
        } else if (txtmenurun.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Masukkan jawaban Anda");
        } else {
            JOptionPane.showMessageDialog(null, "Jawaban Anda salah");
            txtmenurun.setText("");
        }
    }

    @FXML
    private void clearklik(ActionEvent event) {
        txtisi.setText("");
        txtisi2.setText("");
        txtisi3.setText("");
        txtisi4.setText("");
        txtisi5.setText("");
        txtisi6.setText("");
        txtisi7.setText("");
        txtisi8.setText("");
        txtisi9.setText("");
        txtisi10.setText("");
        txtisi11.setText("");
        txtisi12.setText("");
        txtisi13.setText("");
        txtisi14.setText("");
        txtisi15.setText("");
        txtisi16.setText("");
        txtisi17.setText("");
        txtisi18.setText("");
        txtisi19.setText("");
        txtisi20.setText("");
        txtisi21.setText("");
        txtisi22.setText("");
        txtisi23.setText("");
        txtisi24.setText("");
        txtisi25.setText("");
    }

}
