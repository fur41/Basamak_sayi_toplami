import java.util.Scanner;

public class cift_sayilar{

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
    int number,toplam=0,adet=0;

    System.out.print("Sayı giriniz :");

    number=reader.nextInt();

    while (number!=0) {
        
        toplam=(number%10)+toplam;
       number/=10;
        ++adet;
        
    }
    System.out.println("Basamak toplamı :"+toplam);
}







}
