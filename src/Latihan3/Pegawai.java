package Latihan3;

//Parent class
public class Pegawai {
    String nama;
    int gaji;

    //Konstraktor overloading
    Pegawai (){
    }
    Pegawai (String nm){
        this.nama=nm;
        System.out.println("Pegawai");
    }
    //non void method
    public int gaji(){
        return 0;
    }
}
