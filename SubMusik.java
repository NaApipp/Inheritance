
package Inheritance;


 
public class SubMusik extends Rentalvcd {
    public String penyanyi;
    public String produser;
    public int tophits;
    public String kategori;
    public String kosong;
    
    public SubMusik(String kosong, String judulmusik,String penyanyi, String produser, 
                    String kategori, String publisher, String judulfilm, 
                    int stock, int tophits){
        super(judulmusik, publisher, judulfilm ,stock);
        
        this.penyanyi = penyanyi;
        this.tophits = tophits;
        this.kategori =kategori;
        this.produser = produser;
    }
    SubMusik(){   
    }
}
