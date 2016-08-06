package RandomProblems;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 8/5/16.
 */
public class MatrixMultiplication {
    public static void main(String[] args) {
        //first rule the no of columns in first matrix must be equal to the number of rows in the second matrix
        Scanner scan = new Scanner(System.in);
        int r1, c1, r2, c2;
        System.out.println("Enter the size of matrix 1");
        r1 = scan.nextInt();
        c1 = scan.nextInt();
        System.out.println("Enter the size of matrix 2");
        r2 = scan.nextInt();
        c2 = scan.nextInt();
        int[][] mat1 = new int[r1][c1];
        int[][] mat2 = new int[r2][c2];
        int[][] result = new int[r1][c2];

        System.out.println("Enter the values for the first matrix");
        //filling matrix 1
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                mat1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the values for the second matrix");
        //filling matrix 1
        for(int i = 0;i<r2;i++){
            for(int j = 0;j<c2;j++){
                mat2[i][j] = scan.nextInt();
            }
        }

        System.out.println("Multiplying");
        if(c1 != r2 ){
            System.out.println("Cannot multiply");
        }
        else {
            int tempSum = 0;
            for(int i = 0;i<r1;i++){
                for(int j = 0;j<c2;j++){
                tempSum = 0;
                    for(int k = 0;k<r2;k++){
                    tempSum = tempSum+mat1[i][k]*mat2[k][j];
                }
                    result[i][j] = tempSum;
                }
            }

            System.out.println("Resultant matrix is : ");

            for(int i = 0;i<r1;i++){
                for(int j = 0;j<c2;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }


        }
        System.out.println("Time complexity of this algorithm will be - O(r1*c2*r2)");
    }

}
