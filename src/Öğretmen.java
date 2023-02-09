public class Öğretmen extends Akademisyen{

    private String unvan;

    public Öğretmen(String ad, String soyad, String eposta, int numara, String bolum, String gorev, String dersler, String unvan) {
        super(ad, soyad, eposta, numara, bolum, gorev, dersler);
        this.unvan = unvan;
    }

    @Override
    public String giris(){
        personelSayisi++;
        return unvan+" "+getAd()+" "+getSoyad()+" GİRİŞ YAPMIŞTIR";
    }

    @Override
    public String cikis(){
        personelSayisi--;
        return unvan+" "+getAd()+" "+getSoyad()+" ÇIKIŞ YAPMIŞTIR";
    }







    public String toplantiGir(){
        return unvan+" "+super.getAd()+" "+super.getSoyad()+" BUGÜNKÜ TOPLANTIYA KATILMIŞTIR";
    }

    public String sinavlariOku(){
        return unvan+" "+super.getAd()+" "+super.getSoyad()+" SINAVLARI OKUMUŞTUR";
    }

    //GETTER
    public String getUnvan() {
        return unvan;
    }
    //SETTER
    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
