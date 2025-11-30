public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Dönüş değerini kullanmazsanız ne olur?
        // getNumber() metodu çalışır, 42 değerini döndürür
        // fakat bu değer kullanılmadığı için DERLEYİCİ HATA VERMEZ.
        // Java bunu kabul eder. Return edilen değer çöpe gider.
        getNumber();


        // 2) void metodu bir ifade içinde kullanırsanız ne olur?
        // sayHello() void türündedir, yani hiçbir değer döndürmez.
        // Bu yüzden "sayHello() + 7" ifadesi derleme hatası üretir.
        // Çünkü + operatörü bir sayısal değer bekler.
        // Hata örneği:
        // error: bad operand types for binary operator '+'
        // first type: void
        // second type: int
        //
        // System.out.println(sayHello() + 7); // <-- derleme hatası

    }
}
