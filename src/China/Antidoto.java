/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package China;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Antidoto {

    private double num1;
    private double num2;
    private double res;

    public void operaciones() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        setNum1(scr.nextDouble());
        System.out.println("Introduzca el segundo numero");
        setNum2(scr.nextDouble());

        suma(getNum1(), getNum2());

        resta(getNum1(), getNum2());

        multiplicacion(getNum1(), getNum2());

        division(getNum1(), getNum2());

    }

    private void division(double num1, double num2) {
        setRes(num1 / num2);
        System.out.println("division: " + getRes());
    }

    private void multiplicacion(double num1, double num2) {

        setRes(num1 * num2);
        System.out.println("multiplicacion: " + getRes());
    }

    private void resta(double num1, double num2) {
        setRes(num1 - num2);
        System.out.println("resta: " + getRes());
    }

    private void suma(double num1, double num2) {
        setRes(num1 + num2);
        System.out.println("suma: " + getRes());
    }

    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    /**
     * @return the res
     */
    public double getRes() {
        return res;
    }

    /**
     * @param res the res to set
     */
    public void setRes(double res) {
        this.res = res;
    }


}
