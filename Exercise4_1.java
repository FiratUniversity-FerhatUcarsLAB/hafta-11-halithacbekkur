
/**
 * Ad Soyad: [HALİD hacbekkur]
 * Öğrenci No: [250541608]
 * Proje: [ Exercise4_1]
 * Tarih: []
 */
   
import java.util.Scanner;

public class Exercise4_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" gün adı giriniz :");
        String day = sc.nextLine();

        System.out.println(" günü giriniz :");
        int tarih = sc.nextInt();

        System.out.println("ay giriniz :");
        String ay = sc.next();

        System.out.println("yılı giriniz :");
        int yil = sc.nextInt();


        printAmerican(day, tarih, ay, yil);

        printEuropean(day, tarih, ay, yil);
    }

    public static void printAmerican(String day,
                                     int date, String month, int year) {

        if ((date > 0 && year > 0) && (date < 31 && year < 2026)) {
            System.out.printf("%s%d,%s,%d \n", day, date, month, year);

        } else {
            System.out.println("GEÇERSİZ İŞLEM !");
        }


    }

    public static void printEuropean(String day, int date, String month, int year) {
        if ((date > 0 && year > 0) && (date < 31 && year < 2026))
            System.out.printf("%s,%d,%d,%s ", month, date, year, day);

        else
            System.out.println("GEÇERSİZ İŞLEM !");

    }

}
