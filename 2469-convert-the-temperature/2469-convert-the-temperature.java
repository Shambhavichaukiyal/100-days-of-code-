class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin=celsius+273.15000;
        double Fahrenheit = celsius * 1.80000+ 32.00000;
        double a[]=new double[2];
        a[0]=kelvin;
        a[1]=Fahrenheit;
        return a;
    }
}