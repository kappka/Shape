/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SHAPE;

/**
 *
 * @author Teti
 */
public class Main {
    public static void main(String[] args) {
        // Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(5, 3);
        System.out.println("Persegi Panjang - Keliling: " + pp.keliling() + ", Luas: " + pp.luas());

        // Segitiga
        Segitiga segitiga = new Segitiga(3, 4, 3, 4, 5);
        System.out.println("Segitiga - Keliling: " + segitiga.keliling() + ", Luas: " + segitiga.luas());

        // Lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Lingkaran - Keliling: " + lingkaran.keliling() + ", Luas: " + lingkaran.luas());

        // Persegi
        Persegi persegi = new Persegi(4);
        System.out.println("Persegi - Keliling: " + persegi.keliling() + ", Luas: " + persegi.luas());

        // Balok
        Balok balok = new Balok(4, 5, 6);
        System.out.println("Balok - Volume: " + balok.volume() + ", Luas Permukaan: " + balok.luasPermukaan());

        // Kubus
        Kubus kubus = new Kubus(3);
        System.out.println("Kubus - Volume: " + kubus.volume() + ", Luas Permukaan: " + kubus.luasPermukaan());

        // Tabung
        Tabung tabung = new Tabung(7, 10);
        System.out.println("Tabung - Volume: " + tabung.volume() + ", Luas Permukaan: " + tabung.luasPermukaan());
        
        
         // Prisma Segitiga
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(3, 4, 5, 5, 10);
        System.out.println("Prisma Segitiga - Volume: " + prismaSegitiga.volume() + ", Luas Permukaan: " + prismaSegitiga.luasPermukaan());
    
    }
}
