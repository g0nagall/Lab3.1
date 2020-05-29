package com.company;

public class Formula {
    private double x;
    private double y;
    private double z;
    private double result;
    public void set(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;

    }
    public void run() {
        result = ((Math.pow((8+Math.pow(Math.abs(x-y),2)+1), 1/3))
                /(Math.pow(x,2)+Math.pow(y,2)+2)) -
                (Math.pow(2.71,Math.abs(x-y))*Math.pow((Math.pow(Math.tan(z),2)+1),x));
    }
    public void print() {
        System.out.printf("Результат: " +result);
    }
}
