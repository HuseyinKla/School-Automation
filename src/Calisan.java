public class Calisan{

private String Ad,Soyad,Eposta;
private int numara;
protected static int personelSayisi;




    public Calisan(String ad, String soyad, String eposta, int numara) {
        this.Ad = ad;
        this.Soyad = soyad;
        this.Eposta = eposta;
        this.numara = numara;
    }


    public String giris(){
        personelSayisi++;
        return Ad+" "+Soyad+" OKULA GİRİŞ YAPTI";
    }

    public String cikis(){
        personelSayisi--;
        return Ad+" "+Soyad+" OKULDAN ÇIKIŞ YAPTI";
    }

    public String  yemek(){
        return Ad+" "+Soyad+" YEMEK YEDİ";
    }




    //GETTER
    public String getAd() {
        return Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public String getEposta() {
        return Eposta;
    }

    public int getNumara() {
        return numara;
    }

    public int getPersonelSayisi() {
        return personelSayisi;
    }

    //SETTER
    public void setAd(String ad) {
        Ad = ad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public void setEposta(String eposta) {
        Eposta = eposta;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }
}
