/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

/**
 *
 * @author Selvi Dwi Granat
 */
public class nomor2 extends Thread {
    static int dokter, suster, pasien;
    public void run(){
        
    }
    public static void main(String[] args) {
        for (pasien=0;pasien<10;pasien++){
            System.out.println("Pasien ke "+(pasien+1)+"datang dan diperiksa oleh dokter");
        }
        
        Thread th = new ganjil();
        Thread th1 = new genap();
       
        
        System.out.println("");
        th.start();
        th1.start();
    }
}

