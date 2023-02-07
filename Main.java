import src.Neuron;
import src.Layer;


public class Main{
    public static void main(String[] args){
        double[] inputs = {1,2,3};
        double[] weights = {0.2,0.8,-0.5};
        Neuron test1 = new Neuron(2, inputs, weights);
        System.out.println(test1.outPut());
    }
}