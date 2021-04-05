package Latihan3;

public class Staff extends Pegawai {
    private static final int gajiStaf = 50000;
    private static final int bonusStaf = 10000;

    //getter method
    public int gaji() {
        return gajiStaf;
    }
    public int bonus() {
        return bonusStaf;
    }
}
