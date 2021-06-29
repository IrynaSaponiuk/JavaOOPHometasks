package BasicIO;
import java.text.DecimalFormat;

public class Matrix {

    int row;
    int column;
    double[][] twoDimensionalArray;
    String mExc = "Incompatible matrix sizes";

    public Matrix(int row, int column) {
        this.twoDimensionalArray = new double[this.row][this.column];
        this.row = row;
        this.column = column;
    }

    Matrix matrix1;

    public Matrix(double[][] twoDimensionalArray) throws MatrixException {
        this.matrix1 = new Matrix(row, column);
        if (twoDimensionalArray.length == 0) {
            throw new MatrixException("Array passed with zero number of rows");
        }
        if (twoDimensionalArray[0].length == 0) {
            throw new MatrixException("Array passed with zero number of columns");
        }
        this.twoDimensionalArray = twoDimensionalArray;
        this.row = twoDimensionalArray.length;
        this.column = twoDimensionalArray[0].length;
    }

    public final int rows() {
        return this.row;
    }

    public final int columns() {
        return this.column;
    }

    public double[][] twoDimensionalArrayOutOfMatrix() {
        return matrix1.twoDimensionalArray;
    }

    public double getValue(int row, int column) throws MatrixException {
        if (row > twoDimensionalArray.length-1 || row <= 0
                || column > twoDimensionalArray[0].length-1 || column <= 0) {
            throw new MatrixException(mExc);
        }
        return matrix1.twoDimensionalArray[twoDimensionalArray.length-1][twoDimensionalArray[0].length-1];
    }

    public void setValue(int row, int column, double newValue) throws MatrixException {
        if (row > twoDimensionalArray.length-1 || row <= 0
                || column > twoDimensionalArray[0].length-1 || column <= 0) {
            throw new MatrixException(mExc);
        }
        this.row = row;
        this.column = column;
        this.matrix1.twoDimensionalArray[twoDimensionalArray.length-1][twoDimensionalArray[0].length-1] = newValue;
    }

    public Matrix addition(Matrix matrix) throws MatrixException {
        Matrix marr = new Matrix(twoDimensionalArray);
        Matrix tmp = new Matrix(marr.twoDimensionalArrayOutOfMatrix().length,
                matrix.twoDimensionalArrayOutOfMatrix()[0].length);
        if (marr.twoDimensionalArrayOutOfMatrix().length != matrix.twoDimensionalArrayOutOfMatrix().length
                || marr.twoDimensionalArrayOutOfMatrix()[0].length != matrix.twoDimensionalArrayOutOfMatrix()[0].length) {
            throw new MatrixException(mExc);
        } else {

            for (int i = 1; i < tmp.twoDimensionalArrayOutOfMatrix()[0].length; i++) {
                for (int j = 1; j < tmp.twoDimensionalArrayOutOfMatrix().length; j++) {
                    tmp.setValue(i, j, marr.getValue(i, j) + matrix.getValue(i, j));
                }
            }
        }
        return tmp;
    }

    public Matrix subtraction(final Matrix matrix) throws MatrixException {
        Matrix marr = new Matrix(twoDimensionalArray);
        Matrix tmp = new Matrix(marr.twoDimensionalArrayOutOfMatrix().length,
                matrix.twoDimensionalArrayOutOfMatrix()[0].length);
        if (marr.twoDimensionalArrayOutOfMatrix().length != matrix.twoDimensionalArrayOutOfMatrix().length
                || marr.twoDimensionalArrayOutOfMatrix()[0].length != matrix.twoDimensionalArrayOutOfMatrix()[0].length) {
            throw new MatrixException(mExc);
        } else {

            for (int i = 1; i < tmp.twoDimensionalArrayOutOfMatrix()[0].length; i++) {
                for (int j = 1; j < tmp.twoDimensionalArrayOutOfMatrix().length; j++) {
                    tmp.setValue(i, j, marr.getValue(i, j) - matrix.getValue(i, j));
                }
            }
        }
        return tmp;
    }

    public Matrix multiplication(final Matrix matrix) throws MatrixException {
        Matrix marr = new Matrix(twoDimensionalArray);
        if (marr.twoDimensionalArrayOutOfMatrix().length != matrix.twoDimensionalArrayOutOfMatrix()[0].length) {
            throw new MatrixException(mExc);
        } else {
            Matrix tmp;
            int marrVert = marr.twoDimensionalArrayOutOfMatrix().length;
            int matrHor = matrix.twoDimensionalArrayOutOfMatrix()[0].length;
            int matrVert = matrix.twoDimensionalArrayOutOfMatrix().length;
            double[][] tmpArr = new double[marrVert][matrHor];
            for (int i = 1; i < marrVert; i++) {
                for (int j = 1; j < matrHor; j++) {
                    for (int k = 1; k < matrVert; k++) {
                        tmpArr[i][j] += marr.getValue(i, k) * matrix.getValue(k, j);
                    }
                }
            }
            tmp = new Matrix(tmpArr);
            return tmp;
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.rows(); i++) {
            for (int j = 0; j < this.columns(); j++) {
                try {
                    if (j != this.columns() - 1) {
                        builder.append(decimalFormat.format(getValue(i, j)) + " ");
                    } else {
                        builder.append(decimalFormat.format(getValue(i, j)));
                    }
                } catch (MatrixException e) {
                    e.getMessage();
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
