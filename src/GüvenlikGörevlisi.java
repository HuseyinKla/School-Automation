public class GüvenlikGörevlisi extends Memur{

private String belge;

    public GüvenlikGörevlisi(String ad, String soyad, String eposta, int numara, String departman, String mesai, String belge) {
        super(ad, soyad, eposta, numara, departman, mesai);
        this.belge = belge;
    }

    public String nobet(){
        return "GÜVENLİK GÖREVLİSİ "+super.getAd()+" "+super.getSoyad()+" NÖBET TUTMUŞTUR";
    }

    //GETTER
    public String getBelge() {
        return belge;
    }

    //SETTER
    public void setBelge(String belge) {
        this.belge = belge;
    }
}