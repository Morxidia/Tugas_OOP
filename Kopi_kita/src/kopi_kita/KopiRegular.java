/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kopi_kita;

/**
 *
 * @author morxidia
 */
public class KopiRegular extends PesanKopi {

    public KopiRegular(Integer hargaDasar) {
        super.namaKopi = "Kopi Reguler";
        super.hargaDasar = hargaDasar;
    }
    
    @Override
    public Integer hitungTotalHarga() {
        return super.hargaDasar;
    }
    
}
