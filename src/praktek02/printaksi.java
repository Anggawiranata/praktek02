
package praktek02;


public class printaksi {
    public static void main(String[] args) {
        print a1 = new print();
        a1.merk = "canon";
        a1.harga = 650;
        a1.jumlah = 2;
        
        a1.menggantitinta();
        System.out.println("| bayar = "+a1.totalnilai());
       
    }
}
