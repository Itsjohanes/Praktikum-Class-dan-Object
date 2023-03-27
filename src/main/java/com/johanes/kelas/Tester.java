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
public class Tester {
    public static void main(String[] args){
        Buku buku1 = new Buku("Bobo",5);
        Buku buku2 = buku1;
        buku2.setJudul("donal bebek");
        System.out.println(buku1.getJudul());
        System.out.println(buku2.getJudul());
    }
    
}
