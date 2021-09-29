/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objek;

import java.sql.ResultSet;

/**
 *
 * @author Ach. Afrian Auliansyah
 */
public class Paket3Day extends WisataPulau{
    
    @Override
    public ResultSet PrintData(){
        MainQuery = "SELECT * FROM day3";
        try{
            MainSt = MainKoneksi.createStatement();
            MainRs = MainSt.executeQuery(MainQuery);
        } catch (Exception e){
            
        }
        return MainRs;
    }    
    
    @Override
    public void day(String nama, String pulau, String tanggal, String paketharga) {
        MainQuery = "INSERT INTO day3 VALUES (?,?,?,?)";
        try {
            MainPst = MainKoneksi.prepareStatement(MainQuery);
            MainPst.setString(1, nama);
            MainPst.setString(2, pulau);
            MainPst.setString(3, tanggal);
            MainPst.setString(4, paketharga);
            MainPst.executeUpdate();
            MainPst.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
