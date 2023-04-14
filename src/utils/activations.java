package utils;

public class activations {
    public static double Sigmoid(double x){
        return (1/(1 + Math.pow(Math.E, -x)));
    }

    public static double Gaussian(double x){
        //TODO: Implement normal distribution
        return 0.0;
    }
}
