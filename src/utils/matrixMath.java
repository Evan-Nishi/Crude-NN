package utils;

public class matrixMath {
    public static double[][] dotProduct(double[][] x, double[][] y){
        double[][] res = new double[x.length][y[0].length];
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < y[i].length; j++){
                for(int k = 0; k < y.length; k++){
                    res[i][j] += (x[i][j] * y[i][j]);
                }
            }
        }
        return res;
    }
    public static double[][] transpose(double[][] arr){
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        double[][] res = new double[arr[0].length][arr.length];
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    res[j][i] = arr[i][j];
                }
            }
        return res;
    }

    public static void printMatrix(double[][] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("],");
        }
    }
}
