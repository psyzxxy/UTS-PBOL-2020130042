/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbol;

import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Asus
 */
public class DBsoal {
    private soalModel dt = new soalModel();

    public soalModel getsoalModel() {
        return (dt);
    }

    public void setsoalModel(soalModel s) {
        dt = s;
    }
    
     public ObservableList<soalModel> Load() {
        try {
            ObservableList<soalModel> TableData = FXCollections.observableArrayList();
            koneksi con = new koneksi();
            con.bukaKoneksi();
            con.statement = con.dbKoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery("Select nosoal, jenis_soal, soal from soal");
            int i = 1;
            while (rs.next()) {
                soalModel d = new soalModel();
                d.setNosoal(rs.getString("nosoal"));
                d.setJenis_soal(rs.getString("jenis_soal"));
                d.setSoal(rs.getString("soal"));
                TableData.add(d);
                i++;
            }
            con.tutupKoneksi();
            return TableData;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
     
    public int validasi(String nomor) {
        int val = 0;
        try {
            koneksi con = new koneksi();
            con.bukaKoneksi();
            con.statement = con.dbKoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery("select count(*) as jml from kuis where idsoal = " + nomor + "");
            while (rs.next()) {
                val = rs.getInt("jml");
            }
            con.tutupKoneksi();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return val;
    }
    
     public boolean insert() {
        boolean berhasil = false;
        koneksi con = new koneksi();
        try {
            con.bukaKoneksi();
            con.preparedStatement = con.dbKoneksi.prepareStatement("insert into soal (nosoal, jenis_soal, soal) values (?,?,?)");
            con.preparedStatement.setString(1, getsoalModel().getNosoal());
            con.preparedStatement.setString(2, getsoalModel().getJenis_soal());
            con.preparedStatement.setString(3, getsoalModel().getSoal());
            con.preparedStatement.executeUpdate();
            berhasil = true;
        } catch (Exception e) {
            e.printStackTrace();
            berhasil = false;
        } finally {
            con.tutupKoneksi();
            return berhasil;
        }
    }
     
     public boolean delete(String nomor) {
        boolean berhasil = false;
        koneksi con = new koneksi();
        try {
            con.bukaKoneksi();
            con.preparedStatement = con.dbKoneksi.prepareStatement("delete from soal where nosoal = ?");
            con.preparedStatement.setString(1, nomor);
            con.preparedStatement.executeUpdate();
            berhasil = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.tutupKoneksi();
            return berhasil;
        }
    }

    public boolean update() {
        boolean berhasil = false;
        koneksi con = new koneksi();
        try {
            con.bukaKoneksi();
            con.preparedStatement = con.dbKoneksi.prepareStatement("update soal set jenis_soal = ?, soal = ? where nosoal = ?;");
            con.preparedStatement.setString(1, getsoalModel().getNosoal());
            con.preparedStatement.setString(2, getsoalModel().getJenis_soal());
            con.preparedStatement.setString(3, getsoalModel().getSoal());
            con.preparedStatement.executeUpdate();
            berhasil = true;
        } catch (Exception e) {
            e.printStackTrace();
            berhasil = false;
        } finally {
            con.tutupKoneksi();
            return berhasil;
        }
    }
    
}
