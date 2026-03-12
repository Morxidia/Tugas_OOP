/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kopi_kita;

/**
 *
 * @author morxidia
 */
public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String nomorMeja;

    public Pelanggan(String idPelanggan, String nama, String nomorMeja) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.nomorMeja = nomorMeja;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorMeja() {
        return nomorMeja;
    }
    
}
