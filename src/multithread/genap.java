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
public class genap extends Thread{
    
    static int dokter, suster,pasien;
   
 
    public void run() {
        for (int i = 2; i < 11; i+=2) {
            System.out.println("Perawat 1 merawat pasien ke " + i + " ");
            System.out.println("Pasien 1 pergi ke kasir");
            System.out.println("");
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {

        }
    }
}
}

