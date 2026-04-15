package latihan_1_pert7;
import java.util.Scanner;

public class latihan1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("input Kehadiran: ");
    int kehadiran = input.nextInt();
    System.out.print("input Nilai Akhir: ");
    int nilaiAkhir = input.nextInt();

    float persen = (kehadiran / 21.0f) * 100;

    if (persen >= 80){
      System.out.println(nilaiAkhir + " Grade A");
    } else if (persen >= 75){
      System.out.println(nilaiAkhir + " Grade B");
    } else if (persen >= 55){
      System.out.println("55 Grade D");
    } else if (persen < 55 && nilaiAkhir < 55 ) {
      System.out.println("Grade E");
    } else {
      return;
    }
  }
}