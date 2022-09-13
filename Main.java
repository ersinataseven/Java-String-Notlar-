import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {

        String mesaj = "  Bugün hava çok güzel.  "; // yazılan yazılarda boşlukda bir karekter olarak sayılır.
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı= "+mesaj.length()); // Boşluklar dahil kaç tane karakterden oluştuğunu gösterir.
        System.out.println("5. eleman: " +mesaj.charAt(6)); // Baştan sayarak kaçıncı elemanı yazdırmamıza yarar.
        System.out.println(mesaj.concat("Yaşasın!")); // Yazımızın sonuna eklemek istediğimizi yazdırır.
        System.out.println(mesaj.startsWith("B")); // Yazdığımız yazının baş harfinin fonksiyonun içine yazdığımız harf ile başlayıp başlamdığını söyler.
        // Sadece doğru ve yanlış (true-false) metodu ile çalışır. Ayrıca java diline özgü büyük küçük harf hassasiyeti vardır.
        System.out.println(mesaj.endsWith("z")); // Yazılan yazının girilen değerle aynı olup olmadığını söyler.

        char [] karakterler=new char[5]; // karakterler diye 5 boyuttan oluşan bir char tanımladık.
        mesaj.getChars(6,11,karakterler,0); // mesaj içinde yazılan yaının 0 indekten başlayarak 5.indekse kadar karakterler içine yazdırdık.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("v"));
        System.out.println(mesaj.lastIndexOf("."));*/

        System.out.println(mesaj.replace(" ", "-")); // mesaj stringizin içerisinde değiştirmek istediğimiz kısımlar için kullanılır.
        System.out.println(mesaj.substring(3)); //mesaj stringimizin nereden başlayarak yazdırmak istediğimizde.

        for (String kelime:mesaj.split(" ")){ // mesaj stringini boşluklara göre ayırarak kelime dizisinin içerisine atarak alt alta yazdırdım.
            System.out.println(kelime);

        }

        System.out.println(mesaj.toLowerCase()); // mesaj stringinin tamamını küçük harflere çevirdi.
        System.out.println(mesaj.toUpperCase()); // tamamını büyük harflere çevirdim.
        System.out.println(mesaj.trim()); // mesaj stringimizin başındaki ve sonundaki boşlukların alınmasını sağlar.






    }
}