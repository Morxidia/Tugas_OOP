/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kopi_kita;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author morxidia
 */
public class ListPesanan {
    private HashMap<Pelanggan, PesanKopi> listPesanan;
    private int idSerial;

    public ListPesanan() {
        this.listPesanan = new HashMap<>();
        this.idSerial = 1;
    }
    
    public void add() throws DataPesananTidakValidException{
        String inputMenu, inputNama, inputMeja, inputHarga, inputJenis;
        Integer noMeja, hargaDasar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        inputNama = scanner.nextLine();
        try {
            System.out.print("Nomor Meja: ");
            inputMeja = scanner.nextLine();
            noMeja = Integer.parseInt(inputMeja);
        } catch (NumberFormatException e) {
            throw new DataPesananTidakValidException("Nomor meja tidak Valid, hanya boleh memasukan Angka");
        }
        System.out.println("---------------aku adalah separator-----------------");
        try {
            System.out.print("Harga Dasar: ");
            inputHarga = scanner.nextLine();
            hargaDasar = Integer.parseInt(inputHarga);
            if(hargaDasar < 0){
                throw new DataPesananTidakValidException("Harga Dasar tidak Valid pastikan input diatas 0");
            }
        } catch (NumberFormatException e) {
            throw new DataPesananTidakValidException("Harga Dasar tidak Valid pastikan input diatas 0");
        }
        System.out.print("Jenis Kopi(1. Reguler / 2. Special) : ");
        inputJenis = scanner.nextLine();
        
        if(!(inputJenis.equals("1") || inputJenis.equals("2"))){
            throw new DataPesananTidakValidException("Pilihan Kopi Tidak Valid atau tidak tersedia");
        }
        else if (inputJenis.equals("1")) {
            listPesanan.put(new Pelanggan(("C"+ String.format("%03d", this.idSerial)), inputNama, (noMeja.toString())), new KopiRegular(hargaDasar));
        }
        else{
            listPesanan.put(new Pelanggan(("C"+ String.format("%03d", this.idSerial)), inputNama, (noMeja.toString())), new KopiSpesial(hargaDasar));
        }
        this.idSerial++;
    }
    
    public void printMap(){
        this.listPesanan.forEach((Pelanggan, Kopi) -> {
            System.out.println("--------------ID-"+Pelanggan.getIdPelanggan()+"------------------");
            System.out.println("Nama : " + Pelanggan.getNama());
            System.out.println("Nomor Meja : " + Pelanggan.getNomorMeja());
            System.out.println("---------------ini produk.. mungkin-----------------");
            System.out.println("Total : " + Kopi.hitungTotalHarga());
            if(Kopi instanceof KopiSpesial){
                System.out.print("Refill : " );
                ((KopiSpesial) Kopi).cetakInfoRefill();
            }
            else{
                System.out.println("Refill : - " );
            }
        });
    }
    
}
