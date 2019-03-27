package praklat4;
import java.util.Scanner;
public class PrakLat4 {

    
    public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
   int nilai1, nilai2, hasil;
   System.out.println("Masukan Integer Pertama:");
   nilai1 = input.nextInt();
   System.out.println("Masukan Integer kedua:");
   nilai2 = input.nextInt();
   hasil = nilai1 + nilai2;
   System.out.println("hasil " +nilai1+ "+" +nilai2+ "=" +hasil);
    }
    
}
