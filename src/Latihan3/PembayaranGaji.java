package Latihan3;

public class PembayaranGaji {

    public int hitungGaji (Pegawai pegawai){
        int uang = pegawai.gaji();
        //melakukan variable type and casts pada direktur dan staff
        if (pegawai instanceof Direktur)
            uang+= ((Direktur)pegawai).tunjangan();
        if (pegawai instanceof Staff)
            uang +=((Staff)pegawai).bonus();
        return uang;
    }

    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staff ali = new Staff();
        Direktur tony = new Direktur();

        System.out.println("Gaji yang dibayarkan untuk Staff : "+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur : "+pg.hitungGaji(tony));
    }
}
