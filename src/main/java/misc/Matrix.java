package misc;

/**
 * Created by bvenkatesan on 7/13/17.
 */
public class Matrix {

    public void setToZero(int[][] matrix) {
        int len = matrix.length;
        int len1 = matrix[0].length;

        int[] row = new int[len];
        int[] column = new int[len1];

        for(int i=0;i<len;i++) {
            for(int j=0;j<len1;j++){
                if(matrix[i][j] == 0) {
                    row[i]=1;
                    column[j]=1;
                }
            }
        }

        for(int i=0;i<len;i++) {
            for(int j=0;j<len1;j++){
                if(row[i]==1 || column[j] == 1) {
                    System.out.println("0");
                } else {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrixValue = new int[3][3];

        matrixValue[0][0]=1;
        matrixValue[0][1]=1;
        matrixValue[0][2]=0;

        matrixValue[1][0]=1;
        matrixValue[1][1]=1;
        matrixValue[1][2]=1;

        matrixValue[2][0]=1;
        matrixValue[2][1]=1;
        matrixValue[2][2]=1;

        Matrix matrix = new Matrix();
        matrix.setToZero(matrixValue);
    }
}
