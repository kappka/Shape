/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SHAPE;

/**
 *
 * @author Teti
 */
class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}
