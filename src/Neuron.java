package src;
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
        if(this.inputs.length == this.weights.length){
            for(int i = 0; i < this.inputs.length; i++){
                output += (this.inputs[i] * this.weights[i]);
            }
            
            output += this.bias;
            return output;
        } else {
            System.out.println("Error: number of inputs and weights don't match");
            return 0;
        }
    }
}
