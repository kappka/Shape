/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SHAPE;

/**
 *
 * @author Teti
 */
class Tabung extends BangunRuang {
    double radius, tinggi;

    Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }
}
