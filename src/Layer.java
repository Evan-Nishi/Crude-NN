
import java.util.ArrayList;

public class Layer {
    ArrayList<Neuron> nodes;

    public void add(Neuron node){
        this.nodes.add(node);
    }
    
    public double[] calculateLayer(){
        double[] layerOutput = new double[this.nodes.size()];
        for(int i = 0; i < nodes.size(); i++){
            layerOutput[i] = nodes.get(0).outPut();
        }
        return layerOutput;
    }

    //make batch funct
}
