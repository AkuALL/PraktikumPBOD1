package Latihan;

public class PNS {
    private String nip;
    private static int counterPNS = 0;

    public void setNIP(String nip){
        this.nip = nip;
    }

    public String getNIP(){
        return nip;
    }

    public int getCounterPNS(){
        return counterPNS;
    }
}