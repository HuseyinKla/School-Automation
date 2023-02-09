public class Memur extends Calisan{

private String departman,mesai;

    public Memur(String ad, String soyad, String eposta, int numara, String departman, String mesai) {
        super(ad, soyad, eposta, numara);
        this.departman = departman;
        this.mesai = mesai;
    }

    public String calis(){
        return super.getAd()+" "+super.getSoyad()+" "+departman+" KISMINDA "+mesai+" ÇALIŞMIŞTIR";
    }

     @Override
    public String giris(){
        personelSayisi++;
        return "MEMUR "+super.getAd()+" "+super.getSoyad()+" GİRİŞ YAPMIŞTIR";
    }

    @Override
    public String cikis(){
        personelSayisi--;
        return "MEMUR "+super.getAd()+" "+super.getSoyad()+" ÇIKIŞ YAPMIŞTIR";
    }


    //GETTER
    public String getDepartman() {
        return departman;
    }

    public String getMesai() {
        return mesai;
    }


    //SETTER
    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }
}
