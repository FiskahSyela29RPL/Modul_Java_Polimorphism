package Latihan2;

public class TestLine {
    public static void main(String[] args) {
        //membuat objek pertama dan coba
            Line coba = new Line(2.5,3,4,5);
            Line pertama = new Line(3,4,5,6);
            coba.getLength();
            coba.isGreater(coba, pertama);
            //mengecek apakah hasil coba lebih banyak dari pertama
            System.out.println(coba.isGreater(coba, pertama));
        }
    }