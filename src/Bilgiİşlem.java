public class Bilgiİşlem extends Memur{
    private String gorev;

    public Bilgiİşlem(String ad, String soyad, String eposta, int numara, String departman, String mesai, String gorev) {
        super(ad, soyad, eposta, numara, departman, mesai);
        this.gorev = gorev;
    }

    public String tarama(){
        return super.getAd()+" "+super.getSoyad()+" "+super.getDepartman()+" DEPARTMANINDA TARAMA İŞLEMİNİ GERÇEKLEŞTİRDİ";
    }

    //GETTER
    public String getGorev() {
        return gorev;
    }

    //SETTER
    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
