package latihan4;

public class Shape {
    private String color;
    //konstraktor
    public Shape (String color){
        this.color = color;
    }
    //menampilkan saat objek diclass shape dipanggil, hasil override dari class objek
    public String toString(){
        return "Shape [color ;"+color+"]";
    }
    public double getArea(){
        //menggunakan system.err ubtuk mengeluarkan error
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
