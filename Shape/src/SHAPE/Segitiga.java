/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SHAPE;

/**
 *
 * @author Teti
 */
class Segitiga extends BangunDatar {
    double alas, tinggi, sisi1, sisi2, sisi3;

    Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public double keliling() {
        return sisi1 + sisi2 + sisi3;
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2;
    }
}
