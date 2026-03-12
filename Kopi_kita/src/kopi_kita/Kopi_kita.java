/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kopi_kita;
import java.util.Scanner;
/**
 *
 * @author morxidia
 */
public class Kopi_kita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DataPesananTidakValidException {
        ListPesanan Data = new ListPesanan();
        String inputMenu;
        do{
        System.out.println("1. Tambah Pesanan");
        System.out.println("2. Keluar");
        System.out.print("Pilih Menu: ");
        Scanner scanner = new Scanner(System.in);
        inputMenu = scanner.nextLine();
            if(inputMenu.equals("1")){
                try{
                    Data.add();
                }
                catch(DataPesananTidakValidException e){
                    System.out.println(e.getMessage());
                }
            }
        }   
        while(!inputMenu.equals("2"));
        Data.printMap();
    }
    
}
