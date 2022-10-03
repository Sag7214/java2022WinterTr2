package Day34_accessModifiers_encapsulation;

public class C003 {

    // encapsule edecegimiz 2 variable olusturalim.

    private int sayi;
    private String str;

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return
                "sayi=" + sayi +
                        ", str=" + str ;
    }
}



