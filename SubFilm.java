package Inheritance;


public class SubFilm extends Rentalvcd {
    public String pemain;
    public String sutradara;
    public String kategori;
    public String kosong;

    
    public SubFilm(String kosong, String judulmusik, String pemain, 
            String sutradara, String publisher, String kategori, 
            int stock, String judulfilm){
        super(judulfilm, publisher, judulmusik, stock);
        this.pemain = pemain;
        this.sutradara = sutradara;
        this.kategori = kategori;
    }
    SubFilm(){
    }
}
