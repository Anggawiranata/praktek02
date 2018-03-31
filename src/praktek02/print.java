
package praktek02;
public class print {
    String merk;
    double harga;
    double jumlah;

    public print() {
        merk="epson";
        harga=800;
        jumlah=5;
    }
    
    
    void menggantitinta(){
        System.out.println("==================");
        System.out.println("|merk = "+merk);
        System.out.println("|harga = "+harga);
        System.out.println("|jumlah = "+jumlah);
        System.out.println("==================");
    }
    double totalnilai(){
        double nilai;
        nilai= harga*jumlah;
        return nilai;
         
    }
    void totalharga(){
        System.out.println("totalnya adalah :"+totalnilai());
    }
}
