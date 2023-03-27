/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johanes.kelas;

/**
 *
 * @author acer
 */
public class Buku {
    private String judulBuku;
    private int jumlahHalaman;
    //constructor
    
    //Default Constructor (boleh ditulis boleh juga tidak)
    public Buku(){
        
    }
    public Buku(String judulBuku, int jumlahHalaman){
        this.judulBuku = judulBuku;
        this.jumlahHalaman = jumlahHalaman;
    
    }
   
    //Setter
    public void setJudul(String judulBuku){
        this.judulBuku = judulBuku;
    }
    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    //Getter
    public String getJudul(){
        return this.judulBuku;
    }
    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }
    
    
}
