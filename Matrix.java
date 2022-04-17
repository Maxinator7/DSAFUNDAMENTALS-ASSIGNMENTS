package feb2022dsafundamentals;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {
	
 int array [] [] = { { 1,2,3 },{ 4,5,6 },{ 7,8,9}};
	 // using for loop method             
	 for (int i=0;i<array.length;i++) {
		 for(int j=0;j<array[i].length;j++) {
	 System.out.print(array[i][j]+ " ");
		 }
		 System.out.println();
	 }     
 
 System.out.println(Arrays.deepToString(array));
 
 
 // transposing matrix 
 
 int transpose [][] = new int [3][3];
 
 for(int i=0;i<3;i++) {
	 for(int j=0;j<3;j++) {
		 
		 transpose[i][j]=array[j][i];
		 
		 
		
		 
	 }
	 
 }
 

 
 for (int i=0;i<transpose.length;i++) {
	 for(int j=0;j<transpose[i].length;j++) {
	 System.out.print(transpose[i][j]+ " ");
	 }
	 System.out.println();
	 }
 System.out.println(Arrays.deepToString(transpose));
	}

}
