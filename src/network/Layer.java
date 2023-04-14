package network;
import java.util.Random;

public class Layer {
    double[][] weights;
    double[][] biases;

    Random random = new Random();

    public Layer(int inputs, int neurons){
        weights = new double[inputs][neurons];
        for(int i = 0; i < inputs; i++){
            System.out.print('[');
            for(int j = 0; j < neurons; j++){
                //TODO: implement normal distribution from scratch
                weights[i][j] = 0.1 * random.nextGaussian();
                System.out.print(weights[i][j] + "," );
            }
            System.out.println(']');
        }

        
    }

}
