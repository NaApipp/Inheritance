package Inheritance;

import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        SubMusik musik = new SubMusik();
        SubFilm film = new SubFilm();
        
        System.out.println("###############");
        System.out.println("  RENTAL VCD");
        System.out.println("###############");
        System.out.println("   ");
        System.out.println("Silahkan Pilih");
        System.out.println("1.CD Musik");
        System.out.println("2.VCD Film");
        
        Scanner entri1=new Scanner(System.in);
        Scanner entri2=new Scanner(System.in);
        
        System.out.println("Masukkan Pilihan Anda(Ketik angka 1-2):");
        
        int pil;
        
        /*
        *
        *
        *BAGIAN MUSIK
        *
        */
        pil = entri1.nextInt();
        if (pil==1){
            System.out.println("     ");
            musik.kosong =entri1.nextLine();
            
            System.out.println("Masukkan Judul Lagu  :");
            musik.judulmusik = entri1.nextLine();   
            
            System.out.println("Masukkan Nama Penyanyi  :");
            musik.penyanyi = entri1.nextLine();
            
            System.out.println("Masukkan Produser  :");
            musik.produser = entri1.nextLine();
            
            System.out.println("Masukkan Publisher  ");
            musik.publisher = entri1.nextLine();
            
            System.out.println("1.C = Classic");
            System.out.println("2.J = Jazz");
            System.out.println("3.P = Pop");
            System.out.println("4.R = Rock");
            System.out.println("Masukkan Kategori(Ketik Angka 1-4):");
            
            int pilihan;
            pilihan =entri1.nextInt();
            if(pilihan == 1){
                musik.kategori="Klasik";
            }
            else if(pilihan == 2){
                musik.kategori="Jazz";
            }
            else if(pilihan == 3){
                musik.kategori="Pop";
            }
            else if(pilihan == 4){
                musik.kategori="Rock & Roll";
            }
            else{
                musik.kategori="Kosong";
            }
            
            System.out.println("Jumlah Stock: ");
            musik.stock = entri1.nextInt();
            
            System.out.println("Hits tahun berapa:");
            musik.tophits = entri1.nextInt();
            
            System.out.println("-----------RINCIAN-------------");
            System.out.println("Judul Lagu    : "+musik.judulmusik);
            System.out.println("Nama Penyanyi : "+musik.penyanyi);
            System.out.println("Produser      : "+musik.produser);
            System.out.println("Publisher     : "+musik.publisher);
            System.out.println(" Kategori     : "+musik.kategori);
            System.out.println("Hits Tahun    : "+musik.tophits);
            System.out.println("Jumlah Stock  : "+musik.stock);
            System.out.println("=================================================");
        }
        
        
        
 /*
*
*
*BAGIAN FILM
*
*/
        else if(pil==2){
            
            System.out.println("Masukkan Judul Film  :");
            film.judulfilm = entri2.nextLine();   
            
            System.out.println("Masukkan Nama Pemain :");
            film.pemain = entri2.nextLine();
            
            System.out.println("Masukkan Sutradara  :");
            film.sutradara = entri2.nextLine();
            
            System.out.println("Masukkan Publisher  :");
            film.publisher = entri2.nextLine();
            
            System.out.println("1.SU");
            System.out.println("2.R");
            System.out.println("3.D");
            System.out.println("4.A");
            System.out.println("Masukkan Kategori  :");
            film.kategori = entri2.nextLine();
          
            
            int pilihan;
            pilihan= entri2.nextInt();
            
            if(pilihan == 1){
                film.kategori = "Semua Umur";
            }
            else if(pilihan == 2){
                film.kategori = "Remaja";
            }
            else if(pilihan == 3){
                film.kategori = "Dewasa";
            }
            else if(pilihan == 4){
                film.kategori = "Anak-Anak";
            }
            else{
                film.kategori = "Kosong";
            }
             System.out.println("Masukkan Stock   :");
            film.stock = entri2.nextInt();
           
            

            System.out.println("-------------RINCIAN----------------");
            System.out.println("Judul Film     : "+film.judulfilm);
            System.out.println("Pemain Film    : "+film.pemain);
            System.out.println("Sutradara Film : "+film.sutradara);
            System.out.println("Publisher Film : "+film.publisher);
            System.out.println("Kategori       : "+film.kategori);
            System.out.println("Stock          : "+film.stock);
        }
    }
}
