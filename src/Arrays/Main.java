package Arrays;

public class Main {

    public static int[] task1(int[] array) {
        int tmp;
        for (int i=0; i<array.length/2; i++) {
            if (array[i]%2==0 && array[array.length-1-i]%2==0) {
                tmp = array[i];
                array[i]=array[array.length-1-i];
                array[array.length-1-i]=tmp;
            }
        }
        return array;
    }

    public static int task2(int[] array) {
        int count = -1;
        int maxValue = array[0];
        int max = Integer.MIN_VALUE;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                if ((array[i]==array[j])&&(array[i]>maxValue)&&(array[j]>maxValue)){
                    count = j;
                }
                max=Math.max(count-i, max);
            }
        }

        return max;
    }


    public static int[][] task3(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++){
                if (i>j){
                    matrix[i][j]=1;
                }
                if (j>i){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }

}
