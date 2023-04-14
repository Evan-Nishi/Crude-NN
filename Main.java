import utils.matrixMath;
import network.Layer;
public class Main{
    public static void main(String[] args){
        double[][] test = {{1,2,3,4,5}, {6,7,8,9,10}, {1,2,3,4,5}, {6,7,8,9,10}};
        double[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        double[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
        matrixMath.printMatrix(test);
        System.out.println("____________");
        test = matrixMath.transpose(test);
        matrixMath.printMatrix(test);
        System.out.println("_____________");
        matrixMath.printMatrix(matrixMath.dotProduct(firstMatrix, secondMatrix));
        System.out.println("____________");
        Layer testLayer = new Layer(2, 3);

       
    }
}