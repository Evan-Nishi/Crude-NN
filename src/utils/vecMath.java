package utils;

//TODO: check and calculate for uneven vector sizes
public class vecMath {
    public static double dotProduct(double[] a, double[] b){
        double res = 0;
        for (int i = 0; i < a.length; i++){
            res += (a[i] * b[i]);
        }
        return res;
    }
}
