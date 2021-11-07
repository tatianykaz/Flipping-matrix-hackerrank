package main;

import java.util.Arrays;
import java.util.List;

public class Flip {

	/*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
    	
    	Integer sum = 0;
    	Integer n = matrix.get(0).size();
    	
    	//Knowing that flipping rows and columns, 
    	//each position can be replaced by three other positions of the matrix only:
    	
    	for (int i=0; i < n/2;i++){
			for(int j=0; j < n/2; j++) {
				List<Integer> possibleSubstitutes = Arrays.asList(
													matrix.get(i).get(j),
													matrix.get(n - i - 1).get(j),
													matrix.get(i).get(n-j-1),
													matrix.get(n-1-i).get(n-1-j)
													);
				sum += possibleSubstitutes.stream().max(Integer::compare).get();
			}
		}
    	
    	return sum;

    }

}
