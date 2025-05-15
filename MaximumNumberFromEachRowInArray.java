package javaProgramsPkg;

import java.util.Scanner;

public class MaximumNumberFromEachRowInArray {

	public static void main(String[] args) {
	//	1)find element which is lowest in row and highest in column ex: 7
	//6    3    1
	//9    7    8
	//2    4    5

	
		int numberOfRows,numberOfColumns;
		
		Scanner scanner = null;
		int[][] inputMatrixArray = null;
		
		try {
			
			scanner = new Scanner(System.in);
			System.out.println("Enter number of rows in matrix ");
			numberOfRows = scanner.nextInt();
			
			System.out.println("Enter number of columns in matrix");
			numberOfColumns = scanner.nextInt();
			
			inputMatrixArray = new int[numberOfRows][numberOfColumns];
			
			
			System.out.println(" Enter Matrix Elements : ");
			
			for(int i=0;i< inputMatrixArray.length;i++) {
				System.out.println("Enter numbers for rows-"+ (i+1));
				for(int j=0;j<inputMatrixArray[i].length;j++) {
					inputMatrixArray[i][j] = scanner.nextInt();
				}
			}
			
			for(int i=0;i< numberOfRows;i++) {
				for(int j=0;j<numberOfColumns;j++) {
					System.out.print(inputMatrixArray[i][j]+" ");
				}
				System.out.println();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		findMaxElementFromEachRowInMatrix(inputMatrixArray);
		
	}

	private static void findMaxElementFromEachRowInMatrix(int[][] inputMatrixArray) {
		int[] arrayToStoreMaxElementInEachRow = new int[inputMatrixArray.length];
		for(int i=0;i<inputMatrixArray.length;i++) {
			//initially assign first element of the row as maximum in first iteration
			int maxNumber = inputMatrixArray[i][0];
			for(int j=0;j<inputMatrixArray[i].length;j++) {
				if(maxNumber<inputMatrixArray[i][j]) {
					maxNumber = inputMatrixArray[i][j];
				}
				arrayToStoreMaxElementInEachRow[i] = maxNumber;
			}
		}
		//Printing maximum element in each row of the matrix
		for(int i=0;i<arrayToStoreMaxElementInEachRow.length;i++) {
			System.out.println("Maximum element in row number -"+(i+1)+ " is - "+ arrayToStoreMaxElementInEachRow[i]);
		}
	}
}
