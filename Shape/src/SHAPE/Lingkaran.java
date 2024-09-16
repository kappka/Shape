/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SHAPE;

/**
 *
 * @author Teti
 */
class Lingkaran extends BangunDatar {
    double radius;

    Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double luas() {
        return Math.PI * radius * radius;
    }
}
