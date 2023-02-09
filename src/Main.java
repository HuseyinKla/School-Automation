public class Main {

    public static void main(String[] args) {

        Calisan c = new Calisan("selim", "akan", "sa@sdfdf", 123);
        Calisan a = new Akademisyen("ali", "geçen", "qwe", 321, "CENG", "Doçent", "CENG 101");
        Calisan ö = new Öğretmen("havva", "kel", "ke@", 987, "makine", "görev", "makine giriş", "profesör");
        Calisan as = new Asistan("melike", "değen", "meQ", 567, "elektronik", "görev1", "elektronik 101", "yapıyor");
        Calisan m = new Memur("mehmet", "gezer", "mg@", 002, "güvenlik", "7 saat");
        Calisan bg = new Bilgiİşlem("selin", "düzmeceler", " sd@", 777, " öğrenci işleri", "5 saat", "telefona bakmak");
        Calisan gg = new GüvenlikGörevlisi("ahmet", "dede", "ad@", 666, "bahçe", "10 saat", "S112");

        System.out.println(c.giris());
        System.out.println(a.giris());
        System.out.println(ö.giris());
        System.out.println(as.giris());
        System.out.println(m.giris());
        System.out.println(bg.giris());
        System.out.println(gg.giris());


        System.out.println("OKULDA BULUNAN MEVCUT PERSONEL SAYISI " + Calisan.personelSayisi);

    }
}
