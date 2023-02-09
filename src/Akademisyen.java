public class Akademisyen extends Calisan{

    private String bolum,gorev;
    private String ders;

    public Akademisyen(String ad, String soyad, String eposta, int numara, String bolum, String gorev, String dersler) {
        super(ad, soyad, eposta, numara);
        this.bolum = bolum;
        this.gorev = gorev;
        this.ders = dersler;
    }

    public String derseGir(String girilecekDers){
        return super.getAd()+" "+super.getSoyad()+" "+girilecekDers+" DERSİNE GİRMİŞTİR";
    }

    @Override
    public String giris(){
        return gorev+" "+super.giris();
    }

    @Override
    public String cikis(){
        return gorev+" "+super.cikis();
    }

    //GETTER
    public String getBolum() {
        return bolum;
    }

    public String getGorev() {
        return gorev;
    }

    public String getDersler() {
        return ders;
    }

    //SETTER
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void setDersler(String dersler) {
        this.ders = dersler;
    }
}
