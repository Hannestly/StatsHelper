import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class stats {


    public static void main(String[] args){
        double data;
        ArrayList<Double> dataSet = new ArrayList();
        int inputCounter=0;


        System.out.println("Please enter the values one at a time, press non numerical digit to stop");
        Scanner dataInput = new Scanner(System.in);

        while(dataInput.hasNextDouble()){
            data = dataInput.nextDouble();
            dataSet.add(data);
            inputCounter++;
        }
        double[] dataDoub = new double[dataSet.size()];
        for(int i = 0; i< dataSet.size(); i++){
            dataDoub[i] = dataSet.get(i);
        }
        Arrays.sort(dataDoub);
        System.out.println("The sorted list of the items you entered: ");
        for (int j = 0; j< dataDoub.length; j++){
            System.out.print(dataDoub[j] + " ");
        }

        System.out.println("\n and the total items listed are: " + inputCounter);

        System.out.println("the mean value of the items listed are: " + "\t\t"+ meanValue(dataDoub,inputCounter));
        System.out.println("the median value of the items listed is (Q2): " +"\t" +medianValue(dataDoub, inputCounter));
        System.out.println("the lower quartile of the items is (Q1): " + "\t\t" + qOne(dataDoub,inputCounter));
        System.out.println("the upper quartile of the item is (Q3): " + "\t\t" + qThree(dataDoub,inputCounter));
    }

    public static double meanValue(double[] data, int counter){
        double Total=0;
        double mean;

        for(double input : data){
            Total += input;
        }
        mean = Total/ counter;
        return mean;
    }

    public static double medianValue(double[] data, int counter){
        if ((counter%2) == 0){
            return (data[(counter/2)-1] + data[(counter/2)])/2;
        }else{
            return data[(counter/2)];
        }
    }

    public static double qOne(double[] data, int counter) {
            return data[counter/4];
    }

    public static double qThree(double[] data, int counter){
        return data[counter*3/4];
    }
}

