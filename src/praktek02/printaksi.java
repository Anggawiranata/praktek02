
package praktek02;


public class printaksi {
    public static void main(String[] args) {
        print a1 = new print();
        a1.merk = "canon";
        a1.harga = 650;
        a1.jumlah = 2;
        
        a1.menggantitinta();
        System.out.println("| bayar = "+a1.totalnilai());
        System.out.println("===========================");
        a1.totalharga();
        
        print a2 = new print();
        a2.menggantitinta();
        
        print a3 = new print("hp ",1500,1);
        a3.menggantitinta();
    }
}
