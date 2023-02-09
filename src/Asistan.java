public class Asistan extends Akademisyen{
    private String yuksekLisans;

    public Asistan(String ad, String soyad, String eposta, int numara, String bolum, String gorev, String dersler, String yuksekLisans) {
        super(ad, soyad, eposta, numara, bolum, gorev, dersler);
        this.yuksekLisans = yuksekLisans;
    }

    public String labGir(String lab){
        return super.getAd()+" "+super.getSoyad()+" "+lab+" LABINA GİRMİŞTİR";
    }

    public String quizOku(String quiz){
        return super.getAd()+" "+super.getSoyad()+" "+quiz+" DERSİNİN QUİZLERİNİ OKUMUŞTUR";
    }

    @Override
    public String giris(){
        personelSayisi++;
        return "ASİSTAN "+getAd()+" "+getSoyad()+" GİRİŞ YAPMIŞTIR";
    }

    @Override
    public String cikis(){
        personelSayisi--;
        return "ASİSTAN "+getAd()+" "+getSoyad()+" GİRİŞ YAPMIŞTIR";
    }


    public String isYuksekLisans() {
        return "ASİSTAN "+super.getAd()+" "+super.getSoyad()+" ŞU ANDA YÜKSEK LİSANS"+" "+yuksekLisans;
    }
}