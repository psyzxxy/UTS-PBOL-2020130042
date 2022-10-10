/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package utspbol;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXML_level1Controller implements Initializable {

    @FXML
    private TableView<soalModel> tbvsoal;
    @FXML
    private TextField txtisi;
    @FXML
    private TextField txtmenurun;
    @FXML
    private TextField txtdatar;
    @FXML
    private Button btncek;
    @FXML
    private Button btncek2;
    @FXML
    private TextField txtisi2;
    @FXML
    private TextField txtisi3;
    @FXML
    private TextField txtisi4;
    @FXML
    private TextField txtisi5;
    @FXML
    private TextField txtisi6;
    @FXML
    private TextField txtisi7;
    @FXML
    private TextField txtisi8;
    @FXML
    private TextField txtisi9;
    @FXML
    private TextField txtisi13;
    @FXML
    private TextField txtisi11;
    @FXML
    private TextField txtisi12;
    @FXML
    private TextField txtisi10;
    @FXML
    private TextField txtisi14;
    @FXML
    private TextField txtisi15;
    @FXML
    private TextField txtisi16;
    @FXML
    private TextField txtisi17;
    @FXML
    private TextField txtisi18;
    @FXML
    private TextField txtisi19;
    @FXML
    private TextField txtisi20;
    @FXML
    private TextField txtisi21;
    @FXML
    private TextField txtisi22;
    @FXML
    private TextField txtisi23;
    @FXML
    private TextField txtisi24;
    @FXML
    private TextField txtisi26;
    @FXML
    private TextField txtisi25;
    @FXML
    private TextField txtisi28;
    @FXML
    private TextField txtisi27;
    @FXML
    private Button btnclear;
    @FXML
    private Button btntambah;
    @FXML
    private Button btnhapus;
    @FXML
    private Button btnubah;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showdata();
    }

    private void showdata(){
        ObservableList<soalModel>data = FXMLDocumentController.dtsoal.Load();
        if(data!=null){
            tbvsoal.getColumns().clear();
            tbvsoal.getItems().clear();
            TableColumn col = new TableColumn("nosoal");
            col.setCellValueFactory(new PropertyValueFactory<soalModel,String>("nosoal"));
            tbvsoal.getColumns().addAll(col);
            col = new TableColumn("jenis_soal");
            col.setCellValueFactory(new PropertyValueFactory<soalModel, String>("jenis_soal"));
            tbvsoal.getColumns().addAll(col);
            col = new TableColumn("soal");
            col.setCellValueFactory(new PropertyValueFactory<soalModel,String>("soal"));
            tbvsoal.getColumns().addAll(col);
            tbvsoal.setItems(data);
        }else{
            Alert a = new Alert(Alert.AlertType.ERROR,"Data kososng", ButtonType.OK);
            a.showAndWait();
            tbvsoal.getScene().getWindow().hide();
        }
    }
    
    @FXML
    private void menurunklik(ActionEvent event) {
        if (txtmenurun.getText().trim().toLowerCase().equals("selasa")) {
            txtisi.setText("S");
            txtisi2.setText("E");
            txtisi3.setText("L");
            txtisi4.setText("A");
            txtisi5.setText("S");
            txtisi6.setText("A");
            txtmenurun.setText("");
        } else if (txtmenurun.getText().trim().toLowerCase().equals("neraka")) {
            txtisi13.setText("N");
            txtisi14.setText("E");
            txtisi9.setText("R");
            txtisi15.setText("A");
            txtisi16.setText("K");
            txtisi17.setText("A");
            txtmenurun.setText("");
        } else if (txtmenurun.getText().trim().toLowerCase().equals("sampah")) {
            txtisi28.setText("S");
            txtisi27.setText("A");
            txtisi26.setText("M");
            txtisi25.setText("P");
            txtisi11.setText("A");
            txtisi24.setText("H");
            txtmenurun.setText("");
        } else if (txtmenurun.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Masukkan jawaban Anda");
        } else {
            JOptionPane.showMessageDialog(null, "Jawaban Anda salah");
            txtmenurun.setText("");
        }
    }

    @FXML
    private void datarklik(ActionEvent event) {
        if (txtdatar.getText().trim().toLowerCase().equals("sarapan")) {
            txtisi.setText("S");
            txtisi8.setText("A");
            txtisi9.setText("R");
            txtisi10.setText("A");
            txtisi11.setText("P");
            txtisi12.setText("A");
            txtisi7.setText("N");
            txtdatar.setText("");
        } else if (txtdatar.getText().trim().toLowerCase().equals("api")) {
            txtisi17.setText("A");
            txtisi18.setText("P");
            txtisi19.setText("I");
            txtisi.setText("");
        } else if (txtdatar.getText().trim().toLowerCase().equals("takut")) {
            txtisi20.setText("T");
            txtisi6.setText("A");
            txtisi21.setText("K");
            txtisi22.setText("U");
            txtisi23.setText("T");
            txtdatar.setText("");
        } else if (txtdatar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Masukkan jawaban Anda");
        } else {
            JOptionPane.showMessageDialog(null, "Jawaban Anda salah");
            txtdatar.setText("");
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
    }

    @FXML
    private void tambahklik(ActionEvent event) {
    try{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_InputSoal.fxml"));    
        Parent root = (Parent)loader.load();        
        Scene scene = new Scene(root);        
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);        
        stg.setIconified(false);        
        stg.setScene(scene);
        stg.showAndWait();
        } catch (IOException e){   
            e.printStackTrace();
        }
        showdata();   
    }
    

    @FXML
    private void hapusklik(ActionEvent event) {
        soalModel s = new soalModel();
        s = tbvsoal.getSelectionModel().getSelectedItem();
        Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Mau dihapus?", ButtonType.YES, ButtonType.NO);
        a.showAndWait();
        if (a.getResult() == ButtonType.YES) {
            if (FXMLDocumentController.dtsoal.delete(s.getNosoal ())) {
                Alert b = new Alert(Alert.AlertType.INFORMATION, "Data berhasil dihapus", ButtonType.OK);
                b.showAndWait();
            } else {
                Alert b = new Alert(Alert.AlertType.ERROR, "Data gagal dihapus", ButtonType.OK);
                b.showAndWait();
            }
            showdata();
        }
    }

    @FXML
    private void ubahklik(ActionEvent event) {
        soalModel s= new soalModel();
        s=tbvsoal.getSelectionModel().getSelectedItem();
        try{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_InputSoal.fxml"));    
        Parent root = (Parent)loader.load();
        FXML_InputSoalController isidt=(FXML_InputSoalController)loader.getController();
        isidt.execute(s);                
        Scene scene = new Scene(root);
        Stage stg=new Stage();
        stg.initModality(Modality.APPLICATION_MODAL);
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.showAndWait();
        } catch (IOException e){   
            e.printStackTrace();   
        }
        showdata();
    }
}
