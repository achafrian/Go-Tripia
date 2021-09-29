/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objek;

import Connection.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ach. Afrian Auliansyah
 */
public abstract class WisataPulau {
    
    //OOP
    private String nama;
    private String pulau;
    private String tanggal;
    private String paketharga;
    
    //Enkapsulasi
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPulau() {
        return pulau;
    }

    public void setPulau(String pulau) {
        this.pulau = pulau;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPaketharga() {
        return paketharga;
    }

    public void setPaketharga(String paketharga) {
        this.paketharga = paketharga;
    }
    
    //Method yang akan diwariskan
    public ResultSet PrintData(){
        return MainRs;
    }
    
    public void day(String a, String b, String c, String d){
        
    }
    
    //Koneksi
    protected Connection MainKoneksi;
    protected PreparedStatement MainPst;
    protected Statement MainSt;
    protected ResultSet MainRs;
    protected String MainQuery;
    
    protected WisataPulau(){
        try{
            koneksi kon = new koneksi();
            MainKoneksi = kon.koneksiDB();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    
    private Connection getMainKoneksi(){
        return MainKoneksi;
    }
    
    private PreparedStatement getMainPst(){
        return MainPst;
    }
    
    private Statement getMainSt(){
        return MainSt;
    }
    
    private ResultSet getMainRs(){
        return MainRs;
    }
    
    private String getMainQuery(){
        return MainQuery;
    }
    
    private void setMainKoneksi(Connection MainKoneksi){
        this.MainKoneksi = MainKoneksi;
    }
    
    private void setMainPst(PreparedStatement MainPst){
        this.MainPst = MainPst;
    }
    
    private void setMainSt(Statement MainSt){
        this.MainSt = MainSt;
    }
    
    private void setMainRs(ResultSet MainRs){
        this.MainRs = MainRs;
    }
    
    private void setMainQuery(String MainQuery){
        this.MainQuery = MainQuery;
    }
}
