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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXML_InputSoalController implements Initializable {

      boolean editdata = false;
    
    public void execute(soalModel d) {
        if (!d.getNosoal().isEmpty()) {
            editdata = true;
            txtnosoal.setText(d.getNosoal());
            txtjenissoal.setText(d.getJenis_soal());
            txasoal.setText(d.getSoal());
            txtnosoal.setEditable(false);
            txasoal.requestFocus();
        }
    }
    @FXML
    private TextField txtnosoal;
    @FXML
    private TextField txtjenissoal;
    @FXML
    private TextArea txasoal;
    @FXML
    private Button btnsimpan;
    @FXML
    private Button btnbatal;
    @FXML
    private Button btnkeluar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void simpanklik(ActionEvent event) {
         soalModel s = new soalModel();
        s.setNosoal(txtnosoal.getText());
        s.setJenis_soal(txtjenissoal.getText());
        s.setSoal(txasoal.getText());
        FXMLDocumentController.dtsoal.setsoalModel(s);
        if (editdata) {
            if (FXMLDocumentController.dtsoal.update()) {
                Alert a = new Alert(Alert.AlertType.INFORMATION, "Data berhasil diubah", ButtonType.OK);
                a.showAndWait();
                txtnosoal.setEditable(true);
                batalklik(event);
            } else {
                Alert a = new Alert(Alert.AlertType.ERROR, "Data gagal diubah", ButtonType.OK);
                a.showAndWait();
            }
        } else if (FXMLDocumentController.dtsoal.validasi(s.getNosoal()) <= 0) {
            if (FXMLDocumentController.dtsoal.insert()) {
                Alert a = new Alert(Alert.AlertType.INFORMATION, "Data berhasil disimpan", ButtonType.OK);
                a.showAndWait();
                batalklik(event);
            } else {
                Alert a = new Alert(Alert.AlertType.ERROR, "Data gagal disimpan", ButtonType.OK);
                a.showAndWait();
            }
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR, "Data sudah ada", ButtonType.OK);
            a.showAndWait();
            txtnosoal.requestFocus();
        }
    }

    @FXML
    private void batalklik(ActionEvent event) {
        txtnosoal.setText("");
        txtjenissoal.setText("");
        txasoal.setText("");
        txtnosoal.requestFocus();
    
    }

    @FXML
    private void keluarklik(ActionEvent event) {
       btnkeluar.getScene().getWindow().hide();
    }
    
}
