/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kopi_kita;

/**
 *
 * @author morxidia
 */
public class KopiSpesial extends PesanKopi implements Refill {
    
    public KopiSpesial(Integer hargaDasar) {
        super.namaKopi = "Kopi Special";
        super.hargaDasar = hargaDasar;
    }

    @Override
    public Integer hitungTotalHarga() {
        return super.hargaDasar + 10000;
    }
    
    @Override
    public void cetakInfoRefill() {
        System.out.println("Gratis Refill Sekali KopiKita");
    }
    
}
