package Latihan1;

public class Aeroplan extends Vehicle {
    //mengimplementasikan abstrak method walk
    @Override
    public void walk() {
        System.out.println("Aeroplan is Flying");
    }
    @Override
    public void fuel() {
        System.out.println("Fuels");
    }

    public static void main(String[] args) {
        //membuat objek dan memanggil method
        Aeroplan garuda = new Aeroplan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}

