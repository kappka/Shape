/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SHAPE;

/**
 *
 * @author Teti
 */
public class PrismaSegitiga {
    private double alas;
    private double tinggiAlas;
    private double sisiMiring1;
    private double sisiMiring2;
    private double tinggiPrisma;

    // Konstruktor
    public PrismaSegitiga(double alas, double tinggiAlas, double sisiMiring1, double sisiMiring2, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.sisiMiring1 = sisiMiring1;
        this.sisiMiring2 = sisiMiring2;
        this.tinggiPrisma = tinggiPrisma;
    }

    // Menghitung luas alas segitiga
    public double luasAlas() {
        return (alas * tinggiAlas) / 2;
    }

    // Menghitung keliling alas segitiga
    public double kelilingAlas() {
        return alas + sisiMiring1 + sisiMiring2;
    }

    // Menghitung volume prisma
    public double volume() {
        return luasAlas() * tinggiPrisma;
    }

    // Menghitung luas permukaan prisma
    public double luasPermukaan() {
        return (2 * luasAlas()) + (kelilingAlas() * tinggiPrisma);
    }
}