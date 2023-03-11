import utils.vecMath;
public class Neuron {
    double bias;
    double[] inputs;
    double[] weights;

    public Neuron(double bias, double[] inputs, double[] weights) {
        this.bias = bias;
        if(inputs.length == weights.length){
            this.inputs = inputs;
            this.weights = weights;
        } else {
            //TODO: this should be an exception
            System.out.println("Error: number of inputs and weights don't match");
        }
    }
    
    public double outPut(){
        double output = 0;
        output = vecMath.dotProduct(this.inputs, this.weights);
        output += this.bias;
        return output;

    }
}
